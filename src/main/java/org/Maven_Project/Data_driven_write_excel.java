package org.Maven_Project;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven_write_excel {
        private static void write_Data() throws Throwable {

     	File f = new File("C:\\Users\\Jaya surya\\eclipse-workspace\\Maven_Project\\Excel\\Test case template 02.xlsx");
   		FileInputStream fis = new FileInputStream(f); 
   		Workbook wb = new XSSFWorkbook(fis);	 
        	 
//  	Sheet createSheet = wb.createSheet("jaya write excel");
//      Row createRow = createSheet.createRow(0);
//      Cell createCell = createRow.createCell(0);
//      createCell.setCellValue("username");
        	 
        wb.createSheet("jaya write excel").createRow(0).createCell(0).setCellValue("username");
        wb.getSheet("jaya write excel").getRow(0).createCell(1).setCellValue("password");
        wb.getSheet("jaya write excel").getRow(0).createCell(2).setCellValue("pass");
        wb.getSheet("jaya write excel").createRow(1).createCell(0).setCellValue("maven");
        wb.getSheet("jaya write excel").getRow(1).createCell(1).setCellValue("ghyth");
        wb.getSheet("jaya write excel").getRow(1).createCell(2).setCellValue("word");
        wb.getSheet("jaya write excel").createRow(2).createCell(0).setCellValue("paord");
        wb.getSheet("jaya write excel").getRow(2).createCell(1).setCellValue("1234");
        	 
        FileOutputStream fos = new FileOutputStream(f);
        wb.write(fos);
        System.out.println("data add sucessfully");   	 
}
	    public static void main(String[] args) throws Throwable {
		write_Data();
	    }	
}
