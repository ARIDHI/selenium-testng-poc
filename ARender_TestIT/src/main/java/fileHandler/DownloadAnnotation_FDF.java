/**
 * 
 */
package fileHandler;

import org.openqa.selenium.WebDriver;
import pageObject.File____FactoryPage;
import pageObject.HandlerBasePage;

/**
 * @author ARIDHI HICHEM
 *
 */
public class DownloadAnnotation_FDF extends HandlerBasePage  implements File____FactoryPage{
	
	/**
	 * 
	 * @param driver
	 */

	public DownloadAnnotation_FDF(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return
	 */
	public void Dodownloadfdf() {
		clickOnElement(FileMenu); clickOnElement(fdfButton);
		return;
	}
	/**
     * 
     * 
     * @version staging 1.35
     * @validate review by ARIDHI HICHEM
     * {@docRoot} c:/
     * 
     * 
     */
  }

