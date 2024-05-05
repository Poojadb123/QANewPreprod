package STY.IntelliConvo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xhtmlrenderer.pdf.ITextUserAgent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.configuration.Theme;
import com.lowagie.text.DocumentException;


public class ExtentReportNG extends BaseClass {
	public static ExtentTest test;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	//public static MediaEntityModelProvider mediaModel;

	
	public static ExtentReports extentReportGenerator()
	{
		String path =System.getProperty("user.dir")+"\\report\\IntelliconvoExtentReport2.html";
		reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation test");
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setTheme(Theme.DARK);
		//reporter.setAppendExisting(true);
		
		//reporter.config().setChartVisibilityOnOpen(true);

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		
		return extent;
	}

	 /*   public String PDFGenerator() throws FileNotFoundException, IOException, DocumentException {
	    	
	    	
	    	String htmlfilepath =System.getProperty("user.dir")+"\\report\\IntelliconvoExtentReport2.html";
	       
	        String pdfFilePath = System.getProperty("user.dir")+"\\report\\IntelliconvoExtentReport2.pdf";

	        // Create an ITextRenderer instance
	        ITextRenderer renderer = new ITextRenderer();
	        renderer.setDocument(htmlfilepath);


	     // Enable the use of local resources (e.g., CSS, images)
	        ITextUserAgent userAgent = new ITextUserAgent(renderer.getOutputDevice());
	        userAgent.setSharedContext(renderer.getSharedContext());
	        renderer.getSharedContext().setUserAgentCallback(userAgent);


	        // Generate the PDF
	        try (OutputStream outputStream = new FileOutputStream(pdfFilePath)) {
	            renderer.layout();
	            renderer.createPDF(outputStream);
	        }

	        System.out.println("Extent Report converted to PDF successfully!");
			return pdfFilePath;
	    }*/
	}
	
	

