package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicIdPage {
    private WebDriver driver;
    private By title = By.cssSelector("section .container h3");
    private By dynamic_id_button = By.xpath("//div/button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]");

    public DynamicIdPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(title));
        return driver.getTitle();
    }

    public void clickButtonWithDynamicId() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(dynamic_id_button));
        button.click();
    }




}
