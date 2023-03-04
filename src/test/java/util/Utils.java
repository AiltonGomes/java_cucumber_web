package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import page.CartPage;

public class Utils extends CartPage {
    protected WebDriver driver = TestRule.getDriver();
    protected static void setDriverByOS(){
        String driverPath = "src/test/resources/drivers/";
        if(System.getProperty("os.name").contains("Windows")){
            driverPath = driverPath + "chromedriver.exe";
        }else{
            driverPath = driverPath + "chromedriver";
        }
        System.setProperty("webdriver.chrome.driver", driverPath);
    }
}
