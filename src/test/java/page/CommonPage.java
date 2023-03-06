package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.TestRule;

import java.time.Duration;

public class CommonPage {
    protected WebDriver driver = TestRule.getDriver();
    protected void moveToElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }
    public void esperaExplicita(String elemento){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(elemento)));
        System.out.println(firstResult.getText());
    }
    public void rolarTelaProdutos(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//a[contains(.,'View Product')]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
    public void rolarTelaCheckout(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//a[contains(@class,'btn btn-default check_out')]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
    public void EsperaThread() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
    }
}
