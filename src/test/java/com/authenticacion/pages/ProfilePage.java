package com.authenticacion.pages;

import com.authenticacion.utils.Base;


public class ProfilePage extends Base{
	
    public void switchWindow() throws InterruptedException {   
    	
    	Thread.sleep(5000);
    	Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[2]);    	
    }
	
	
}
