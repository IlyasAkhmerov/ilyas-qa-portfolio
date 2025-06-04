package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScrollbarsPage {
    private WebDriver driver;
    private By title = By.cssSelector("section .container h3");
    private By hiding_button = By.id("hidingButton");

    public ScrollbarsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(title));
        return driver.getTitle();
    }

    public void clickHidingButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement hiddenButton = wait.until(ExpectedConditions.presenceOfElementLocated(hiding_button));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", hiddenButton);
        hiddenButton.click();
    }

}
