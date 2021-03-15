package com.read;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

/**
 * @author fantaixi
 * @create 2021-03-14 10:23
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //1、获取工作薄
        XSSFWorkbook workbook = new XSSFWorkbook("D:\\poi_test.xlsx");
        //2、获取获取工作表
        XSSFSheet sheet = workbook.getSheetAt(0);
        //3.获取行
        //for (Row row : sheet) {
        //    //4.获取单元格
        //    for (Cell cell : row) {
        //        //获取单元格中的内容
        //        String value = cell.getStringCellValue();
        //        System.out.println(value);
        //    }
        //}
        int lastRowNum = sheet.getLastRowNum();
        for (int i = 0; i <= lastRowNum; i++) {
            XSSFRow row = sheet.getRow(i);
            short lastCellNum = row.getLastCellNum();
            for (int j = 0; j < lastCellNum; j++) {
                XSSFCell cell = row.getCell(j);
                String value = cell.getStringCellValue();
                System.out.println(value+" ");
            }
            System.out.println();
        }


        //释放资源
        workbook.close();

    }
}
