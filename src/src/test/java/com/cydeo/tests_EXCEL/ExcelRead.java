package com.cydeo.tests_EXCEL;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {

        String path="SampleData.xlsx";
        //to read from excel we need to load it FileInput stream

        FileInputStream fileInputStream = new FileInputStream(path);

        // workbook>sheet>row>cell

        // <1> Creat a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // <2> We need to get a specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // <3> Select row and cell from workbook
        // Print out Mary's cell
        // Indexes starting from 0
        System.out.println("sheet.getRow() = " + sheet.getRow(1).getCell(0));

        // print out Developer
        System.out.println("sheet.getRow(3 = " + sheet.getRow(3).getCell(2));

        System.out.println("sheet.getRow(2).getCell(2) = " + sheet.getRow(2).getCell(2));
        //Return the count of used cell only
        // Start counting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        // Return the number from top cell to bottom cell
        // It doesn't care if the cell is empty or not
        // Start counting from zero
        int lastUsedRow=sheet.getLastRowNum();
        System.out.println("lastUsedRow = " + lastUsedRow);

        // TODO: Create a logic to print from Vinod's name
        for (int rowNumber=0; rowNumber<usedRows; rowNumber++){
                if(sheet.getRow(rowNumber).getCell(0).toString().equals("Vinod")){
                    System.out.println(sheet.getRow(rowNumber).getCell(0));
                }
        }
    //TODO: Create a logic to print Linda's Job_ID
        // check if name is Linda --> print out Job_ID of Linda

       for(int rowNumber = 0; rowNumber <usedRows; rowNumber++){
           if(sheet.getRow(rowNumber).getCell(0).toString().equals("Linda")){
               System.out.println("Linda's Job_ID is: "+sheet.getRow(rowNumber).getCell(2));
           }
       }

    }

}
