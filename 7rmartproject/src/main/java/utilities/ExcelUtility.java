package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class ExcelUtility {
	
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
public static String readStringData(int row,int column,String sheet) throws IOException
{
	String filepath=Constants.TESTDATAFILE;
	f=new FileInputStream(filepath);
	w=new XSSFWorkbook(f); // to take the workbook from file f
	s=w.getSheet(sheet);              //to take sheet from the workbook
	XSSFRow r=s.getRow(row);
	XSSFCell c=r.getCell(column);
	return c.getStringCellValue();
}
public static String readIntegerData(int row,int column,String sheet) throws IOException
{
	String filepath=Constants.TESTDATAFILE;
	f=new FileInputStream(filepath);
	w=new XSSFWorkbook(f); // to take the workbook from file f
	s=w.getSheet(sheet);           //to take sheet from the workbook
	XSSFRow r=s.getRow(row);
	XSSFCell c=r.getCell(column);
	int a=(int) c.getNumericCellValue();
	return String.valueOf(a);
}
	
}



