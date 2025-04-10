package com.authenticacion.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features", //definimos la ruta de los features
		glue = {"com.authenticacion.steps", "com.authenticacion.utils"}, //ruta de alojamiento de los steps
		plugin = {"pretty", "summary",
				"html:target/cucumber.html",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		},
		publish = true,		
		monochrome = false,
		tags = "@Crear_Cuenta_Exta",
		dryRun = false
		)

public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	
}