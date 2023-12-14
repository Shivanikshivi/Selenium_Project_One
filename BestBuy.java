package com.automation.webdriver;
import org.openqa.selenium.Keys;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class BestBuy {
	

	
	public static void main(String[] args) {
		try
		{
			
			        WebDriver driver = new ChromeDriver(); 
			        driver.get("https://www.google.com/");
			        driver.manage().window().maximize();
			        driver.findElement(By.name("q")).sendKeys("Best Buy");
			        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
			        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")).click();
			        
			        			
			        Thread.sleep(5000);
		
			        @SuppressWarnings("deprecation")
					HttpURLConnection connection = (HttpURLConnection) new URL("https://www.bestbuy.com/").openConnection();
		            connection.setRequestMethod("GET");
		            connection.connect();
		            int responseCode = connection.getResponseCode();
		            if (responseCode == 200) {
		                System.out.println("URL is valid");
		            } else {
		                System.out.println("URL is broken");
		            }
		        
		            //Account
		            driver.findElement(By.xpath("//*[@id=\"account-menu-account-button\"]/span")).click();
		            
		            		//Navigation to menu
		            		
		            		 driver.get("https://www.bestbuy.com/");

		            	        // getTitle() to obtain page title
		            	        System.out.println("Page title is : " + driver.getTitle());
		
	                            // Bottom link
		            	        
		            	        driver.get("https://www.bestbuy.com/"); 
		            	        
		            	        
		            	        List<WebElement> links 
		            	            = driver.findElements(By.tagName("a")); 
		            	                	         
		            	        for (WebElement link : links) { 
		            	            System.out.println(link.getText()); 
		            	        } 
		            	        
		            	        driver.get("https://www.bestbuy.com/");

		            	        // Search for an item
		            	        WebElement searchBox = driver.findElement(By.id("gh-search-input"));
		            	        searchBox.sendKeys("laptop"); 
		            	        searchBox.submit();
		            	        
		            	        // Click on a product
		            	        WebElement product = driver.findElement(By.cssSelector(".sku-title a"));
		            	        product.click();
		            	        
		            	      //Select item from Menu-Shop by department

		            	        driver.get("https://www.bestbuy.com/");

		            	        //  Menu 
		            	        WebElement menuElement = driver.findElement(By.id("menuButton"));
		            	        Actions actions = new Actions(driver);
		            	        actions.moveToElement(menuElement).perform();

		            	        // Click on "Shop by Department"
		            	        WebElement shopByDepartmentLink = driver.findElement(By.xpath("//a[contains(text(),'Shop by Department')]"));
		            	        shopByDepartmentLink.click();

		            	        // Select a department 
		            	        WebElement computersTablets = driver.findElement(By.xpath("//a[contains(text(),'Computers & Tablets')]"));
		            	        computersTablets.click();

		            	        // Select a category
		            	        WebElement laptopsCategory = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
		            	        laptopsCategory.click();

		            	        // Click on a specific product
		            	        WebElement product1 = driver.findElement(By.cssSelector(".sku-title a"));
		            	        product1.click();

		            	        // Add the product to the cart 
		            	        WebElement addToCartButton1 = driver.findElement(By.cssSelector(".add-to-cart-button"));
		            	        addToCartButton1.click();
		            	        
		            	        driver.get("https://www.bestbuy.com/site/dell-g15-15-6-fhd-120hz-gaming-laptop-intel-core-i7-8gb-memory-nvidia-geforce-rtx-4050-1tb-ssd-dark-shadow-gray/6541333.p?skuId=6541333");
		            	        
		            	        JavascriptExecutor js = (JavascriptExecutor) driver;
		            	        js.executeScript("window.scrollBy(0,500)", "");

		            	        //Select item from Menu-Branch

		            	        driver.get("https://www.bestbuy.com/");

		            	        // "Menu" 
		            	        WebElement menuElement1 = driver.findElement(By.id("menuButton"));
		            	        Actions actions1 = new Actions(driver);
		            	        actions1.moveToElement(menuElement1).perform();

		            	        // Click on "Brands"
		            	        WebElement brandsLink = driver.findElement(By.xpath("//a[contains(text(),'Brands')]"));
		            	        brandsLink.click();

		            	        WebElement appleBrand = driver.findElement(By.xpath("//a[contains(text(),'Dell')]"));
		            	        appleBrand.click();

		            	        WebElement product2 = driver.findElement(By.cssSelector(".sku-title a")); 
		            	        product2.click();

		            	        // Add the product to the cart 
		            	        WebElement addToCartButton2 = driver.findElement(By.cssSelector(".add-to-cart-button"));
		            	        addToCartButton2.click();
		            	        
		            	        //checkout
		            	        
		            	        driver.get("https://www.bestbuy.com/");

		            	        WebElement cartIcon = driver.findElement(By.className("cart-icon"));
		            	        cartIcon.click();

		            	        // Click on the "Checkout" button
		            	        WebElement checkoutButton = driver.findElement(By.xpath("//button[contains(text(),'Checkout')]"));
		            	        checkoutButton.click();

		            	        // Fill out the checkout form with dummy information
		            	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
		            	        firstNameInput.sendKeys("K");

		            	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
		            	        lastNameInput.sendKeys("Shivani");

		            	        WebElement addressInput = driver.findElement(By.id("address"));
		            	        addressInput.sendKeys("321 Street");
		            	        
		            	        WebElement cardNumberInput = driver.findElement(By.id("credit-card-number"));
		            	        cardNumberInput.sendKeys("1234567890123456");

		            	        WebElement expiryInput = driver.findElement(By.id("expiration-date"));
		            	        expiryInput.sendKeys("8/25");

		            	        WebElement cvvInput = driver.findElement(By.id("cvv"));
		            	        cvvInput.sendKeys("123");

		            	        
		            	        WebElement placeOrderButton = driver.findElement(By.xpath("//button[contains(text(),'Place Your Order')]"));
		            	        placeOrderButton.click();
		            	        
		            	        
		            	        //order confirmation
		            	        driver.get("https://www.bestbuy.com/");
		            	        WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(text(),'Your order has been successfully placed')]"));

		            	        if (confirmationMessage.isDisplayed()) {
		            	            System.out.println("Order placed successfully. Confirmation message found.");
		            	        } else {
		            	            System.out.println("Order placement verification failed.");
		            	        }
		            	        
		            	        //close the browser
		            	        driver.get("https://www.bestbuy.com/");
		            	        driver.quit();
		            	        		            	        		            	       
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
			}
	}

	
}
			        

			        