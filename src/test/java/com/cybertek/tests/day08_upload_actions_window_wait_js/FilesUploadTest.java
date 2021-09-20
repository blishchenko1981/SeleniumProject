package com.cybertek.tests.day08_upload_actions_window_wait_js;

import com.cybertek.Utility.BrowserUtil;
import com.cybertek.Utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FilesUploadTest extends TestBase {

    @Test
    public void testUpload() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");

        WebElement fileInputField = driver.findElement(By.id("file-upload"));

       String filePath =  "C:\\Users\\Vitalii\\Desktop\\Softskills\\08_STLC\\Test cases intro.pdf";

               fileInputField.sendKeys(filePath);

             //  Thread.sleep(2000);

        BrowserUtil.waitFor(3);

               driver.findElement(By.id("file-submit")).click();
            BrowserUtil.waitFor(3);
    }
}
