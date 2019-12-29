package com.uspring.sdsmesplus.common;

import java.io.OutputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFBorderFormatting;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class ExportXls {

	/**
	 * 导出数据
	 * 
	 * @param historyData 需要导出的数据
	 * @param response
	 * @param titleList   列名
	 * @param columnList  字段名
	 * @param fileName    文件名
	 */
	public static void exportXls(List<Map<String,Object>> historyData, HttpServletResponse response,
			List<String> titleList, List<String> columnList, String fileName) {
		try {

			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet();

			HSSFPalette customPalette = wb.getCustomPalette();
			customPalette.setColorAtIndex(HSSFColor.SEA_GREEN.index, (byte) 145, (byte) 183, (byte) 206);
			customPalette.setColorAtIndex(HSSFColor.GREY_40_PERCENT.index, (byte) 235, (byte) 236, (byte) 237);
			customPalette.setColorAtIndex(HSSFColor.YELLOW.index, (byte) 218, (byte) 218, (byte) 218);
			customPalette.setColorAtIndex(HSSFColor.AQUA.index, (byte) 191, (byte) 191, (byte) 191);
			Font font1 = wb.createFont();
			font1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			font1.setFontHeightInPoints((short) 12);
			font1.setColor(HSSFColor.WHITE.index);
			HSSFCellStyle style1 = wb.createCellStyle();
			style1.setFont(font1);
			style1.setFillForegroundColor(IndexedColors.SEA_GREEN.getIndex());
			style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style1.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style1.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style1.setWrapText(true);
			style1.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style1.setRightBorderColor(HSSFColor.YELLOW.index);

			Font font2 = wb.createFont();
			font2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			font2.setFontHeightInPoints((short) 10);
			font2.setColor(HSSFColor.WHITE.index);
			HSSFCellStyle style2 = wb.createCellStyle();
			style2.setFont(font2);
			style2.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			style2.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style2.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style2.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style2.setWrapText(true);
			style2.setBorderBottom(HSSFBorderFormatting.BORDER_THIN);
			style2.setBottomBorderColor(HSSFColor.WHITE.index);
			style2.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style2.setRightBorderColor(HSSFColor.WHITE.index);

			Font font3 = wb.createFont();
			font3.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			font3.setFontHeightInPoints((short) 10);
			font3.setColor(HSSFColor.BLACK.index);
			HSSFCellStyle style3 = wb.createCellStyle();
			style3.setFont(font3);
			style3.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
			style3.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style3.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style3.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style3.setWrapText(true);

			style3.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style3.setRightBorderColor(HSSFColor.YELLOW.index);

			Font font4 = wb.createFont();
			font4.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			font4.setFontHeightInPoints((short) 10);
			font4.setColor(HSSFColor.BLACK.index);
			HSSFCellStyle style4 = wb.createCellStyle();
			style4.setFont(font4);
			style4.setFillForegroundColor(IndexedColors.WHITE.getIndex());
			style4.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style4.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style4.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style4.setWrapText(true);

			style4.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style4.setRightBorderColor(HSSFColor.YELLOW.index);

			HSSFCellStyle style5 = wb.createCellStyle();
			style5.setFont(font4);
			style5.setFillForegroundColor(IndexedColors.AQUA.getIndex());
			style5.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style5.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style5.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style5.setWrapText(true);
			style5.setBorderBottom(HSSFBorderFormatting.BORDER_THIN);
			style5.setBottomBorderColor(HSSFColor.WHITE.index);
			style5.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style5.setRightBorderColor(HSSFColor.WHITE.index);

			int rowAt = 0;
			HSSFRow row = sheet.createRow(rowAt);
			HSSFCell cell = row.createCell(0);
			sheet.setColumnWidth(0, 4000);
			sheet.setColumnWidth(1, 4000);
			for (int i = 0; i < titleList.size(); i++) {
				sheet.setColumnWidth(i, 4000);
				cell = row.createCell(i);
				cell.setCellValue(titleList.get(i));
				cell.setCellStyle(style1);
			}
			rowAt++;

			for (Map<String,Object> dataMap : historyData) {
				row = sheet.createRow(rowAt);
				HSSFCellStyle styleTemp = null;
				if (rowAt % 2 == 0) {
					styleTemp = style3;

				} else {
					styleTemp = style4;
				}

				sheet.setColumnWidth(rowAt, 4000);

				for (int i = 0; i < columnList.size(); i++) {
					cell = row.createCell(i);
					if (dataMap.get(columnList.get(i)) == null) {
						cell.setCellValue("-");
					} else
						cell.setCellValue(dataMap.get(columnList.get(i)).toString());
					cell.setCellStyle(styleTemp);
				}

				rowAt++;
			}

			String filename = fileName;
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition",
					"attachment;filename=" + new String((fileName).getBytes("gb2312"), "ISO-8859-1") + ".xls");

			/*
			 * File file = new File("F:/日月光报表/1.xls"); FileOutputStream ouputStream = new
			 * FileOutputStream(file);
			 */
			OutputStream ouputStream = response.getOutputStream();
			wb.write(ouputStream);
			ouputStream.flush();
			ouputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exportBarcode(List<Map<String, Object>> historyData, HttpServletResponse response,
			List<Map<String, Object>> processList, List<String> columnList, String fileName) {
		try {

			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet();

			HSSFPalette customPalette = wb.getCustomPalette();
			customPalette.setColorAtIndex(HSSFColor.SEA_GREEN.index, (byte) 145, (byte) 183, (byte) 206);
			customPalette.setColorAtIndex(HSSFColor.GREY_40_PERCENT.index, (byte) 235, (byte) 236, (byte) 237);
			customPalette.setColorAtIndex(HSSFColor.YELLOW.index, (byte) 218, (byte) 218, (byte) 218);
			customPalette.setColorAtIndex(HSSFColor.AQUA.index, (byte) 191, (byte) 191, (byte) 191);
			Font font1 = wb.createFont();
			font1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			font1.setFontHeightInPoints((short) 12);
			font1.setColor(HSSFColor.WHITE.index);
			HSSFCellStyle style1 = wb.createCellStyle();
			style1.setFont(font1);
			style1.setFillForegroundColor(IndexedColors.SEA_GREEN.getIndex());
			style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style1.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style1.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style1.setWrapText(true);
			style1.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style1.setRightBorderColor(HSSFColor.YELLOW.index);

			Font font2 = wb.createFont();
			font2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			font2.setFontHeightInPoints((short) 10);
			font2.setColor(HSSFColor.WHITE.index);
			HSSFCellStyle style2 = wb.createCellStyle();
			style2.setFont(font2);
			style2.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			style2.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style2.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style2.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style2.setWrapText(true);
			style2.setBorderBottom(HSSFBorderFormatting.BORDER_THIN);
			style2.setBottomBorderColor(HSSFColor.WHITE.index);
			style2.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style2.setRightBorderColor(HSSFColor.WHITE.index);

			Font font3 = wb.createFont();
			font3.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			font3.setFontHeightInPoints((short) 10);
			font3.setColor(HSSFColor.BLACK.index);
			HSSFCellStyle style3 = wb.createCellStyle();
			style3.setFont(font3);
			style3.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
			style3.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style3.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style3.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style3.setWrapText(true);

			style3.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style3.setRightBorderColor(HSSFColor.YELLOW.index);

			Font font4 = wb.createFont();
			font4.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			font4.setFontHeightInPoints((short) 10);
			font4.setColor(HSSFColor.BLACK.index);
			HSSFCellStyle style4 = wb.createCellStyle();
			style4.setFont(font4);
			style4.setFillForegroundColor(IndexedColors.WHITE.getIndex());
			style4.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style4.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style4.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style4.setWrapText(true);

			style4.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style4.setRightBorderColor(HSSFColor.YELLOW.index);

			HSSFCellStyle style5 = wb.createCellStyle();
			style5.setFont(font4);
			style5.setFillForegroundColor(IndexedColors.AQUA.getIndex());
			style5.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style5.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 垂直居中
			style5.setAlignment(HSSFCellStyle.ALIGN_CENTER_SELECTION); // 字体居中
			style5.setWrapText(true);
			style5.setBorderBottom(HSSFBorderFormatting.BORDER_THIN);
			style5.setBottomBorderColor(HSSFColor.WHITE.index);
			style5.setBorderRight(HSSFBorderFormatting.BORDER_THIN);
			style5.setRightBorderColor(HSSFColor.WHITE.index);

			List<Map<String, Object>> titleList = new ArrayList<Map<String, Object>>();

			int rowAt = 0;
			HSSFRow row = sheet.createRow(rowAt);
			HSSFCell cell = row.createCell(0);
			// sheet.setColumnWidth(0, 8000);
			// sheet.autoSizeColumn((short) 0);
			// sheet.setColumnWidth(1, 8000);
			// sheet.autoSizeColumn((short) 1);
			for (int i = 0; i < processList.size(); i++) {
				// sheet.setColumnWidth(i, 8000);
				// sheet.autoSizeColumn((short) i);
				cell = row.createCell(i);
				cell.setCellValue(processList.get(i).get("processName").toString() + "--"
						+ processList.get(i).get("paramName").toString());
				cell.setCellStyle(style1);

				int length = cell.getStringCellValue().getBytes().length * 256;
				sheet.setColumnWidth(i, length);

				Map<String, Object> titleMap = new HashMap<String, Object>();
				titleMap.put("processCode", processList.get(i).get("processCode").toString());
				titleMap.put("paramCode", processList.get(i).get("paramCode").toString());

				titleList.add(titleMap);
			}

			rowAt = 1;
			for (Map<String, Object> dataMap : historyData) {
				row = sheet.createRow(rowAt);
				HSSFCellStyle styleTemp = null;
				if (rowAt % 2 == 0) {
					styleTemp = style3;

				} else {
					styleTemp = style4;
				}
				// sheet.setColumnWidth(rowAt, 4000);

				for (int i = 0; i < titleList.size(); i++) {
					cell = row.createCell(i);
					String value = dealData(dataMap, titleList.get(i).get("processCode").toString(),
							titleList.get(i).get("paramCode").toString());
					cell.setCellValue(value);
					cell.setCellStyle(styleTemp);
				}
				rowAt++;
			}

			/*
			 * for (Map<String, Object> dataMap : historyData) { row =
			 * sheet.createRow(rowAt); HSSFCellStyle styleTemp = null; if (rowAt % 2 == 0) {
			 * styleTemp = style3;
			 * 
			 * } else { styleTemp = style4; }
			 * 
			 * sheet.setColumnWidth(rowAt, 4000);
			 * 
			 * for (int i = 0; i < columnList.size(); i++) { cell = row.createCell(i); if
			 * (dataMap.get(columnList.get(i)) == null) { cell.setCellValue("-"); } else
			 * cell.setCellValue(dataMap.get(columnList.get(i)).toString());
			 * cell.setCellStyle(styleTemp); }
			 * 
			 * rowAt++; }
			 */

			// String filename = fileName;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String((fileName).getBytes("gb2312"), "ISO-8859-1") + "-" + sdf.format(new Date()) + ".xls");

			OutputStream ouputStream = response.getOutputStream();
			wb.write(ouputStream);
			ouputStream.flush();
			ouputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String dealData(Map<String, Object> dataMap, String processCode, String paramCode) {
		String resultValue = "-";

		Map<String, Object> processMap = (Map<String, Object>) dataMap.get(processCode);
		if (processMap != null) {
			if (processMap.get(paramCode) != null) {
				resultValue = processMap.get(paramCode).toString();
			}
		}
		return resultValue;
	}
	
	/**
	 * 实体类转map
	 * @param obj
	 * @return
	 */
	public static Map<String,Object> entityToMap(Object obj){
		Map<String,Object> map = new HashMap<String,Object>();
		Class<?> clazz = obj.getClass();
		for(Field field:clazz.getDeclaredFields()){
			field.setAccessible(true);
			String fieldName = field.getName();
			Object object = null;
			try{
				object = field.get(obj);
			}catch(Exception e){
				
			}
			map.put(fieldName, object);
		}
		return map;
	}
	/**
	 * 实体集合转map集合
	 * @param objList
	 * @return
	 */
	public static List<Map<String,Object>> entityListToMapList(List<Object> objList){
		List<Map<String,Object>> mapList = new ArrayList<Map<String,Object>>();
		for(Object obj:objList){
			mapList.add(entityToMap(obj));
		}
		return mapList;
	}
	
}
