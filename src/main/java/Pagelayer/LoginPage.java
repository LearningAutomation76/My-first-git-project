package Pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	// Page Object model(OR) without Page Factory 
	By username = By.name("email"); 
	By password = By.name("password"); 
	//By loginbutton = By.xpath("//div[text()=’Login’]"); 
	By loginbutton = By.xpath("//div[text()='Login']");
	
 
	
	public LoginPage(WebDriver driver) { 
	super.driver = driver; 
	} 
	 
	// associated method for each and every object. 
	public void typeUsername(String uname) { 
	WebElement wb = driver.findElement(username); 
	if ((wb.isDisplayed()) && (wb.isEnabled())) { 
	wb.sendKeys(uname); 
	} 
	} 
	 
	public void typePassword(String pass) { 
	WebElement wb = driver.findElement(password); 
	if ((wb.isDisplayed()) && (wb.isEnabled())) { 
	wb.sendKeys(pass); 
	} 
	} 
	 
	public void clickOnLogin() { 
	WebElement wb = driver.findElement(loginbutton); 
	if ((wb.isDisplayed()) && (wb.isEnabled())) { 
	wb.click(); 
	} 
	} 
	 
	} 