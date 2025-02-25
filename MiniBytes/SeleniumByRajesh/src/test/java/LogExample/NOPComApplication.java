package LogExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.TestClass;

public class NOPComApplication extends TestClass{
    
    
    @Test
    public void verifyLogin() {
        
//        log.info("clear the email value.");
//        driver.findElement(By.cssSelector("input#Email")).clear();;
//        log.info("enter value: " + Constants.userName);
//        driver.findElement(By.cssSelector("input#Email")).sendKeys(Constants.userName);
//        
//        
//        
//        log.info("clear the password value.");
//        driver.findElement(By.cssSelector("input#Password")).clear();;
//        log.info("enter password: " + Constants.pass);
//        driver.findElement(By.cssSelector("input#Password")).sendKeys(Constants.pass);
//        
//        
//        
//        log.info("click on checkboxRememberMe ");
//        driver.findElement(By.cssSelector("input#RememberMe")).click();
//        
//        log.info("click on login button ");
//        driver.findElement(By.tagName("button")).click();
//        
//        
//        
//        //validation step
//        log.info("Application Title after login : " + driver.getTitle());
//        Assert.assertTrue(driver.getTitle().contains("Dashboard"));;
//        
        
    }
    
    
    @Test
    public void verifyLogout() {
        
//        log.info("click on logout button ");
//        driver.findElement(By.partialLinkText("ogo")).click();
//        
//        
//        //validation step
//        log.info("Application Title after logout : " + driver.getTitle());
//        Assert.assertTrue(driver.getTitle().contains("Your store. Login"));;
        
    
    }
}

