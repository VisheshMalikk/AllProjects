package BaseClass;

import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

    WebDriver driver;
    Logger log;
    
    
    
    @BeforeSuite
    public void setup() {
        log = Logger.getLogger("NOP Comm Application");
        PropertyConfigurator.configure(".\\testData\\log4j.properties");
    }
    
    
    @BeforeTest
    public void launchApp() {   
//      log = Logger.getLogger("NOP Com Application");
//      PropertyConfigurator.configure(".\\testData\\log4j.properties");
        
        
        
        log.info("===============info===================");
        log.warn("===============warn===================");
        log.error("===============error===================");
        
        
        log.info("launching chrome browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        log.info("launching application: ");
        
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        
        log.info("NOP comm application launched sucessfully.");
        
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 30);	
        wait.until(ExpectedConditions.alertIsPresent());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
    }
    
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(5000);
        log.info("NOP comm application closed sucessfully.");
        driver.close();
        driver.quit();
        
        
    }
    
    
    
}
