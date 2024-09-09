package com.flipkart.qa.test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.excel.amazon.util.XlsReader;

public class getTestData {
public static ArrayList<Object[]> getdata() throws InvalidFormatException, IOException{
	ArrayList<Object[]> list=new ArrayList<Object[]>();
	XlsReader reader=new XlsReader("C:\\Users\\Ashok\\Downloads\\New XLSX Worksheet.xlsx");
	for(int i=1;i<reader.getRowCount("Sheet1");i++) {
		String fname=reader.getCellValue("Sheet1", i, 0);
		String lname=reader.getCellValue("Sheet1", i, 1);
		String job=reader.getCellValue("Sheet1", i, 2);
		Object[] obj= {fname,lname,job};
		list.add(obj);
	}
	return list;
}
}
