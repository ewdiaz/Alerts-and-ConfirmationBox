import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        String url ="https://www.demoqa.com/alerts";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        List<WebElement> buttons = driver.findElements(By.xpath("//button[contains(text(),'Click me')]"));
//Boton 1
        /*Thread.sleep(2000);
        buttons.get(0).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);*/
//Boton 2
        /*Thread.sleep(2000);
        buttons.get(1).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);*/
//Boton 3
        /*Thread.sleep(2000);
        buttons.get(2).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);*/
//Boton 4
        Thread.sleep(2000);
        buttons.get(3).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Eduard Diaz");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
}
