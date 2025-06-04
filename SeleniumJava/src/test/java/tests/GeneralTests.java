package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicIdPage;
import pages.HomePage;
import pages.ClassAttributePage;
import pages.ScrollbarsPage;

import static org.testng.Assert.assertEquals;

public class GeneralTests extends BaseTests {

    @Test
    public void findButtonWithDynamicIdAndClick() {
        HomePage homePage = new HomePage(driver);
        DynamicIdPage dynamicIdPage = new DynamicIdPage(driver);
        homePage.clickDynamicIdLink();
        dynamicIdPage.clickButtonWithDynamicId();

    }

    @Test
    public void findPrimaryButtonByClassClickItAndCloseAlertPopup() {
        HomePage homePage = new HomePage(driver);
        ClassAttributePage ClassAttributePage = new ClassAttributePage(driver);
        homePage.clickClassAttributeLink();
        ClassAttributePage.clickButton();
        assertEquals(ClassAttributePage.getAlertText(), "Primary button pressed");
        ClassAttributePage.acceptAlert();
    }

    @Test
    public void findHiddenButtonAndClickIt() {
        HomePage homePage = new HomePage(driver);
        ScrollbarsPage scrollbarsPage = new ScrollbarsPage(driver);
        homePage.clickScrollbarsLink();
        scrollbarsPage.clickHidingButton();



    }
}


