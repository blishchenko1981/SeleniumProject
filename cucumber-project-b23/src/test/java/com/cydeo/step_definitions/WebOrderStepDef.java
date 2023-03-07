package com.cydeo.step_definitions;

import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WOrderPage;
import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class WebOrderStepDef {
    @When("we select {string} tab from sidebar")
    public void weSelectTabFromSidebar(String tabName) {
        System.out.println("tabName = " + tabName);
        WCommonArea commonArea = new WCommonArea();
        switch (tabName) {
            case "View all products":
                commonArea.viewAllProductTab.click();
            case "View all orders":
                commonArea.viewAllOrderTab.click();
            case "Order":
                commonArea.orderTab.click();
        }

    }

    @Then("we should see below options in Product dropdown list")
    public void weShouldSeeBelowOptionsInProductDropdownList(List<String> expectedOptions) {
        System.out.println("options = " + expectedOptions);
        WOrderPage orderPage = new WOrderPage();

        WebElement dropdown = orderPage.productDropdown;
        Select selectObj = new Select(dropdown);
        List<WebElement> allProductPtrions = selectObj.getOptions();

        for (WebElement each : allProductPtrions) {
            System.out.println("each = " + each.getText());
        }

        // getOptions method from Select class is used to return all dropdown options as List of web elements

        List<String> actualOptions = orderPage.getAllProductOptionFromList();

        for (WebElement each : allProductPtrions) {
            System.out.println("each = " + each.getText());
        }

        //assert these two lists are equal
        assertEquals(expectedOptions, actualOptions);
    }

    @Then("side bar tabs should be as below")
    public void sideBarTabsShouldBeAsBelow(List<String> options) {
        WCommonArea wcom = new WCommonArea();
        List<String> webElements = new ArrayList<>();
        webElements.add(wcom.viewAllOrderTab.getText());
        webElements.add(wcom.viewAllProductTab.getText());
        webElements.add(wcom.orderTab.getText());

        assertEquals(options, webElements);

    }

    @Then("we should see table with below content")
    public void weShouldSeeTableWithBelowContent(List<List<String>> table) {

        List<List<String>> webelementsList = new ArrayList<>();

        BrowserUtil.waitFor(2);

        /** Here I ADD first list with all headersText to LIST<list>
         */

        List<WebElement> header = Driver.getDriver().findElements(By.xpath("//table[@class = 'ProductsTable']//tr[1]/th"));
        List<String> stringtextHeader = new ArrayList<>();
        for (WebElement webElement : header) {
            stringtextHeader.add(webElement.getText());
        }
        webelementsList.add(stringtextHeader);


        /** Here I ADD rest of the Rows as lists to the LIST<list>*/

        for (int i = 2; i < 5; i++) {
            List<WebElement> webelements1 = Driver.getDriver().findElements(By.xpath("//table[@class = 'ProductsTable']//tr[" + i + "]/td"));
            List<String> rowsText = new ArrayList<>();

            for (WebElement webElement : webelements1) {
                rowsText.add(webElement.getText());
            }

            webelementsList.add(rowsText);
        }

        assertEquals(webelementsList, table);
    }

    @Then("we should see three section as below")
    public void weShouldSeeThreeSectionAsBelow(List<String> sections) {

        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//h3"));

        List<String> texts = new ArrayList<>();

        for (WebElement element : elements) {
            texts.add(element.getText());
        }
        assertEquals(sections, texts);

    }


    @And("select each product from dropdown should change the unit price accordingly")
    public void selectEachProductFromDropdownShouldChangeTheUnitPriceAccordingly(TreeMap<String, String> expectedContent) {
        //locating dropdown
        WebElement productDropdown = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));

        //locating the price
        WebElement price = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice"));

        //creating new Map
        Map<String,String > actualContent = new TreeMap<>();

        Select dropObj = new Select(productDropdown);

        for(int i=2; i>=0; i--){
            //selecting object by index
            dropObj.selectByIndex(i);
            //making it a String
            String eachKey = dropObj.getFirstSelectedOption().getText();
            BrowserUtil.waitFor(2);
            //getting the price from price textbox
            String eachValue = price.getAttribute("value");
            //adding it to Map
            actualContent.put(eachKey,eachValue);
        }

        System.out.println("actualContent = " + actualContent);
        System.out.println("expectedContent = " + expectedContent);
          assertEquals(actualContent,expectedContent);






    }
}
