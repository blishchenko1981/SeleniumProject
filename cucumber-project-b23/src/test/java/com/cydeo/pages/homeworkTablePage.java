package com.cydeo.pages;

import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class homeworkTablePage {

    @FindBy (xpath = "//table[@class = 'ProductsTable']//tr[1]")
List<String> webelements = new ArrayList<>();


}
