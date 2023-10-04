package com.d.demoselmavn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSwademmvn {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
       
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("http://www.google.com");
        
        
    }
    @AfterClass
    public void tearDown() {
        
        if (driver != null) {
            driver.quit();
        }
    }
}

