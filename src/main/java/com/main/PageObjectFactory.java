package com.main;

import java.io.IOException;

import com.pages.ReportPage;
import com.pages.ContentTestingPage;
import com.pages.HomePage;


public class PageObjectFactory {
	
	public static ContentTestingPage  contentTestingPage = null;
	public static HomePage homePage = null;
	public static ReportPage reportPage = null;
	
	/*Mapping Header Page with the HeaderPage Test Cases*/
	public static HomePage getHomePage() throws IOException, InterruptedException  
	{
		if (homePage == null)
			homePage = new HomePage();
		return homePage;
	}
	public static ContentTestingPage getContentTestingPage() throws IOException, InterruptedException  
	{
		if (contentTestingPage == null)
			contentTestingPage = new ContentTestingPage();
		return contentTestingPage;
	}
	
	public static ReportPage getReportPage() throws IOException, InterruptedException  
	{
		if (reportPage == null)
			reportPage = new ReportPage();
		return reportPage;
	}
	
}
