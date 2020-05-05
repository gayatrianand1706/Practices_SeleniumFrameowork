package CommonFunctions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public  class ExcelUtil {
	

	static Workbook book;
	static Sheet sheet;
	
	public static String  TESTDATA_SHEET_PATH="C:\\SeleniumAutomation\\Practices_SeleniumFrameowork\\Testdata\\Testdata.xlsx";
	public static Object[][] getTestData(String sheetName)
	{
	    FileInputStream fis=null;
	    try
	    {
	        fis= new FileInputStream(TESTDATA_SHEET_PATH);
	    }
	    catch(FileNotFoundException e)
	    {
	        e.printStackTrace();
	    }
	    try
	    {
	        book=WorkbookFactory.create(fis);
	    }
	    catch(InvalidFormatException e)
	    {
	        e.printStackTrace();
	    }
	    catch(IOException e)
	    {
	        e.printStackTrace();
	    }
	     catch(NullPointerException e)
	    {
	         e.printStackTrace();
	    }
	    sheet = book.getSheet(sheetName);

	    Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	    for(int i=0;i<sheet.getLastRowNum();i++)
	    {
	        for(int k=0;k<sheet.getRow(0).getLastCellNum(); k++)
	        {
	            data[i][k]=sheet.getRow(i + 1).getCell(k).toString();
	        }
	    }
	    return data;
	}

	    }
