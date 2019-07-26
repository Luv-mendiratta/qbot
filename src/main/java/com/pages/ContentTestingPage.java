package com.pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;


public class ContentTestingPage extends BasePage implements ContentTestingPageConstant  {

	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/
	@FindBy (xpath="//*[@id='content_form']/div[1]/div[2]/div/label/span/input")
	public WebElement importExcel;

	@FindBy (xpath="//*[@id='exampleInputEmail1']")
	public WebElement MatchedURL;

	@FindBy (xpath="//*[@id='content_form']/div[3]/button")
	public WebElement executeButton;

	@FindBy (xpath="//*[@id='content_form']/div[1]/div[3]/input")
	public WebElement OriginalURL;

	@FindBy (xpath="//*[@id='content_output']/div/div[1]/div/h2")
	public WebElement contentOutput1;

	@FindBy (xpath="//*[@id='content_output']/div/div[2]/div/h2")
	public WebElement ContentOutput2;

	@FindBy (xpath="//*[@id='export_data']")
	public WebElement exportData;

	@FindBy (xpath="//*[@id='icon']/iron-icon")
	public WebElement download;

	@FindBy (xpath="//*[@id='exampleModal']/div/div/div[1]/button")
	public WebElement crossButton;

	@FindBy (xpath="/html/body/div[1]/div[2]/section/div/div[1]/div/div/div[2]/a/i")
	public WebElement reportSection;
	
	@FindBy (xpath="/html/body/div[1]/div[2]/section/div/div[1]/div/div/div[1]/ol/li[1]/a")
	public  WebElement homeBreadcrum;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/')]")
	public WebElement mainLogo;

	@FindBy (xpath="//*[@id='main-menu']/li")
	public  List<WebElement> MainMenu;
	
	@FindBy (xpath="/html/body/div/div[1]/div/div/div/ol/li[1]/a")
	public  WebElement homeNavigation;
	

	/*Implementing the Header Image*/
	public ContentTestingPage() throws IOException, InterruptedException  
	{
		PageFactory.initElements(navigate(), this);
	}

	/*Calling the function to open the URL*/
	public void getPageOpened() throws IOException, InterruptedException 
	{
		BasePage.openURL();
	}

	
	/*Click on the navigation */
	public static WebElement getNavigation(int i){
		List<WebElement> links = driver.findElement(By.xpath("//*[@id='main-menu']")).findElements(By.tagName("li"));
		return links.get(i);
	}
	
	/*Click on the global header */
	public static void getHeaderPage(int i){
		List<WebElement> links = driver.findElement(By.xpath("//*[@id='main-menu']")).findElements(By.tagName("li"));
		//List<WebElement> links = globalHeader1.findElements(By.tagName("li"));
		System.out.println(links.get(i).getText());
		links.get(i).click();
	}
	
	




}
