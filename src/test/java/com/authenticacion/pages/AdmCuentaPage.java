package com.authenticacion.pages;

import org.openqa.selenium.By;

import com.authenticacion.utils.Base;

public class AdmCuentaPage extends Base{
	
	/* Web elements locators*/	

    By btnSeguridad = By.xpath("//*[@id=\"mat-tab-label-0-2\"]");
    By txtCorreoElectronico = By.id("mat-input-9");
    By txtConfirmarCorreoElectronico = By.id("mat-input-10");
    By btnActCorreo = By.xpath("/html/body/app-root/app-layout-internal/div/mat-drawer-container/mat-drawer-content/div/div/div/app-admin-data/mat-tab-group/div/mat-tab-body[3]/div/app-security/div/div/form[1]/div[2]/div[2]/button");
    
    By txtContrasenaActual = By.id("mat-input-11");
    By txtContrasenaNueva = By.id("mat-input-12");
    By txtContrasenaNuevaConfirmacion = By.id("mat-input-13");
    By btnActContrasena = By.xpath("/html/body/app-root/app-layout-internal/div/mat-drawer-container/mat-drawer-content/div/div/div/app-admin-data/mat-tab-group/div/mat-tab-body[3]/div/app-security/div/div/form[2]/div[5]/div[2]/button");
    
                                     

	
	/* Metodos*/	    
        
    public void actualizaCuenta() { 
    	driver.findElement(btnSeguridad).click();
     }   
    
    
    public void ActualizaMailPass(String password, String nuevocorreo, String nuevacontrasena) { 
    	driver.findElement(txtCorreoElectronico).clear();
    	driver.findElement(txtCorreoElectronico).sendKeys(nuevocorreo);
    	driver.findElement(txtConfirmarCorreoElectronico).sendKeys(nuevocorreo);
    	driver.findElement(btnActCorreo).click();
    	
    	driver.findElement(txtContrasenaActual).sendKeys(password); 
    	driver.findElement(txtContrasenaNueva).sendKeys(nuevacontrasena);
    	driver.findElement(txtContrasenaNuevaConfirmacion).sendKeys(nuevacontrasena);
    	driver.findElement(btnActContrasena).click();   	
    	
    	
   	
    }  

}
