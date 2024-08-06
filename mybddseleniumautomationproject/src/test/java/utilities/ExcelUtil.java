package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static void main(String[] args) throws IOException {
		Object[][] obj=readDataFromExcel("testdata/mytestdata.xlsx", "LoginData");
		for(int i=0;i<obj.length;i++) {
			for(int j=0;j<obj[i].length;j++) {
				System.out.println(obj[i][j]);
			}
		}
		
//		//Get the workbook
//		XSSFWorkbook workbook=new XSSFWorkbook("testdata/mytestdata.xlsx");
//
//		//Get the sheet
//		XSSFSheet sheet=workbook.getSheet("LoginData");
//
//		int rowCount=sheet.getLastRowNum();
//		System.out.println("Row count:="+rowCount);
//		//Get the row
//		XSSFRow row=sheet.getRow(2);
//
//		int columnCount=row.getLastCellNum();
//		System.out.println("Column count:="+columnCount);
//
//		//Create two dimensional object array
//		Object[][] obj=new Object[rowCount][columnCount];
//
//		//Get the cell
//		XSSFCell cell=row.getCell(1);
//
//		//Get the cell content
//		System.out.println(cell.getStringCellValue());
//
//		for(int i=0;i<=rowCount;i++) {
//			XSSFRow myrow=sheet.getRow(i);
//			System.out.println(myrow.getCell(0).getStringCellValue());
//			System.out.println(myrow.getCell(1).getStringCellValue());
//		}
//
//		System.out.println("*****Another forloop*****");
//		for(int i=1;i<=rowCount;i++) {
//			XSSFRow myrow=sheet.getRow(i);
//			int myColumnCount=myrow.getLastCellNum();
//			for(int j=0;j<myColumnCount;j++) {
//				System.out.println(myrow.getCell(j).getStringCellValue());
//				obj[i-1][j]=myrow.getCell(j).getStringCellValue();
//			}
//
//		}
//
//		System.out.println("***Reading the data from obj array****");
//		for(int i=0;i<obj.length;i++) {
//			for(int j=0;j<obj[i].length;j++) {
//				System.out.println(obj[i][j]);
//			}
//		}
//
//
//		workbook.close();



	}


	public static Object[][] readDataFromExcel(String excelSheetPath,String sheetName) throws IOException {
		//Get the workbook
		XSSFWorkbook workbook=new XSSFWorkbook(excelSheetPath);

		//Get the sheet
		XSSFSheet sheet=workbook.getSheet(sheetName);

		int rowCount=sheet.getLastRowNum();
		
		//Get the row
		XSSFRow row=sheet.getRow(0);

		int columnCount=row.getLastCellNum();

		//Create two dimensional object array
		Object[][] obj=new Object[rowCount][columnCount];

		for(int i=1;i<=rowCount;i++) {
			XSSFRow myrow=sheet.getRow(i);
			int myColumnCount=myrow.getLastCellNum();
			for(int j=0;j<myColumnCount;j++) {
				obj[i-1][j]=myrow.getCell(j).getStringCellValue();
			}

		}
		
		workbook.close();
		return obj;
	}

}
