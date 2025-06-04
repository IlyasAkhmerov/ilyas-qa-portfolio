package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By searchField = By.id("title");
    private By dynamicId = By.cssSelector("#overview div:nth-child(1) .row:nth-child(1) .col-sm:nth-child(1) h3 a");
    private By classAttibute = By.cssSelector("#overview div:nth-child(1) .row:nth-child(1) .col-sm:nth-child(2) h3 a");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(searchField));
        return driver.getTitle();
    }

    public void clickDynamicIdLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(dynamicId));
        button.click();

    }

    public void clickClassAttributeLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(classAttibute));
        button.click();
    }


}
