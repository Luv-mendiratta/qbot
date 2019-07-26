package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.BasePage;
import com.utils.TestUtils;

public class HomePage extends BasePage implements HomePageConstant {

	/*Importing the TestUtils */
	TestUtils util = new TestUtils();

	/*Defining the Elements with there respective path*/
	
	@FindBy (xpath="/html/body/div[1]/div[2]/section/div/div[1]/div/div/h1")
	public WebElement Dashboard;
	
	@FindBy (xpath="/html/body/div/div[2]/section/div/div[2]/div[1]/div/h4")
	public WebElement contentTestingLink;
	
	@FindBy (xpath="/html/body/div/div[2]/section/div/div[2]/div[2]/div/h4")
	public WebElement visualTestingLink;
	
	@FindBy (xpath="/html/body/div/div[1]/ul/li[2]/a")
	public WebElement contentNavLink;
	
	@FindBy (xpath="/html/body/div/div[1]/ul/li[3]/a")
	public WebElement visualNavLink;
	
	@FindBy (xpath="/html/body/div/div[2]/section/div/div[2]/div[1]/div/a")
	public WebElement contentTestPage;
	
	@FindBy (xpath="/html/body/div[1]/div[2]/section/div/div[1]/div/div/h1")
	public WebElement ContentTestTilte;
	
	@FindBy (xpath="//*[@id='slick-slide-control32']")
	public WebElement heroSlideridthree;
	
	@FindBy(xpath="//*[@class='slick-prev slick-arrow']")
	public  WebElement previousClick;
	
	@FindBy(xpath="//*[@class='views-field views-field-title']//*[@class='field-content']")
	public WebElement newsSectionList;
	
	@FindBy(xpath="//*[@class='view-header']")
	public  WebElement newsSection;
	
	@FindBy(xpath="//*[@id='article-top']/h1/span")
	public  WebElement articleText;
	
	@FindBy(linkText="See all news")
	public  WebElement newsButton;
	
	@FindBy(xpath="/html/body/div/div[1]/div/section/div/article/div/div/div[4]/div/h2/span")
	public  WebElement galerma;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/ethics-and-values')]")
	public WebElement ethics1;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/support-dermatology-community')]")
	public WebElement dermatology1;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/skinpact-awards')]")
	public WebElement skinpact1;
	
	@FindBy(linkText="Ethics & values")
	public  WebElement ethics;
	
	@FindBy(linkText="Global education initiatives")
	public  WebElement dermatology;
	
	@FindBy(linkText="SKINPACT Awards")
	public  WebElement skinpact;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/your-skin')]")
	public  WebElement readmoreSkin;
	
	@FindBy (xpath="//a[contains(@href,'/template-galderma/stories')]")
	public  WebElement readmoreStories;
	
	
	
	
	/*Implementing the Header Image*/
	public HomePage() throws IOException, InterruptedException  
	{
		PageFactory.initElements(navigate(), this);
	}

	/*Calling the function to open the URL*/
	public void getPageOpened() throws IOException, InterruptedException 
	{
		BasePage.openURL();
	}

	/*Get the latest news Home Page*/
	public static WebElement getLatestNews(int i){
		List<WebElement> links = driver.findElements(By.xpath("//*[@class='views-field views-field-title']//*[@class='field-content']/a"));
		return links.get(i);
	}
	/*Get the latest news on Article Page*/
	public static String getArticlePage(int i){
		List<WebElement> links = driver.findElement(By.xpath("//*[@class='views-field views-field-title']//*[@class='field-content']")).findElements(By.tagName("a"));
		return links.get(i).getText();
	}
	
}
