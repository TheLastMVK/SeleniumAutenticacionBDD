package com.authenticacion.pages;

import org.openqa.selenium.By;
import com.authenticacion.utils.Base;

public class MercanciaPage extends Base {

	
    By btnCircleProfile= By.id("profileCircle");
    By itemAdminProfile= By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span");
    By itemChangeProfile= By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[2]/span");
    By itemCloseSesion = By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[4]/span");
    By titleMercanciaRestringidas = By.xpath("/html/head/title[1]");
    By btnConfirCierre = By.className("swal2-confirm");
    By btnNewPerfil = By.className("btn-success");

    
    public void clicChangeProfile() throws InterruptedException { 
    	Thread.sleep(5000);
    	driver.findElement(btnCircleProfile).click();
    	driver.findElement(itemChangeProfile).click();
    	
    }
    
    public void clicNewProfile() throws InterruptedException { 
    	Thread.sleep(5000);
    	driver.findElement(btnNewPerfil).click();
    }
    
    
    
    
    
    public void switchWindow() throws InterruptedException {    
    	Thread.sleep(5000);
    	Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);    	
    }
    
    
    public void closeSesion() throws InterruptedException { 
    	Thread.sleep(5000);
    	driver.findElement(btnCircleProfile).click();
    	Thread.sleep(2000);
    	driver.findElement(itemCloseSesion).click();
    	Thread.sleep(2000);    	
    	driver.findElement(btnConfirCierre).click();    	
    }  
    
    public void adminCuenta() throws InterruptedException { 
    	Thread.sleep(5000);
    	driver.findElement(btnCircleProfile).click();
    	Thread.sleep(2000);
    	driver.findElement(itemAdminProfile).click();
    	   	
    } 
    
}
