package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.DynamicIdPage;
import pages.ScrollbarsPage;

import static org.testng.Assert.*;

public class HomePageTests extends BaseTests {

    @Test
    public void verifyHomePageOpens() {
        HomePage homePage = new HomePage(driver);
        assertEquals(homePage.getTitle(), "UI Test Automation Playground");
    }

    @Test
    public void clickDynamicIdButton_SuccessRedirect() {
        HomePage homePage = new HomePage(driver);
        DynamicIdPage dynamicIdPage = new DynamicIdPage(driver);
        homePage.clickDynamicIdLink();

        assertEquals( dynamicIdPage.getTitle(), "Dynamic ID");

    }

    @Test
    public void clickScrollbarsLink_SuccessRedirect() {
        HomePage homePage = new HomePage(driver);
        ScrollbarsPage scrollbarsPage = new ScrollbarsPage(driver);
        homePage.clickScrollbarsLink();

        assertEquals(scrollbarsPage.getTitle(), "Scrollbars");

    }
}


