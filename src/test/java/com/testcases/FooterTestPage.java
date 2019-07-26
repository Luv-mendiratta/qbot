//package com.testcases;
//
//import java.util.logging.Logger;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//import com.main.BasePage;
//import com.main.PageObjectFactory;
//import com.pages.AboutUsPage;
//import com.pages.BrandsPage;
//import com.pages.CareerPage;
//import com.pages.FooterPage;
//import com.pages.FooterPageConstant;
//import com.pages.HeaderPage;
//import com.pages.HomePage;
//import com.pages.HomePageConstant;
//import com.pages.InnovationPage;
//import com.pages.MediaPage;
//import com.pages.SocietyPage;
//import com.pages.StoriesPage;
//import com.pages.YourSkinPage;
//import com.utils.TestUtils;
//
//public class FooterTestPage extends BasePage{
//	private static final Logger logger = Logger.getLogger(HeaderTestPage.class.getName());
//	
//	static TestUtils util = new TestUtils();
//	SoftAssert softAssert = new SoftAssert();
//	static String URLConstant = "https://galderma:exert-shaky-visor@stage.master3.galderma.com";
//
//	@Test(priority=1,enabled=verifyFooter)
//	public static void verifyFooter() throws Exception 
//	{
//		try {
//			testInfo = reports.createTest(new Object(){}.getClass().getEnclosingMethod().getName(), "This test is for Verfiy the header links");
//			HomePage homePage = PageObjectFactory.getHomePage();
//			HeaderPage headerPage = PageObjectFactory.getHeaderPage();
//			FooterPage footerPage = PageObjectFactory.getFooterPage();
//			AboutUsPage aboutUs = PageObjectFactory.getAboutUsPage();
//			StoriesPage stories = PageObjectFactory.getStoriesPage();
//			YourSkinPage skin = PageObjectFactory.getYourSkinPage();
//			InnovationPage innovation = PageObjectFactory.getInnovationPage();
//			MediaPage media = PageObjectFactory.getMediaPage();
//			SocietyPage society = PageObjectFactory.getSocietyPage();
//			CareerPage career = PageObjectFactory.getCareerPage();
//			BrandsPage brand = PageObjectFactory.getBrandsPage();
//			logger.info("Verify the Footer links");
//			headerPage.mainLogo.click();
//			util.handles(1);
//			util.wait(2);
//			util.scroll(3500);
//			Assert.assertEquals(footerPage.galdermaLogo.getAttribute("href"), URLConstant+FooterPageConstant.logoLink, "After Landing into home page, Verify the Hero Slider 1st slide");
//			util.wait(3);
//			footerPage.aboutUs.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.aboutUs.getText(), FooterPageConstant.aboutUs, "After Landing into home page, Verify the About Us links");
//			util.wait(3);
//			footerPage.yourSkin.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.yourSkin.getText(), FooterPageConstant.skin, "After Landing into home page, Verify the Skin links");
//			util.wait(3);
//			footerPage.stories.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.stories.getText(), FooterPageConstant.stories, "After Landing into home page, Verify the Soties links");
//			util.wait(3);
//			footerPage.innovation.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.innovation.getText(), FooterPageConstant.innovation, "After Landing into home page, Verify the Innovation links");
//			util.wait(3);
//			footerPage.brands.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.brands.getText(), FooterPageConstant.brands, "After Landing into home page, Verify the Brands links");
////			util.wait(3);
////			footerPage.society.click();
////			util.wait(5);
////			driver.close();
////			util.handles(1);
////			Assert.assertEquals(footerPage.society.getText(), FooterPageConstant.society, "After Landing into home page, Verify the footer links");
////			util.wait(3);
//			footerPage.media.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.media.getText(), FooterPageConstant.media, "After Landing into home page, Verify the Media links");
//			util.wait(3);
//			footerPage.career.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.career.getText(), FooterPageConstant.careers, "After Landing into home page, Verify the Career links");
//			util.wait(3);
//			footerPage.privacy.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			String privacydata = "Your Data";
//			Assert.assertEquals(privacydata, FooterPageConstant.privacy, "After Landing into home page, Verify the Privacy Data links");
//			util.wait(3);
//			footerPage.termsUse.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.termsUse.getText(), FooterPageConstant.terms, "After Landing into home page, Verify the Terms & Use links");
//			util.wait(3);
//			footerPage.sitemap.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.sitemap.getText(), FooterPageConstant.sitemap, "After Landing into home page, Verify the Site Map links");
//			util.wait(3);
//			footerPage.contactUs.click();
//			util.wait(5);
//			driver.close();
//			util.handles(1);
//			Assert.assertEquals(footerPage.contactUs.getText(), FooterPageConstant.contact, "After Landing into home page, Verify the Contact links");
//			TestUtils.getscreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			Assert.fail();
//		}
//
//	}
//
//}
