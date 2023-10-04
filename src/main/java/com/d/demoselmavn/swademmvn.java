package com.d.demoselmavn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class swademmvn {
	public static String browser="Firefox";
	public static WebDriver dr;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		FirefoxDriver dr=new FirefoxDriver();
		 dr.get("http://www.google.com");
		 dr.manage().window().maximize();
		 dr.findElement(By.id("APjFqb")).sendKeys("OrangeHRM");
		 dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	     dr.findElement(By.xpath("/html/body/div[5]/div/div[9]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
	     dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
	     dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/div/div/div/div/ul/li[1]")).click();
	     dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/div/div/div/div/ul/li[1]/div/div/h6[2]/a")).click();
	     JavascriptExecutor js=(JavascriptExecutor) dr;
	     js.executeScript("window.scrollBy(0,500)");
	     try {
	    	 Thread.sleep(2000);	
	     dr.get("https://player.vimeo.com/video/855609648?h=a942e2d4de");
	     dr.findElement(By.xpath("/html/body/div/div[7]/div[8]/div[1]/button/svg/path")).click();
	   /* if(videoElement.getAttribute("paused").equals("true")) {
	    	videoElement.click();
	    }*/
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	     
	     
	}

}
