package STY.IntelliConvo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
	public WebDriver driver;
	File file = new File("Test Data Excel/TestDataIntelliConvo.xlsx");//Read data From Excel Data
	FileInputStream fis = null;
	XSSFWorkbook xcel = null;
	XSSFSheet sht = null;
	
	public Map<String, Object> exceldata(String sheetName) {
		String nameOfsheet = sheetName;
		

		Map<String, Object> customer = null;
		try {
			fis = new FileInputStream(file);

			xcel = new XSSFWorkbook(fis);

			sht = xcel.getSheet(nameOfsheet);

			int noOfColumns = sht.getRow(0).getLastCellNum();

			customer = new HashMap<String, Object>();
			//System.out.println(sht.getPhysicalNumberOfRows());

			for (int i = 0; i < sht.getPhysicalNumberOfRows() - 1; i++) {

				for (int j = 0; j < noOfColumns; j++) {

					try {

						String header = sht.getRow(i).getCell(j).getStringCellValue();

						customer.put(header, new DataFormatter().formatCellValue(sht.getRow(i + 1).getCell(j)));

					} catch (Exception e) {
						System.out.println("NUll Data");

					}

				}
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				xcel.close();
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println(customer);
		return customer;

		// return customer;
	}

	public int getrowCount() {
		return sht.getLastRowNum();
	}

	public int getColCount() {
		return sht.getRow(0).getLastCellNum();

	}
	public Map<String, Map<String, String>> getExcelAsMap(String sheetName)  {
		String nameOfsheet = sheetName;		
        Map<String, Map<String, String>> customer = new HashMap<String, Map<String, String>>();
        List<String> columnHeader = new ArrayList<String>();
        try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			xcel = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sht = xcel.getSheet(nameOfsheet);

        Row row = sht.getRow(0);
        Iterator<Cell> cellIterator = row.cellIterator();
        while (cellIterator.hasNext()) {
            columnHeader.add(cellIterator.next().getStringCellValue());
        }
        int rowCount = sht.getLastRowNum();
        int columnCount = row.getLastCellNum();
        for (int i = 1; i <= rowCount; i++) {
            Map<String, String> singleRowData = new HashMap<String, String>();
            Row row1 = sht.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row1.getCell(j);
                singleRowData.put(columnHeader.get(j), getCellValueAsString(cell));
            }
            customer.put(String.valueOf(i), singleRowData);
        }
        return customer;
    }

	public String getCellValueAsString(Cell cell) {
        String cellValue = null;
        switch (cell.getCellType()) {
            case NUMERIC:
                cellValue = String.valueOf(new DataFormatter().formatCellValue(cell));
                break;
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            case BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case FORMULA:
                cellValue= cell.getCellFormula();
            case BLANK:
            	
                cellValue="BLANK";
            default:
                cellValue ="DEFAULT";
        }
        return cellValue;
    }

	public static String captureScreenShot(WebDriver driver, String name) {

		TakesScreenshot ts = (TakesScreenshot) driver;  //Capture the screenshot
		File source = ts.getScreenshotAs(OutputType.FILE);

		String filepath = System.getProperty("user.dir") + "\\Resource\\screenshots\\screenshot" + name + ".png";
		
	    File destination = new File(filepath);

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return filepath;
	}

}
