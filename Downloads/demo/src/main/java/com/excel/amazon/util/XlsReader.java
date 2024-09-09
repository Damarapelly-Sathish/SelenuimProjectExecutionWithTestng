package com.excel.amazon.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class XlsReader {
    private Workbook workbook;

    public XlsReader(String excelFilePath) throws IOException, InvalidFormatException {
        try (FileInputStream fis = new FileInputStream(excelFilePath)) {
            this.workbook = WorkbookFactory.create(fis);
        }
    }
     
    
    public int getRowCount(String sheetName) {
    	Sheet sheet1 = workbook.getSheet(sheetName);
    	if (sheet1 == null) {
            throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");}
    	return sheet1.getPhysicalNumberOfRows();
    	
    }
    public String getCellValue(String sheetName, int rowIndex, int colIndex) {
    	Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");
        }
        Row row = sheet.getRow(rowIndex);
        if (row == null) {
            throw new IllegalArgumentException("Row with index " + rowIndex + " does not exist.");
        }
        Cell cell = row.getCell(colIndex);
        if (cell == null) {
            return "";
        }
        return cell.toString();
    }

    public void close() throws IOException {
        if (workbook != null) {
            ((FileInputStream) workbook).close();
        }
    }
}
