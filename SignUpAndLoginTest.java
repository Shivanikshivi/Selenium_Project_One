package com.automation.webdriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpAndLoginTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")).click();

        driver.findElement(By.xpath("//*[@id=\"account-menu-account-button\"]/span")).click();
        driver.findElement(By.xpath("//a[href='/identity/global/signin']")).click();
        driver.findElement(By.id("fld-e")).sendKeys("shivanikshivi@gmail.com");
        driver.findElement(By.id("fld-p1")).sendKeys("1234567890");
        driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[3]/button")).submit();
        
        
        String expected_title=("Best Buy | Official Online Store | Shop Now & Save");
        
        		String actual_title= driver.getTitle();
        		
        		if (expected_title.equals(actual_title))
        		{
        			System.out.println("Login successful");
        			
        		}else {
        			System.out.println("Login Failure");
        			
        		}
    }
}
        