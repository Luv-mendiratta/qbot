//package com.testcases;
//
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Logger;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import com.main.BasePage;
//import com.main.PageObjectFactory;
//import com.pages.ContentTestingPage;
//import com.pages.ContentTestingPageConstant;
//import com.utils.TestUtils;
//
//
//
//public class HeaderTestPage extends BasePage{
//	
//	private static final Logger logger = Logger.getLogger(HeaderTestPage.class.getName());
//	
//	static TestUtils util = new TestUtils();
//	SoftAssert softAssert = new SoftAssert();
//	
//	static String URLConstant = "http://qobot.co.uk/";
//	
//
//	@Test(priority=1,enabled=verifyQbotlaunch)
//	public static void verifyQbotlaunch() throws Exception 
//	{
//		try {
//			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
//			ContentTestingPage headerPage = PageObjectFactory.getHeaderPage();
//			
//			
////			Assert.assertEquals( headerPage.getlisttext(0), HeaderPageConstant.UpperHeaderList1, "After Landing into home page, Verify the Upper Header text(English)");
////			
//			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			AssertJUnit.fail();
//		}
//
//	}
//
//}
