package com.authenticacion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.authenticacion.utils.Base;

public class RegistroPage extends Base{
	
	/* Web elements locators*/	

    By btnFuncionario = By.xpath("/html/body/app-root/app-layout-internal/div/mat-drawer-container/mat-drawer-content/div/div/div/app-register-vuce/div/div/app-idp/div/div[2]/div[2]/div/div/div");
    By btnSunat = By.xpath("/html/body/app-root/app-layout-internal/div/mat-drawer-container/mat-drawer-content/div/div/div/app-register-vuce/div/div/app-idp/div/div[1]/div[2]/div[1]/div[2]");
    By txtUsuario = By.id("usuario");
    By txtClave = By.id("clave");
    By btnIniciarSesion = By.className("auth_button");
    By btnConfAvanz = By.id("details-button");
    By lnkSeguro = By.id("proceed-link");
    
    By txtRucSunat = By.id("txtRuc");
    By txtUsuarioSunat = By.id("txtUsuario");
    By txtContrasenaSunat = By.id("txtContrasena");
    By btnEntrarSunat = By.id("btnAceptar");

	
    By DpdwTipDoc = By.id("mat-select-value-1");
    By itemDni = By.xpath("//*[@id=\"mat-option-1\"]/span");
    By txtNumDoc = By.id("mat-input-0");    
    By btnValidar = By.xpath("/html/body/app-root/app-layout-internal/div/mat-drawer-container/mat-drawer-content/div/div/div/app-register-vuce/div/div/div[2]/app-user-data/form/div[4]/app-personal-data/div/div[2]/div/button");
    By txtFechNac = By.id("mat-input-19");
    By DpdwSex = By.id("mat-select-value-7");
    By itemMas= By.xpath("//*[@id=\"mat-option-5\"]/span");   
    By txtCelular = By.id("mat-input-5");
    
    By txtCorreo = By.id("mat-input-8");
    By txtCorreoConfirm = By.id("mat-input-9");
    
    
    
    
	/* Metodos*/	    
        
    public void clicFuncionario() { 
    	driver.findElement(btnFuncionario).click();
     }   
    
    
    public void clicSunat() { 
    	//driver.findElement(btnSunat).click();
    	driver.get(SUNAT_URL);
    	driver.findElement(btnConfAvanz).click();
    	driver.findElement(lnkSeguro).click();      	
     }
    
    
    public void clicSunat2() { 
    	driver.findElement(btnSunat).click();
    	
     }  
    
    public void logUserFuncionario(String usuario, String clave) { 
    	driver.findElement(txtUsuario).clear();
    	driver.findElement(txtClave).clear();
    	
    	driver.findElement(txtUsuario).sendKeys(usuario);
    	driver.findElement(txtClave).sendKeys(clave);  
    	driver.findElement(btnIniciarSesion).click();
    }
    
    public void logUserSunat(String ruc, String usuario, String contrasena) { 

    	driver.findElement(txtRucSunat).sendKeys(ruc);
    	driver.findElement(txtUsuarioSunat).sendKeys(usuario);  
    	driver.findElement(txtContrasenaSunat).sendKeys(contrasena);
    	driver.findElement(btnEntrarSunat).click();
    }
    
    public void registrarCuentaSunat(String dni) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(DpdwTipDoc).click();
    	Thread.sleep(2000);
    	driver.findElement(itemDni).click();    	
    	driver.findElement(txtNumDoc).sendKeys(dni);
    	driver.findElement(btnValidar).click();
    	
    	driver.findElement(txtFechNac).sendKeys("01021984");
    	
    	driver.findElement(DpdwSex).click();
    	Thread.sleep(2000);
     	driver.findElement(itemMas).click(); 
     	
     	driver.findElement(txtCelular).sendKeys("992229526");
     	
     	driver.findElement(txtCorreo).sendKeys("the.last.maverick@gmail.com");
     	driver.findElement(txtCorreoConfirm).sendKeys("the.last.maverick@gmail.com");
     	
     	new Actions(driver)
    	.sendKeys(Keys.TAB)
    	.sendKeys(Keys.TAB)
    	.sendKeys(Keys.ENTER)
    	.perform();    	
    	
    }
        
    
    public void switchWindow() throws InterruptedException {    
    	Thread.sleep(3000);
    	Object[] windowHandles=driver.getWindowHandles().toArray();
       driver.switchTo().window((String) windowHandles[0]);
    }


}
