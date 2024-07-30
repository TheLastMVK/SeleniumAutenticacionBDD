package com.authenticacion.pages;

import org.openqa.selenium.By;
import com.authenticacion.utils.Base;

public class MercanciaPage extends Base {

	
    By btnCircleProfile= By.id("profileCircle");
    By itemChangeProfile= By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[2]/span");
    By titleMercanciaRestringidas = By.xpath("/html/head/title[1]");
    
    
    public void clicChangeProfile() throws InterruptedException { 
    	Thread.sleep(5000);
    	driver.findElement(btnCircleProfile).click();
    	driver.findElement(itemChangeProfile).click();
    	
    }  
    
    public void switchWindow() throws InterruptedException {    
    	Thread.sleep(5000);
    	Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);    	
    }
}
