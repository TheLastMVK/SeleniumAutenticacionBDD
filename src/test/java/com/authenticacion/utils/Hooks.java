package com.authenticacion.utils;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends Base {


	@BeforeAll
	public static void setUp() {
		
		/*
		ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("120.0.6099.129"); // Para asignar la versión del navegador: (121.0.6167.18) (120.0.6099.129) (63.0.3239.132)
        driver = new ChromeDriver(options);
        */	
			
		
        EdgeOptions options = new EdgeOptions();
        options.setBrowserVersion("120"); //   88.0.705.50   , 120
        driver = new EdgeDriver(options);        	
		
		
		/*
        FirefoxOptions options = new FirefoxOptions();
        options.setBrowserVersion("Quantum"); // 58.0.1
		driver = new FirefoxDriver(options);/*
		*/
		
		/*
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.setBrowserVersion("11");
        driver = new InternetExplorerDriver(options);
      */
        
     
		
		/* 
        SafariOptions options = new SafariOptions();
        options.setBrowserVersion("123");
        driver = new SafariDriver(options);
        */
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
		driver.manage().window().maximize();
        
		//driver.manage().window().setSize(new Dimension(2560, 1440));
		//TABLETS: 1024, 768 AND 1280, 800 AND 800, 480
		//CELULARES: 720,1280 AND 1080,1920        
	}
	
		
	@After	
	public void tearDown(Scenario scenario){		
			if (scenario.isFailed()) {
				String screenName = scenario.getName().replaceAll(" ", " ");
				final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenName);	
			}		
	}	
}