package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage {

    @FindBy(id = "result-stats")
    private WebElement searchResultcount;

    // grab all the link with same class
    @FindBy(xpath = "//h3[@class='LC20lb DKV0Md']")
    private List<WebElement> resultLinks;

    public String getResultCountTaxt(){

        return searchResultcount.getText();

    }

    public void printAllSearchResultsLinks(){
        System.out.println("resultLinks.size() = " + resultLinks.size());
        System.out.println("---------------------------------------------");
        for (WebElement link : resultLinks) {
            //remove links with empty text
            if(!link.getText().isEmpty()){

            System.out.println("link.getText() = " + link.getText());}

        }

    }

    public SearchResultPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

}
