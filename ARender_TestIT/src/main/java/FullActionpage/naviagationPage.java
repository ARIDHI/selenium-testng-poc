/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.ARender____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author Lenovo
 *
 */
public class naviagationPage extends HandlerBasePage implements ARender____FactoryPage {
/**
 * 
 * @param driver
 */
	public naviagationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @return
 */
	public WebElement getNext() {	
		for(int i=1 ; i<5 ;i++) {	
		 clickOnElement(nextButton);	
		}
		return null ;
	}
	
	public void getPrevious() {
		for(int i=1 ; i<4 ;i++) {	
		 clickOnElement(prevButton);		 
		}
	}
	
	public void getLast() {
		   clickOnElement(lastPageButton);
	  }
	
	public void getfirst() {
	 	   clickOnElement(firstPageButton);	  
	 }

	public void setNavText(String i) {
		
		 builder.doubleClick(findElement(navigationTextBox)).sendKeys(i)
		 .sendKeys(Keys.ENTER)
		 .build().perform(); 
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