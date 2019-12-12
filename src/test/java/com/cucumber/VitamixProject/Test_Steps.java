package com.cucumber.VitamixProject;



import java.io.EOFException;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Test_Steps {
	public WebDriver driver;
	public int random;
	
	@Given("^i launch mozila firefox browser$")
	public void i_launch_mozila_firefox_browser() throws Throwable  {
		
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		Thread.sleep(10000);
	}
	
	@Given("^i launch google chrome browser$")
	public void i_launch_google_chrome_browser() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	}
	
	@Given("^i launch IE browser$")
	public void i_launch_IE_browser() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		Thread.sleep(10000);
		
	}
	    
    @Given("^i am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
    	
	    // Write code here that turns the phrase above into concrete actions
    	Thread.sleep(5000);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.vitamix.com/gb/en_gb/");
	   
	}
	
	@Given("^i click on allow all cookies link$")
	public void i_click_on_allow_all_cookies_link() throws Throwable {
		
		// Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#CybotCookiebotDialogBodyButtonAccept"))).click();
		Thread.sleep(5000);
		
		try {
			File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(scrFile1, new File ("./Screenshots/Vitamix Homepage.png"));
			   System.out.println("Vitamix Homepage Screenshot Saved in Screenshot Folder");
			   
		}catch(Exception e) {
			
		}
		 Thread.sleep(10,000);
	   	
	}

	@Given("^i click my Account link$")
	public void i_click_my_Account_link() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#headerMyAccountLink"))).click();
	   
	}

	@Given("^i click create an account link$")
	public void i_click_create_an_account_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#createAnAccountLink[class='link-special']"))).click();
		Thread.sleep(5000);
		
	}

	@When("^i fill the form$")
	public void i_fill_the_form() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys("Moshood");
		driver.findElement(By.id("lastName")).sendKeys("Wale");
		random = 1000000 + (int)(Math.random() * ((1000 - 1) + 1));
	  	System.out.println(random);
	  	driver.findElement(By.id("email")).sendKeys("moshood" + random + "@yahoo.com");
	  	driver.findElement(By.id("confirmEmail")).sendKeys("moshood" + random + "@yahoo.com");
	    driver.findElement(By.id("password")).sendKeys("London_123");
	  	driver.findElement(By.id("confirm-password")).sendKeys("London_123");
	  	driver.findElement(By.id("zipCode")).sendKeys("MN 55416");
	  	driver.findElement(By.id("homeType1")).click();
	  	driver.findElement(By.id("vitamixOwnerNo")).click();
	  	driver.findElement(By.cssSelector("input#terms")).click();
	  	
	}

	@When("^i click the create account button$")
	public void i_click_the_create_account_button() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#registerButton")).click();
	   
	}

	@Then("^my account should be created$")
	public void my_account_should_be_created() throws Throwable {
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#header-signout")));
	   
		Assert.assertEquals("Sign Out", driver.findElement(By.cssSelector("a#header-signout")).getText());
		System.out.println(driver.findElement(By.cssSelector("a#header-signout")).getText());
		Thread.sleep(10000);
   
		
		try {
			File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(scrFile1, new File ("./Screenshots/vitRegisterTest.png"));
			   System.out.println("vitRegisterTest Saved in Screenshot Folder");
			   
		}catch(Exception e) {
			
		}
		Thread.sleep(5,000);
	}
	

	@Then("^i log out$")
	public void i_log_out() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("a#header-signout")).click();
		
	}
	
	@Then("^i click the account information link$")
	public void i_click_the_account_information_link() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("a#account_info_nav")).click();
		
	}
	
	@Then("^i click on Delete My Online Account link$")
	public void i_click_on_Delete_My_Online_Account_link() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.cssSelector("a#deleteAccountLink")).click();
	}
	
	@Then("^i type DELETE$")
	public void i_type_DELETE() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	   WebDriverWait wait=new WebDriverWait(driver, 100);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#text-delete"))).sendKeys("DELETE");
	   
	}

	@When("^i click the delete button$")
	public void i_click_the_delete_button() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.cssSelector("input#disable")).click();
	}

	@Then("^my account should be deleted$")
	public void my_account_should_be_deleted() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Shop Now", driver.findElement(By.cssSelector("#category-gb-for-home > div > div:nth-child(1) > div > a > div > div > div.btn")).getText());
		System.out.println(driver.findElement(By.cssSelector("#category-gb-for-home > div > div:nth-child(1) > div > a > div > div > div.btn")).getText());
		Thread.sleep(5000);
	}

	@Then("^i click change password$")
	public void i_click_change_password() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#changePassword"))).click();
	   
	}

	@When("^i enter my current password$")
	public void i_enter_my_current_password() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#oldpassword[name='text-current-password']"))).sendKeys("London_123");
		
	}

	@When("^i enter my new password$")
	public void i_enter_my_new_password() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#password[name='text-new-password']")).sendKeys("London_1234");
		
	}

	@When("^i repeat my new password$")
	public void i_repeat_my_new_password() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#confirmpassword[name='text-repeat-password']")).sendKeys("London_1234");
		
	}

	@When("^i click the change password button$")
	public void i_click_the_change_password_button() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#changePasswordBtn")).click();
		
	}
	
	@When("^i click on save changes button$")
	public void i_click_on_save_changes_button() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#update")).click();
		
	}

	@Then("^my password should be changed$")
	public void my_password_should_be_changed() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		String ExpectedMessage = "Sign Out";
		String ActualMessage = driver.findElement(By.cssSelector("a#header-signout")).getText();
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		System.out.println(ActualMessage);
		
		try {
			File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(scrFile1, new File ("./Screenshots/vitChangePasswordTest.png"));
			   System.out.println("vitChangePasswordTest Saved in Screenshot Folder");
			   
		}catch(Exception e) {
			
		}
		Thread.sleep(5,000);
	}		


	@After
	public void TearDown() {
    driver.close();
	//driver.quit();
	}

	
}	
