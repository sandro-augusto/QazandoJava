package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessHomePage(String message) {
        waitElements(By.cssSelector("a[href=\"/\"]"), 5);
        String pag_home = driver.findElement(By.cssSelector("a[href=\"/\"]"))
                .getText();
        Assert.assertEquals("Não acessou a Pag Home",message , pag_home);
    }
}
