/**
 * 
 */
package FullActionpage;

import org.openqa.selenium.WebDriver;
import Locators.FactoryLocator;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class rightClickFonction  extends HandlerBasePage implements FactoryLocator {

	public rightClickFonction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 public void contextHighlight() throws InterruptedException {
		Thread.sleep(2000);
		builder.contextClick(findElement(drawLocationPath)).perform();
     	clickOnElement(contextSurligner);
        builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
	}
	
	 public void contextCrossed() throws InterruptedException {
	    Thread.sleep(2000);
		builder.contextClick(findElement(drawLocationPath)).perform();
     	clickOnElement(contextBarré);
     	builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
	}

     public void contextHighlighted() throws InterruptedException {
	    Thread.sleep(2000);
	    builder.contextClick(findElement(drawLocationPath)).perform();
 		clickOnElement(contextSouligné);
 	    builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
    }

     public void contextHighlightZone() throws InterruptedException {
	   Thread.sleep(2000);
	   builder.contextClick(findElement(drawLocationPath)).perform();
 	   clickOnElement(contextSurlignerZone);
 	   builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
    }

    public void contextAddCircle() throws InterruptedException {
	   Thread.sleep(2000);
	   builder.contextClick(findElement(drawLocationPath)).perform();
 	   clickOnElement(contextAddCercle);
 	   builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
    }

    public void contextAddArrow() throws InterruptedException {
	   Thread.sleep(2000);
	   builder.contextClick(findElement(drawLocationPath)).perform();
 	   clickOnElement(contextAddflèche);
 	   builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
    }

    public void contextAddSticky() throws InterruptedException {
	   Thread.sleep(2000);
	   builder.contextClick(findElement(drawLocationPath)).perform();
 	   clickOnElement(contextAddStickynote);
  	   builder.dragAndDropBy(findElement(drawLocationPath), 190, 127).build().perform(); 
    }
}