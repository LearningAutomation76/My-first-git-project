package TestLayer;

import BaseLayer.BaseClass;

import Pagelayer.LoginPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test(groups = { "LoginPage" })
public class LoginPageTest extends BaseClass {

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void validateLoginFunctionality() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.typeUsername("prafulp1010@gmail.com");
		loginpage.typePassword("Pr@ful0812");
		loginpage.clickOnLogin();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
