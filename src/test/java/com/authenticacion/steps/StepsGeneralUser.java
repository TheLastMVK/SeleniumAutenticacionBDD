package com.authenticacion.steps;



import com.authenticacion.utils.Base;
import com.authenticacion.utils.Hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.authenticacion.pages.AutenticacionPage;
import com.authenticacion.pages.LoginPage;
import com.authenticacion.pages.MercanciaPage;
import com.authenticacion.pages.ProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepsGeneralUser extends Base{
	
	protected AutenticacionPage autenticacionPage= new AutenticacionPage();
	protected LoginPage loginPage= new LoginPage();
	protected MercanciaPage mercanciaPage= new MercanciaPage();
	protected ProfilePage profilePage= new ProfilePage();
	
	protected Hooks hooks;
	
	public StepsGeneralUser(Hooks hooks) {
		this.hooks = hooks;
	}
	
	/***************ESCENARIO 1****************/
	
	@Given("page of autenticacion is all ready")
	public void page_of_autenticacion_is_all_ready() {
		driver.get(AUT_URL);
	}
	
	@When("guest select MR services")
	public void guest_select_mr_services() throws InterruptedException {
		autenticacionPage.selectOnMR();	
		autenticacionPage.switchWindow();		
	}
	
	@When("user enters credentials {string} and {string}")
	public void user_enters_credentials_and(String email, String password) {
		loginPage.fillOutForm(email, password);
		loginPage.clicOnLogin();
	}
	
	@Then("user can see MR2 page")
	public void user_can_see_mr2_page() {
		

	}
		
	
	/***************ESCENARIO 2 ****************/	
		
	
	@Given("page of MR2 is all ready")
	public void page_of_mr2_is_all_ready() throws InterruptedException {
		
		mercanciaPage.switchWindow();
				
		String expected_title = "Mercancías Restringidas";
		String real_title = driver.getTitle();				
		new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownField")));		
		Assert.assertEquals(real_title, expected_title, "Resultado");			
		
	}
	
	@When("user select option a profile")
	public void user_select_option_a_profile() throws InterruptedException {
		mercanciaPage.clicChangeProfile();

	}
	
	@Then("user can see profile list")
	public void user_can_see_profile_list() throws InterruptedException {
		
		profilePage.switchWindow();

		String expected_title = "Perfiles";
		String real_title = driver.getTitle();				
		new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout-internal/div/mat-drawer-container/mat-drawer-content/div/div/div/app-landing-profile/div/div/div[2]/p")));		
		Assert.assertEquals(real_title, expected_title, "Resultado");	

	}
	
}
