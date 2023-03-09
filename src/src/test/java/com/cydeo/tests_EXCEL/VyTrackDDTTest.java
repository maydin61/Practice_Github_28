package com.cydeo.tests_EXCEL;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VyTrackDDTTest {

    VyTrackLoginPage loginPage=new VyTrackLoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Before
    public void setUp(){
       // Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
    @Test
    public void loginDDTTest() throws IOException {

        String filePath = "VyTrackQa2Users.xlsx";     // introduction file to inteliJ

        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheet("data");

        for (int i = 0; i < sheet.getLastRowNum(); i++) {

            String userName = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            String firstname = sheet.getRow(i).getCell(2).toString();
            String lastname = sheet.getRow(i).getCell(3).toString();

            loginPage.Login_vYTrack(userName, password);

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
            try {

                WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
                wait.until(ExpectedConditions.visibilityOf(loaderMask));

                 String actualFullName = dashboardPage.header.getText();
                 dashboardPage.header.getText();

                XSSFCell resultCell = sheet.getRow(i).getCell(4);

                if (actualFullName.contains(firstname) && actualFullName.contains(lastname)) {
                    System.out.println("PASS");
                    resultCell.setCellValue("PASS");
                } else {
                    System.out.println("FAIL");
                    resultCell.setCellValue("FAIL");
                }
                // dashboardPage.options();
            } catch (Exception e) {

            }
            FileOutputStream out = new FileOutputStream(filePath);
            workbook.write(out);
            in.close();
            out.close();
        }
    }
}
