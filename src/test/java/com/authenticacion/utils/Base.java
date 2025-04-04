package com.authenticacion.utils;


import org.openqa.selenium.WebDriver;

/*
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
*/

public class Base {
	public static WebDriver driver;
	public static int TIME_OUT = 15;
	public String AUT_URL= "https://landing-test.vuce.gob.pe/autenticacion2/landing-componentes/components";
	public String MR2_URL= "https://landing-test.vuce.gob.pe/mr2/mr2-ui/";
	public String SUNAT_URL = "https://api-seguridad-test.sunat.gob.pe:444/v1/clientessol/19fe45b6-e5a6-44a7-9002-4a60a25f3ac5/oauth2/login?originalUrl=https://authorize-test.vuce.gob.pe/public/authorization/oauth2-sol&state=6696fc8c0ddf67f1e01ec54830b1d3a8";
	//allure serve allure-results
	
	
}