package org.Maven_Project;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven_read_excel {
	  private static void data_Readexcel() throws Throwable{
	   
		// Read Excel - Fetch the data
		   
		File f = new File("C:\\Users\\Jaya surya\\eclipse-workspace\\Maven_Project\\Excel\\Test case template 02.xlsx");
		FileInputStream fis = new FileInputStream(f); 
		Workbook b = new XSSFWorkbook(fis);    //upcasting
		Sheet sheetAt = b.getSheetAt(1);
		Row row = sheetAt.getRow(4);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			String scv = cell.getStringCellValue();
			System.out.println(scv);
		}
		else if (cellType.equals(CellType.NUMERIC)) {
		    double ncv = cell.getNumericCellValue();
		    int val = (int) ncv;        //small to big -----> narrowing
		    System.out.println(val);    
		}
	  }
       private static void multiple_Data_readexcel() throws Throwable {
    	   
    	File fi = new File("C:\\Users\\Jaya surya\\eclipse-workspace\\Maven_Project\\Excel\\Test case template 02.xlsx");
   		FileInputStream fis = new FileInputStream(fi); 
   		Workbook b = new XSSFWorkbook(fis);    	
   		Sheet sheetAt = b.getSheetAt(2);
   		
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
		    Row row = sheetAt.getRow(i);
		    
	    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		    Cell cell = row.getCell(j);
		    CellType cellType = cell.getCellType();
	
		if (cellType.equals(CellType.STRING)) {
			String scv1 = cell.getStringCellValue();
			System.out.println(scv1);	
		}	   
		else if (cellType.equals(CellType.NUMERIC)) {
			double ncv1 =cell.getNumericCellValue();
			int va = (int) ncv1;
			System.out.println(va);	
		}	
		}	
		}   	    	
			}
       public static void main(String[] args) throws Throwable {
	   System.out.println("jayasurya");
	   data_Readexcel();
	   multiple_Data_readexcel();
}			
}		

