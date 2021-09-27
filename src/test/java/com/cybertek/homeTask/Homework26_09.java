package com.cybertek.homeTask;

public class Homework26_09 {
//    1. Review the day09 class and class note.
//    2. Update `TestBase` class to use `Driver.getDriver()` instead of `WebDriverFactory`
//    3. Create new `WebOrderUtility` with different name or modify existing one.
//            1. remove `WebDriver driverParam`
//            2. re-create the methods to use `Driver.getDriver()`
//
//    4. Update `isAtOrderPage()` for performance
//            1. observe : the code works great when header element found ,but forced to wait for 10 seconds of implicit wait when element not found
//            2. use Explicit wait technic we learned to minimize the wait time to 2 seconds max by waiting accoridng to expected condition of header element is visible : `visibilityOfElementLocated` condition
//
//
//    5. Create a method called openWebOrderApp()
//        - no param , no return type
//        - simply navigate to WebOrder login page
//        - use `Driver` class we created , no param!

//    ## Homework 2 : method practice
//6. Create a method `verifyUserName`
//            1. accept `String username` as parameter
//   2. The method check the welcome message right beside `logout` link contains username or not. for example `Welcome , Tester` contains `Tester`
//            3. return `true` if it match username passed, false if not.
//
//7. Create a method `selectSideBarTab`
//            1. accept `String tabName` no return type.
//   2. click on the tab according to the tabName provided, for example : if "View all products" passed to the method , it should click on second tab.
//
//8. Create a method `checkAll`
//            1. accept no param , return `boolean`
//            2. click on `Check All` button
//   3. return `true` if all checkboxes are checked , false if any left unchecked
//
//9. Create a method `uncheckAll`
//            1. accept no param , return `boolean`
//            2. click on `Uncheck All` button
//            3. return `true` if all checkboxes are unchecked , false if any left checked
//
//10. Create a method `getAllProducts`
//            1.  accept no param ,
//            2.  return `List<String>`
//            3.  click on `View All Products` tab
//            4.  save each cell value in first column `Product name` in the table into `List<String>`
//            (edited)
//
//            6
//
//            2
//
//            3
//
//            2
//            [8:34 PM]
//            ## Homework 3 : method practice
//11. Create a method `getUnitPriceFromForm`
//            1.  accept `String productName`
//            2.  return `int` for unit price
//    3.  It should
//        1.  select product from product dropdown list
//        2.  click `calculate` button
//        3.  get the value attribute of `Price per unit:` input box
//        4.  return it from the method.
//
//            12. Create a method `getDiscountFromForm`
//            1.  accept `String productName` , `int quantity`
//            2.  return `int` for discount
//    3.  It should
//        1.  select `productName` from product dropdown list
//        2.  Enter `quantity` into `Quantity:*` inputbox (Fact : discount apply only if quantity is 10+)
//        3. click `calculate` button
//        4. get text attribute of `discount` inputbox and return from the method.

}
