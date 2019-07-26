package com.testcases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.main.BasePage;
import com.main.PageObjectFactory;
import com.pages.ContentTestingPage;
import com.pages.ContentTestingPageConstant;
import com.pages.HomePage;
import com.pages.HomePageConstant;
import com.pages.ReportPage;
import com.pages.ReportPageConstant;

import org.openqa.selenium.support.ui.Select;


import com.utils.TestUtils;
import org.openqa.selenium.Keys;

public class HomeTestPage extends BasePage{

	private static final Logger logger = Logger.getLogger(HomeTestPage.class.getName());

	static TestUtils util = new TestUtils();
	SoftAssert softAssert = new SoftAssert();

static String TestFile = System.getProperty("user.dir")+"/ExportedPDFLink/DataExportedLink.txt";
    static String ExcelLink = System.getProperty("user.dir")+"/Excel/english.xlsx";
	
	  


	@Test(priority=1,enabled=verifyQbotlaunch)
	public static void verifyQbotlaunch() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HomePage homePage = PageObjectFactory.getHomePage();
			logger.info("Verify the Home Page");
			util.wait(2);
			Assert.assertEquals(homePage.Dashboard.getText(), HomePageConstant.dashboard, "Verify the User is landing to the correct page");
			Assert.assertEquals(homePage.contentTestingLink.getText(), HomePageConstant.contentTestingLink, "Verify the Content Testing Section is Present");
			Assert.assertEquals(homePage.visualTestingLink.getText(), HomePageConstant.visualTestingLink, "Verify the Visual Testing Section is Present");
			Assert.assertEquals(homePage.contentNavLink.getText(), HomePageConstant.contentTestingNav, "Verify the Content Testing NAV Section is Present");
			Assert.assertEquals(homePage.visualNavLink.getText(), HomePageConstant.visualTestingNav, "Verify the Visual Testing NAV Section is Present");
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}


	@Test(priority=2,enabled=verifyContentTesting)
	public static void verifyContentTesting() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HomePage homePage = PageObjectFactory.getHomePage();
			ContentTestingPage contentTestingPage = PageObjectFactory.getContentTestingPage();
			logger.info("Verify the Home Page");
			util.wait(2);
			homePage.contentTestPage.click();
			Assert.assertEquals(homePage.ContentTestTilte.getText(), ContentTestingPageConstant.Title, "Verify the Title of the Page");
			Select option = new Select(driver.findElement(By.xpath("//*[@id='excel_url_sel']")));
			option.selectByVisibleText("URL");
			contentTestingPage.OriginalURL.sendKeys("https://en.wikipedia.org/wiki/Selenium_(software)");
			String URLTested = contentTestingPage.OriginalURL.getAttribute("value");
			contentTestingPage.MatchedURL.sendKeys("https://en.wikipedia.org/wiki/Selenium_(software)");
			contentTestingPage.executeButton.click();
			util.wait(4);
			Assert.assertEquals(contentTestingPage.contentOutput1.getText(), ContentTestingPageConstant.contentOutput1, "Verify the Excel Data is Present");
			Assert.assertEquals(contentTestingPage.ContentOutput2.getText(), ContentTestingPageConstant.contentOutput2, "Verify the Web Data is Present");
			util.scrollDown();
			contentTestingPage.exportData.click();
			util.handles(1);
			util.wait(4);
			FileWriter fr=new FileWriter(TestFile);
			BufferedWriter br=new BufferedWriter(fr);
			br.write(driver.getCurrentUrl());
			br.close();
			driver.close();
			util.handles(0);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			contentTestingPage.crossButton.click();
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}
	
	@Test(priority=3,enabled=verifyContentReports)
	public static void verifyContentReports() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HomePage homePage = PageObjectFactory.getHomePage();
			ContentTestingPage contentTestingPage = PageObjectFactory.getContentTestingPage();
			ReportPage reportPage = PageObjectFactory.getReportPage();
			String URLTested = contentTestingPage.OriginalURL.getAttribute("value");
			logger.info("Verify the Home Page");
			contentTestingPage.reportSection.click();
			util.wait(2);
			Assert.assertEquals(reportPage.TitleText.getText(), ReportPageConstant.Title, "Verify the User landed to the Report Page");
			Assert.assertEquals(reportPage.Urltested.getText(), URLTested, "Verify the the report is generated of same URL=");
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}

	@Test(priority=4,enabled=verifyUsingExcel)
	public static void verifyUsingExcel() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HomePage homePage = PageObjectFactory.getHomePage();
			ContentTestingPage contentTestingPage = PageObjectFactory.getContentTestingPage();
			logger.info("Verify the Home Page");
			util.wait(2);
			contentTestingPage.homeBreadcrum.click();
			homePage.contentTestPage.click();
			Assert.assertEquals(homePage.ContentTestTilte.getText(), ContentTestingPageConstant.Title, "Verify the Title of the Page");
			Select option = new Select(driver.findElement(By.xpath("//*[@id='excel_url_sel']")));
			option.selectByVisibleText("Excel");
			contentTestingPage.importExcel.sendKeys(ExcelLink);
			String URLTested = contentTestingPage.importExcel.getAttribute("value");
			contentTestingPage.MatchedURL.sendKeys("https://www.nestlepurelife.com/us/en/campaign");
			contentTestingPage.executeButton.click();
			util.wait(4);
			Assert.assertEquals(contentTestingPage.contentOutput1.getText(), ContentTestingPageConstant.contentOutput1, "Verify the Excel Data is Present");
			Assert.assertEquals(contentTestingPage.ContentOutput2.getText(), ContentTestingPageConstant.contentOutput2, "Verify the Web Data is Present");
			util.scrollDown();
			contentTestingPage.exportData.click();
			util.handles(1);
			util.wait(4);
			FileWriter fr=new FileWriter(TestFile);
			BufferedWriter br=new BufferedWriter(fr);
			br.write(driver.getCurrentUrl());
			br.close();
			driver.close();
			util.handles(0);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			contentTestingPage.crossButton.click();
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}

	
	@Test(priority=5,enabled=verifyExcelReports)
	public static void verifyExcelReports() throws Exception 
	{
		try {
			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
			HomePage homePage = PageObjectFactory.getHomePage();
			ContentTestingPage contentTestingPage = PageObjectFactory.getContentTestingPage();
			ReportPage reportPage = PageObjectFactory.getReportPage();
			String URLTested = contentTestingPage.MatchedURL.getAttribute("value");
			logger.info("Verify the Home Page");
			contentTestingPage.reportSection.click();
			util.wait(2);
			Assert.assertEquals(reportPage.TitleText.getText(), ReportPageConstant.Title, "Verify the User landed to the Report Page");
			Assert.assertEquals(reportPage.Urltested.getText(), URLTested, "Verify the the report is generated of same URL=");
			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail();
		}

	}


}
