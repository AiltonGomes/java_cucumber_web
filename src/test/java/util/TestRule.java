package util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestRule extends TestWatcher {
    private static WebDriver driver;
    public TestRule(){
        super();
    }
    @Override
    protected void starting(Description description){}
    @AfterClass
    public void cleanUp() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeClass
    public static void abrirNavegador(String url){
        ChromeOptions chromeOpts = new ChromeOptions();
        chromeOpts.addArguments("start-maximized");
        Utils.setDriverByOS();
        driver = new ChromeDriver(chromeOpts);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }
}
