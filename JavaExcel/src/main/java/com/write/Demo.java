package com.write;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author fantaixi
 * @create 2021-03-14 11:06
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建工作薄
        XSSFWorkbook workbook = new XSSFWorkbook();
        //创建工作表
        XSSFSheet sheet = workbook.createSheet("工作表1");
        //创建行
        XSSFRow row = sheet.createRow(0);
        //创建单元格
        row.createCell(0).setCellValue("sad");
        row.createCell(1).setCellValue("aaa");
        row.createCell(2).setCellValue("sss");

        //创建行
        XSSFRow row1 = sheet.createRow(1);
        //创建单元格
        row1.createCell(0).setCellValue("sad");
        row1.createCell(1).setCellValue("aaa");
        row1.createCell(2).setCellValue("sss");
        //输出流
        FileOutputStream outputStream = new FileOutputStream("D:\\sb.xlsx");
        workbook.write(outputStream);
        outputStream.flush();
        //释放
        workbook.close();
        outputStream.close();
    }
}
