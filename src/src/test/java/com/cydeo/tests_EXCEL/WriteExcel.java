package com.cydeo.tests_EXCEL;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {


        String filePath = "SampleData.xlsx";
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        @Test
        public void write_to_excel_file () throws IOException {

            FileInputStream fileInputStream = new FileInputStream(filePath);

            workbook =new XSSFWorkbook(fileInputStream);
            sheet= workbook.getSheet("Employees");

            XSSFCell salaryCell=sheet.getRow(0).createCell(3);
            salaryCell.setCellValue("Salary");

            XSSFCell salary1=sheet.getRow(1).createCell(3);
            salary1.setCellValue(200000);

            XSSFCell salary2=sheet.getRow(2).createCell(3);
            salary2.setCellValue(100000);

            XSSFCell salary3=sheet.getRow(3).createCell(3);
            salary3.setCellValue(120000);

            XSSFCell salary4=sheet.getRow(4).createCell(3);
            salary4.setCellValue(140000);


            // TODO change the Mary's surname to Jones
            for (int rowNum=0; rowNum<sheet.getLastRowNum(); rowNum++){
                    if (sheet.getRow(rowNum).getCell(0).toString().equals("Mary")){
                        sheet.getRow(rowNum).getCell(1).setCellValue("Jones");
                    }
            }

            //to read
            // open to write the file : FileInputStream ==> reading
            //save the changes        : FileOutputStream ==> writing

            FileOutputStream OutputStream = new FileOutputStream(filePath);
            //save / write changes to the workbook
            workbook.write(OutputStream);
            //close all
            OutputStream.close();
            workbook.close();
            fileInputStream.close();

    }
}