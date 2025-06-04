package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ClassAttributePage {
    private WebDriver driver;
    private By title = By.cssSelector("section .container h3");
    private By submit_button = By.xpath("//div/button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]");

    public ClassAttributePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(title));
        return driver.getTitle();
    }

    public void clickButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(submit_button));
        button.click();
    }

    public String getAlertText() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void acceptAlert() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


}
