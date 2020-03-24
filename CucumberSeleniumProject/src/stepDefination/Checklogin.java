package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checklogin 
{
	WebDriver driver;
	@Given("^Opem chrome and start Applicatio$")
	public void opem_chrome_and_start_Applicatio() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.manage().window().maximize();//to maximize the window
		
		
	    
	}

	@When("^I ptovided vadil username and password$")
	public void i_ptovided_vadil_username_and_password() throws Throwable 
	{
		driver.findElement(By.id("Email")).sendKeys("anjalik2997@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Anjali");
	    
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		driver.close();
	    
	}



}
