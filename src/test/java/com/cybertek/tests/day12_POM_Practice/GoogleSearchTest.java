package com.cybertek.tests.day12_POM_Practice;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.pages.GoogleHomePage;
import com.cybertek.pages.SearchResultPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoogleSearchTest extends TestBase {

    @Test
    public void testGoogleSearch() {


        GoogleHomePage homePage = new GoogleHomePage();
        homePage.goTo();

        Assertions.assertTrue(homePage.isAt());

        homePage.searchKeyword("SDET Job");

        Assertions.assertTrue(driver.getTitle().startsWith("SDET Job"));


        SearchResultPage searchResultPage = new SearchResultPage();
        String result = searchResultPage.getResultCountTaxt();
        System.out.println("result = " + result);

        BrowserUtil.waitFor(2);

        searchResultPage.printAllSearchResultsLinks();

        BrowserUtil.waitFor(4);




    }

    //- Google homepage
    // Fields :
    // - searchbox element
    // - search button
    // Methods
    //  - searchKeyWord
    //    - accept 1 string param as keyword
    //    - return nothing
    //    - should enter keyword and click search button
    //  - isAt
    //    - accept no param
    //    - return true if title match , false if not
    //  - goTo
    //     - void method with no param and navigate to google (use config reader for url)
    //
    //- Google SearchResultPage
    //  - Fields
    //     searchResultCount
    //     resultLinks (list of webelement )
    //  - Methods
    //     getResultCountText
    //     getAllResultLinkText


}
