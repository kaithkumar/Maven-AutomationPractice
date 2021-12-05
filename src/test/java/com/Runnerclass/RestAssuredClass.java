/**
 * 
 */
package com.Runnerclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import com.Baseclass.BaseClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author 91888
 *
 */
public class RestAssuredClass extends BaseClass
{
	public static String value;
	public static int postmanNumber;
	
	public static void main(String[] args) throws IOException {
		
	
	for(int i=1;i<8;i++)
	{
		File f= new File ("C:\\Users\\91888\\eclipse-workspace\\AutomationPractice\\StatusCodes\\Status code.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(i);
		Cell cell = row.getCell(1);
		CellType c = cell.getCellType();
		if(c.equals(CellType.STRING))
		{
			 value = cell.getStringCellValue();
		}
		else if(c.equals(CellType.NUMERIC))
		{
			double du = cell.getNumericCellValue();
			int num = (int)du;
			value = String.valueOf(num);
		}
		
		
		Cell cell2 = row.getCell(2);
		CellType cellType = cell2.getCellType();
		if(cellType.equals(CellType.STRING))
		{
			 String v1 = cell2.getStringCellValue();
			postmanNumber=Integer.parseInt(v1);
		}
		else if(cellType.equals(CellType.NUMERIC))
		{
			double du = cell2.getNumericCellValue();
			int num = (int)du;
		    postmanNumber=num;
		}
		
		String[] split = value.split(".com");
		String uri=split[0].concat(".com");
		String url =split[1];
		RestAssured.baseURI=uri;
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get(url);
		int statusCode = response.getStatusCode();
		System.out.println(postmanNumber);
		System.out.println(value + " " + statusCode);
		Assert.assertEquals(statusCode,postmanNumber );
		System.out.println();

	}

}
}
