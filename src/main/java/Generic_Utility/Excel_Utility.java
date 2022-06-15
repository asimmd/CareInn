package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	/**
	 * This method is used to retrieve data from Excel 
	 * @author Shadab 
	 */
	public String getDatafromExcel(String path,String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String cellValue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	
	}
	/**
	 * This method is for retrieving data from excel using data format method
	 * @author Shadab
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public String getDatafromExcel2(String path,String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter formatter = new DataFormatter();
		return formatter.formatCellValue(wb.getSheet(sheet).getRow(row).getCell(cell));
		
	}
	
	
	public void insertDataIntoExcel(String path,String sheet,int row,int cell,String cellValue) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(cellValue);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		
		
	}

}

