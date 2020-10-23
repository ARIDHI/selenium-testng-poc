/**
 * 
 */
package Alfresco____TesT;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import FullActionpage.Zoom_In_Out;
import FullActionpage.fullscreen;
import FullActionpage.image_____ProcessinPage;
import FullActionpage.logoPage;
import FullActionpage.naviagationPage;
import FullActionpage.rotation;
import GED_____Base.logIn___Alfresco;
import pageObject.ARender____FactoryPage;
import pageObject.File____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class Full___Regression_onAlfresco extends pageObject.TestBase implements ARender____FactoryPage, File____FactoryPage {
/**
 * 
 * @param method
 * @throws InterruptedException
 * @throws IOException
 */
	@Test(priority = 0, alwaysRun = true ,enabled= true)
    public void Login__toFileNet (Method method) throws InterruptedException, IOException {
		
		 page.getInstance(logIn___Alfresco.class).login(prop.getProperty("usernameAlf"), prop.getProperty("passwordAlf"));
		 Thread.sleep(3000);
		 page.clickOnElement(dossier);
		 page.clickOnElement(File);
		 Thread.sleep(2000);
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[name()='iframe' and contains(@src,'/ARenderHMI/?nodeRef=workspace://SpacesStore/d1badb74-2a74-4da4-a2e6-85961c0314d0&user=admin&alf_ticket=TICKET_8b08bcd225e2e8ea66b492760e9bf677c9607f4f&versionLabel=1.0')]")));
	}
	
	@Test(priority = 1 , enabled =false)	
	   public void Contrast___onBulky_File (Method method) throws InterruptedException, AWTException {  
		  	//TODO change contrast and check that contrast Element exist on DOM && isNot equal to null
		  	 	page.getInstance(image_____ProcessinPage.class).playContrast();
		  	 	try {
		  	 		Assert.assertNotEquals(page.getInstance(image_____ProcessinPage.class).ContrastResult(), 0);
		  	 	   }
		  	  catch(Exception e) {
		  		  e.printStackTrace();
		  	  }
		  	}
	 /**
	  * 
	  * @see naviagationPage.class
	  * @throws InterruptedException
	  */
	  @Test(priority = 2)
	   public void  navigation___onSmall_file(Method method) throws InterruptedException {
	 		
	  // TODO send a page number to the nav text box 	    
	     try {
	 		 page.getInstance(naviagationPage.class).setNavText("5"); 
	        }
	 		    catch(Exception e) {
	 		  		  e.printStackTrace();
	 		  	   }
	 		    
	  // TODO navigate to the next 5 pages	     
	     try {
	 		 page.getInstance(naviagationPage.class).getNext();
	 	   }
	 		    catch(Exception e) {
	 		  		  e.printStackTrace();
	 		  	   }
	 		    
	  // TODO go to the last page   
	     try {
	 		 page.getInstance(naviagationPage.class).getLast();	
	 	   }
	 		    catch(Exception e) {
	 		  		  e.printStackTrace();
	 		  	   }
	 		    
	  // TODO navigate to the previous 4 pages
	 	 try {
	 		 page.getInstance(naviagationPage.class).getPrevious();
	 	   }
	 		    catch(Exception e) {
	 		  		  e.printStackTrace();
	 		  	   }
	 		    
	  //TODO Go back to the first page   	    
	      try {
	 		  page.getInstance(naviagationPage.class).getfirst();
	 	   }
	 		    catch(Exception e) {
	 		  	   }
	 	  }
	  /**
	   * 
	   * @see Zoom_In_Out.class
	   * @param
	   */
	  @Test(priority = 3 , alwaysRun=true )
	  public void zoomIn___onBulky_File (Method method) throws InterruptedException {
		  //TODO 
		  page.getInstance(Zoom_In_Out.class).getZoomIn();  
		  try {
	       Assert.assertTrue((page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg)).contains("Zoom Courant :") ,"error accurerd Test not ok");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }  
	  /**
	   * 
	   * @see Zoom_In_Out.class
	   * @throws InterruptedException
	   */
	  @Test(priority = 4 , alwaysRun=true ,timeOut = 2000)
	  public void zoomOut___onBulky_File (Method method) throws InterruptedException {
		  //TODO
		  page.getInstance(Zoom_In_Out.class).getZoomOut(); 
		  try {
	       Assert.assertTrue((page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg)).contains("Zoom Courant :"),"error accurerd Test not ok");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   * 
	   * @see Zoom_In_Out.class
	   * @throws InterruptedException
	   */
	  @Test(priority = 5, alwaysRun=true ,timeOut = 2000)
	  public void zoomIn_Zone___onBulky_File (Method method) throws InterruptedException {
		  //TODO
		  page.getInstance(Zoom_In_Out.class).ZoomInZone();  
		  try {
	       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   * @see HandlerBasePage.class
	   * @see Zoom_In_Out.class
	   * @throws InterruptedException
	   */
	  @Test(priority = 6 , alwaysRun=true ,timeOut = 5000)
	  public void zoomAdjust___onBulky_File (Method method) throws InterruptedException {
		  //TODO
		  page.getInstance(Zoom_In_Out.class).getFullHeightButton();  
		  try {
	       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok"); 
	       page.getInstance(Zoom_In_Out.class).getFullWidthButton();
	       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");
	       page.getInstance(Zoom_In_Out.class).getFullPageButton();
	       Assert.assertTrue(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg).contains("Zoom Courant :"),"error accurerd Test not ok");   
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   * 
	   * @see Zoom_In_Out.class
	   * @throws InterruptedException
	   */
	  @Test(priority = 7 , alwaysRun=true ,timeOut = 5000)
	  public void zoomTextBox___onBulky_File (Method method) throws InterruptedException {
		  //TODO
		  page.getInstance(Zoom_In_Out.class).setZoomBox(); 
		  try {   
	      Assert.assertEquals(page.getInstance(HandlerBasePage.class).getNotificationMsg(notificationmsg),"Zoom Courant :100.00%", "error accurerd Test not ok");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   *  
	   * @see rotation.class
	   * @throws InterruptedException
	   */
	  @Test(priority = 8, alwaysRun=true ,timeOut = 5000)
	  public void Rotation___onBulky_File(Method method) throws InterruptedException {
		  //TODO
		  try {
		   page.getInstance(rotation.class).getLeftRotate();   
	       page.getInstance(rotation.class).getRightRotate();
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	 /**
	  * 
	  * @see fullscreen.class
	  * @throws InterruptedException
	  */
	  @Test(priority = 9, alwaysRun=true ,timeOut = 6000 , singleThreaded=true, skipFailedInvocations =true )
	  public void fullscreen___onBulky_File(Method method) throws InterruptedException { 
		  //TODO
		  page.getInstance(fullscreen.class).getFullScreen();
		  try {
	       Assert.assertTrue(page.findElement(fullScreen).isDisplayed(), "FULLSCREEN BUTTON IS NOT DISPLAYED");  
	       Assert.assertTrue(page.findElement(verticalSlider).isDisplayed(), "VERTICAL SLIDER BUTTON IS NOT DISPLAYED"); 
	       page.getInstance(fullscreen.class).EscapeFullScreen();
	       Assert.assertTrue(page.findElement(thumbExplorerButton).isDisplayed(), "THUMBER BUTTON IS NOT DISPLAYED");
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  /**
	   * @see logoPage.class	
	   * @see prop.getProperty("ARenderversion")
	   * @throws InterruptedException
	   */
	   @Test(priority = 10)
	    public void logoVersion___onBulky_File (Method method) throws InterruptedException {
	  	 //TODO getText version and compare it with ARenderversion on prop.getProperty()
	      try {
	  	    String ActuelResult = page.getInstance(logoPage.class).VersionCheck();
	  	    String ExpectedResult = (prop.getProperty("ARenderversion"));
	  	    Assert.assertEquals(ActuelResult,ExpectedResult, "ERROR ACCURRED : ARENDER VERSION IS NOT TRUE");        
	  		  }
	  	catch(Exception e){ 
	  		 e.printStackTrace();
	  		 }
	  	  }
}
/**
* 
* 
* @version staging 1.35
* @validate review by ARIDHI Hichem 
* {@docRoot} c:/
* 
* 
*/