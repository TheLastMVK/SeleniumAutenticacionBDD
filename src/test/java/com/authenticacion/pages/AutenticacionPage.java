package com.authenticacion.pages;

import org.openqa.selenium.By;

import com.authenticacion.utils.Base;

public class AutenticacionPage extends Base{

	/* Web elements locators*/	
    By BtnSerMr = By.xpath("/html/body/app-root/app-home/div/div[3]/div/app-component-content/div/div[2]/div/div[1]/button[1]");
	
    
    /* Metodos */	
    public void selectOnMR() {
    	driver.findElement(BtnSerMr).click();
    }

    public void switchWindow() throws InterruptedException {    
    	Thread.sleep(3000);
    	Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);    	
    }
}
