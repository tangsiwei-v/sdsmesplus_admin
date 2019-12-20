package com.uspring.sdsmesplus.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 从EXCEL导入到数据库 创建人：FH 创建时间：2014年12月23日
 * 
 * @version
 */
public class ObjectExcelRead {

	/**
	 * @param filepath 文件路径
	 * @param filename 文件名
	 * @param startrow 开始行号
	 * @param startcol 开始列号
	 * @param sheetnum sheet
	 * @return list
	 */
	public static List<Object> readExcel(String filepath, String filename, int startrow, int startcol, int sheetnum) {
		List<Object> varList = new ArrayList<Object>();

		try {
			File target = new File(filepath, filename);
			FileInputStream fi = new FileInputStream(target);
			HSSFWorkbook wb = new HSSFWorkbook(fi);
			HSSFSheet sheet = wb.getSheetAt(sheetnum); // sheet 从0开始
			int rowNum = sheet.getLastRowNum() + 1; // 取得最后一行的行号

			for (int i = startrow; i < rowNum; i++) { // 行循环开始

				Map<String, Object> varpd = new HashMap<String, Object>();
				HSSFRow row = sheet.getRow(i); // 行
				int cellNum = row.getLastCellNum(); // 每行的最后一个单元格位置

				for (int j = startcol; j < cellNum; j++) { // 列循环开始

					HSSFCell cell = row.getCell(Short.parseShort(j + ""));
					String cellValue = null;
					if (null != cell) {
						switch (cell.getCellType()) { // 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
						case 0:
							String val = cell.getNumericCellValue() + "";
							if (val.indexOf(".0") > 1) {
								// 则为int类型
								cellValue = String.valueOf((int) cell.getNumericCellValue());
							} else {
								// double
								cellValue = cell.getNumericCellValue() + "";
							}
							break;
						case 1:
							cellValue = cell.getStringCellValue();
							break;
						case 2:
							cellValue = cell.getNumericCellValue() + "";
							// cellValue =
							// String.valueOf(cell.getDateCellValue());
							break;
						case 3:
							cellValue = "";
							break;
						case 4:
							cellValue = String.valueOf(cell.getBooleanCellValue());
							break;
						case 5:
							cellValue = String.valueOf(cell.getErrorCellValue());
							break;
						}
					} else {
						cellValue = "";
					}

					varpd.put("var" + j, cellValue);

				}
				varList.add(varpd);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return varList;
	}

	// 文件导入 （2007及以上）
	public static List<Object> readExcelX(InputStream is, int startrow, int startcol, int sheetnum) {
		List<Object> varList = new ArrayList<Object>();

		try {
			/*
			 * File target = new File(filepath, filename); FileInputStream fi = new
			 * FileInputStream(target);
			 */
			Workbook wb = new XSSFWorkbook(is);
			XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(sheetnum); // sheet 从0开始
			int rowNum = sheet.getLastRowNum() + 1; // 取得最后一行的行号

			for (int i = startrow; i < rowNum; i++) { // 行循环开始

				Map<String, Object> varpd = new HashMap<String, Object>();
				XSSFRow row = sheet.getRow(i); // 行
				int cellNum = row.getLastCellNum(); // 每行的最后一个单元格位置

				for (int j = startcol; j < cellNum; j++) { // 列循环开始

					XSSFCell cell = row.getCell(Short.parseShort(j + ""));
					String cellValue = null;
					if (null != cell) {
						switch (cell.getCellType()) { // 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
						case 0:
							Long longVal = Math.round(cell.getNumericCellValue());
							Double doubleVal = cell.getNumericCellValue();
							if (Double.parseDouble(longVal + ".0") == doubleVal) { // 判断是否含有小数位.0
								cellValue = longVal + "";
							} else {
								cellValue = doubleVal + "";
							}
							break;
						case 1:
							cellValue = cell.getStringCellValue();
							break;
						case 2:
							cellValue = cell.getNumericCellValue() + "";
							// cellValue =
							// String.valueOf(cell.getDateCellValue());
							break;
						case 3:
							cellValue = "";
							break;
						case 4:
							cellValue = String.valueOf(cell.getBooleanCellValue());
							break;
						case 5:
							cellValue = String.valueOf(cell.getErrorCellValue());
							break;
						}
					} else {
						cellValue = "";
					}

					varpd.put("var" + j, cellValue);

				}
				varList.add(varpd);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return varList;
	}

	// 文件导入（2003及2007）
	public static List<Object> readExcelH(InputStream is, int startrow, int startcol, int sheetnum) {
		List<Object> varList = new ArrayList<Object>();

		try {
			/*
			 * File target = new File(filepath, filename); FileInputStream fi = new
			 * FileInputStream(target);
			 */
			Workbook wb = new HSSFWorkbook(is);
			HSSFSheet sheet = (HSSFSheet) wb.getSheetAt(sheetnum); // sheet 从0开始
			int rowNum = sheet.getLastRowNum() + 1; // 取得最后一行的行号

			for (int i = startrow; i < rowNum; i++) { // 行循环开始

				Map<String, Object> varpd = new HashMap<String, Object>();
				HSSFRow row = sheet.getRow(i); // 行
				int cellNum = row.getLastCellNum(); // 每行的最后一个单元格位置

				for (int j = startcol; j < cellNum; j++) { // 列循环开始

					HSSFCell cell = row.getCell(Short.parseShort(j + ""));
					String cellValue = null;
					if (null != cell) {
						switch (cell.getCellType()) { // 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
						case 0:
							Long longVal = Math.round(cell.getNumericCellValue());
							Double doubleVal = cell.getNumericCellValue();
							if (Double.parseDouble(longVal + ".0") == doubleVal) { // 判断是否含有小数位.0
								cellValue = longVal + "";
							} else {
								cellValue = doubleVal + "";
							}
							break;
						case 1:
							cellValue = cell.getStringCellValue();
							break;
						case 2:
							cellValue = cell.getNumericCellValue() + "";
							// cellValue =
							// String.valueOf(cell.getDateCellValue());
							break;
						case 3:
							cellValue = "";
							break;
						case 4:
							cellValue = String.valueOf(cell.getBooleanCellValue());
							break;
						case 5:
							cellValue = String.valueOf(cell.getErrorCellValue());
							break;
						}
					} else {
						cellValue = "";
					}

					varpd.put("var" + j, cellValue);

				}
				if (!varpd.get("var1").equals("")) {
					varList.add(varpd);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return varList;
	}
}
