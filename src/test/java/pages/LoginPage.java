package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;

public class LoginPage extends RunCucumberTest {
//    WebDriver driver;
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//    }

    public void accessApplicator(String message) {
        driver.get("https://walkdog.vercel.app/");
        String page_login = driver.findElement(By.cssSelector(".content > main > h1"))
                .getText();
        Assert.assertEquals(true, page_login.equals(message));
        Assert.assertEquals("Não acessou a aplicação",true, driver.findElement(By.cssSelector(".content > main > h1")).isDisplayed());
    }

    public void clickBtnLogin(String message) {
        String button_login = driver.findElement(By.cssSelector("a[href=\"/signup\"] > strong"))
                .getText();
        Assert.assertEquals("Não encontrou o botão de Login",true, button_login.equals(message));
        driver.findElement(By.cssSelector("a[href=\"/signup\"]")).click();
    }



}
