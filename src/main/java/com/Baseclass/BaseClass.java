
package com.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static String value;
	

	public static WebDriver webDriverLaunch(String driverName)
	{
		if(driverName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(driverName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}
	
	public static void urlLaunch(String url)
	{
		driver.get(url);
	}
	
	
	public static void clickingElement(WebElement element)
	{
		element.click();
	}
	
	
	public static void sendKeys(WebElement element, String keys) 
	{
		element.sendKeys(keys);
	}
	
	
	public static void getTitle() 
	{
		System.out.println(driver.getTitle());
	}
	
	
	public static void dropDown(WebElement element, String selectType, String value)
	{
		Select s =new Select(element);
		
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getOptions();
		for(WebElement k: options)
		{
			System.out.println(k.getText());
		}
		
		if(selectType.equalsIgnoreCase("byValue"))
		{
			s.selectByValue(value);
		}
		if(selectType.equalsIgnoreCase("byVisisbleText"))
		{
			s.selectByVisibleText(value);
		}
		if(selectType.equalsIgnoreCase("byIndex"))
		{
			int text = Integer.parseInt(value);
			s.selectByIndex(text);
		}

	}
	
	
	public static void screenShot(String imageName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\91888\\eclipse-workspace\\AutomationPractice\\Screenshot\\auto.png");
		FileHandler.copy(source, destination);
	}
	
	public static String excelReading(String path, int rownum, int cellnum) throws IOException
	{
		File f= new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType ct = cell.getCellType();
		if(ct.equals(CellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			value = stringCellValue;
		}
		else if (ct.equals(CellType.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			int num = (int)numericCellValue;
			value = String.valueOf(num);
		}
		return value;	
	}
	
	
	
	public static void closeTab() 
	{
		driver.close();
	}
	
	public static void quitBrowser()
	{
		driver.quit();
	}
	

	
}
