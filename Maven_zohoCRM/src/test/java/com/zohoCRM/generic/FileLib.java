package com.zohoCRM.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public String getExceldata(String shtName,int row,int cell) throws IOException {


	 FileInputStream fis = new FileInputStream("./src/test/resources/data/TestData.xlsx");
	 Workbook wb=WorkbookFactory.create(fis);
	 String value=wb.getSheet(shtName).getRow(row).getCell(cell).getStringCellValue();
	 return value;
		
	}

}
