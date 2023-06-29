package com.Serviceobjectmodel.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.Serviceobjectmodel.constants.Constants;

public class ExcelRead {
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet sh;

	public static String getCellStringData(int RowNum, int ColNum, String Sheet) {

		try {
			f = new FileInputStream(Constants.CONFIGPATH_EXCELREADER);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		try {
			w = new XSSFWorkbook(f);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		sh = w.getSheet(Sheet);
		Row r = sh.getRow(RowNum);
		Cell c = r.getCell(ColNum);
		return c.getStringCellValue();

	}

	public static int getCellNumericData(int RowNum, int ColNum, String Sheet) {
		try {
			f = new FileInputStream(Constants.CONFIGPATH_EXCELREADER);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		try {
			w = new XSSFWorkbook(f);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		sh = w.getSheet(Sheet);
		return (int) sh.getRow(RowNum).getCell(ColNum).getNumericCellValue();

	}

}