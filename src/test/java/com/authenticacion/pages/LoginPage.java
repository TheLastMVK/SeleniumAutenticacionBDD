package com.authenticacion.pages;

import org.openqa.selenium.By;

import com.authenticacion.utils.Base;

public class LoginPage extends Base{
	
	/* Web elements locators*/	
    By inputTxtEmail = By.id("user");
    By inputTxtPassword = By.id("password-field");
    By btnSubmitLogin = By.id("btn-login");
    By btnClose = By.className("btn-light");
    By btnIngresar = By.xpath("/html/body/app-root/app-landing-auth/div[2]/div/div/div[2]/div/div[1]/div/button");
    By lnkCrearCuenta = By.xpath("/html/body/app-root/app-landing-auth/div[2]/div/div/div[2]/div/div[2]/div[1]/a");
    
    
    
    

	
	/* Metodos*/	    
    
    
    public void closePopUp() { 
    	driver.findElement(btnClose).click();
     }   
    
    
    public void clicCrearCuenta() { 
    	driver.findElement(lnkCrearCuenta).click();
     } 
    
    
    public void fillOutForm(String email, String password) { 
    	driver.findElement(inputTxtEmail).clear();
    	driver.findElement(inputTxtPassword).clear();
    	
    	driver.findElement(inputTxtEmail).sendKeys(email);
    	driver.findElement(inputTxtPassword).sendKeys(password);   	
    }  
        
    public void clicOnLogin() {
    	driver.findElement(btnSubmitLogin).click();  	    	
    }
    
    public void clicIngresar() {
    	driver.findElement(btnIngresar).click();  	    	
    }
    

}
