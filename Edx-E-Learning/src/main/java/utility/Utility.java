package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void main(String[] args) {
		
	}
	
	WebDriver driver;
	public void capturescreenshot() throws IOException
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
	    File src= ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("path of excel");
	    FileHandler.copy(src, dest);
	    
		
		
	}
	
	public void getDateFromExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP FOLIO 9480\\Desktop\\simple.xlsx");
		//String value = WorkbookFactory.create(fis).getSheet("name").getRow(0).getCell(0).getStringCellValue();
		Sheet sheet = WorkbookFactory.create(fis).getSheet("SampleData");
		int rowno = sheet.getLastRowNum();
	
		System.out.println(rowno);
		for(int i=0; i<=rowno; i++)
		{
			String value = sheet.getRow(rowno).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
	}
	

}
