/**
 * 
 */
package StandAlone;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;
import java.lang.reflect.Method;

import EndToEnd.AncreTest;
import EndToEnd.MultiviewTest;
import EndToEnd.RotationTest;
import EndToEnd.SignetTest;
import EndToEnd.ZoomTest;
import FullActionpage.SaveCancelFonction;
import FullActionpage.deleteFonction;
import annotationHandler.PolygoneannotationHandler;
import annotationHandler.StickyNoteAnnotationHandler;
import annotationHandler.UnderLineHandler;
import annotationHandler.approvedStampHandler;
import annotationHandler.arrowAnnotationHandler;
import annotationHandler.circleAnnotationHandler;
import annotationHandler.draftStampHandler;
import annotationHandler.freeHandAnnotationtHandler;
import annotationHandler.freeStampHandler;
import annotationHandler.freeTextAnnotationHandler;
import annotationHandler.polylineAnnotationHandler;
import annotationHandler.signatureStampHandler;
import annotationHandler.urgentStampHandler;
import fileHandler.AFileUploadBase;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;


/**
 * @author ARIDHI Hichem
 *
 */
public class Pdf_File_Full_RegressionTest extends pageObject.TestBase implements FactoryLocator , FileFactoryLocator {
		
		@Test(priority = 1 ,enabled= true)
	    public void Upload_PDF_File(Method method) throws InterruptedException, IOException {
			
			 page.getInstance(AFileUploadBase.class).doDownloadfile();
			 page.findElement(PopupfileUpload).sendKeys(System.getProperty("user.dir")+"\\DocumentSource\\TestARender.pdf");
			
		try {			
	    	try {
			 page.waitForElementPresent(thumbimage);
		    } catch(Exception e) {
	    	System.out.println("[ERROR] : FILE THUMBER IS NOT DISPLAYED OR TIMEOUT ACCURRED");
	    }
			Thread.sleep(2000);
		
		 if(page.findElement(thumbimage).isDisplayed()) {
			
			 try {
		    Assert.assertNotEquals(page.getInstance(AFileUploadBase.class).getFileContainer(),0);
			} catch(Exception e) {
		    	System.out.println("[ERROR] : FILE ARE NOT DISPLAYED IN FILE COUNTER");
		    }
			
			try {
		    Assert.assertNotEquals(page.getInstance(AFileUploadBase.class).getFileSubNum(),0);
			} catch(Exception e) {
		    	System.out.println("[ERROR] : FILE SUB NUMBER ARE NOT DISPLAYED ON FILE");
		    }
		 }
		}
		
	  catch(Exception e) {
			e.printStackTrace();
		    }
       }
		@Test (priority = 2 , dependsOnMethods="Upload_PDF_File")
		public void Handle_StickyNote_On_PDF (Method method) throws InterruptedException{ 
		
		try {
			page.getInstance(StickyNoteAnnotationHandler.class).checkTestNote();
		 }		
		 finally { 		
		    page.clickOnElement(stkRemove);
	       }	
        }		
		@Test (priority = 3 , dependsOnMethods="Upload_PDF_File")	
	    public void Handle_FreeText_On_PDF (Method method) throws InterruptedException { 
    	 try {
		 page.getInstance(freeTextAnnotationHandler.class).checkFreeTextTest();
     	 }  
		finally { 
			 page.getInstance(deleteFonction.class).deleteFromStyleBar();
	            }	
		}			
		@Test(priority = 4 , dependsOnMethods="Upload_PDF_File")
		public void Handle_Circle___On_PDF (Method method) throws InterruptedException { 
		  try {
			 page.getInstance(circleAnnotationHandler.class).checkCircleTest();
		     }				
	     finally { 
	    	  page.getInstance(deleteFonction.class).deleteFromStyleBar();
		        }	
		}     			
		@Test (priority = 5 , dependsOnMethods="Upload_PDF_File")
		public void Handle_Arrow_On_PDF(Method method) throws InterruptedException {
			try {
				page.getInstance(arrowAnnotationHandler.class).CheckArrowTest();
			 }
	       finally { 
	    	   page.getInstance(deleteFonction.class).deleteFromStyleBar();
		        }	
		} 			
		@Test (priority = 6  , dependsOnMethods="Upload_PDF_File")
		public void Handle_Underline_On_PDF(Method method) throws InterruptedException {
		  try {
			  page.getInstance(UnderLineHandler.class).checkUnderLineTest();
		  }    
	      finally { 
	    	  page.getInstance(deleteFonction.class).deleteFromStyleBar();
		        }	
	     	}      			
		@Test (priority = 7 , dependsOnMethods="Upload_PDF_File")
		public void Handle_freeHand_On_PDF(Method method) throws InterruptedException { 
		   try {
			 page.getInstance(freeHandAnnotationtHandler.class).checkFreeHandTest();
		     }			
	       finally { 
	    	   page.getInstance(deleteFonction.class).deleteFromStyleBar();
		        }	
		}   			
		@Test (priority = 8 , dependsOnMethods="Upload_PDF_File")
		public void Handle_polyline_On_PDF(Method method) throws InterruptedException { 
		try {
		    page.getInstance(polylineAnnotationHandler.class).checkPolylineTest();	
		}			  
	    finally { 
	    	 page.getInstance(deleteFonction.class).deleteFromStyleBar();
		       }	
		}  			
		@Test (priority = 9 ,dependsOnMethods="Upload_PDF_File")
		public void Handel_Polygone_On_PDF(Method method) throws InterruptedException { 
        
		try {
        	page.getInstance(PolygoneannotationHandler.class).checkPolygoneTest();
        }
    	   finally { 
    		   page.getInstance(deleteFonction.class).deleteFromStyleBar();
		       }	
		} 		
		 @Test (priority = 10 ,dependsOnMethods="Upload_PDF_File")
			public void Urgent_Stamp_On_PDF() throws InterruptedException { 
			try {
				page.getInstance(urgentStampHandler.class).checkUrgentStamp();
		    	}	  
			 finally { 
				page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
				page.clickOnElement(thumbExplorerButton);
			 }
		   }
			
			@Test (priority = 11 , dependsOnMethods="Upload_PDF_File")
			public void Approved_Stamp_On_PDF() throws InterruptedException  { 
			try {
				page.getInstance(approvedStampHandler.class).drawApprovedStamp();			
			    }  
			 finally { 
				 page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
				 page.clickOnElement(thumbExplorerButton);
			 }
		    	}
			@Test (priority = 12 ,dependsOnMethods="Upload_PDF_File")
			public void Draft_Stamp_On_PDF() throws InterruptedException  { 
			 try {
				 page.getInstance(draftStampHandler.class).checkDraftStampTest();
				 }
			 finally { 
				 page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
				 page.clickOnElement(thumbExplorerButton);
			     }
		    	}						
			@Test (priority = 13 ,dependsOnMethods="Upload_PDF_File")
			public void Signature_Stamp_On_PDF() throws InterruptedException  { 
		     try {
		    	    page.getInstance(signatureStampHandler.class).checkSignatureStampTest();
		         }  
			 finally { 
				    page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
				    page.clickOnElement(thumbExplorerButton);
			         }     
		    	}
			@Test (priority = 14 ,dependsOnMethods="Upload_PDF_File")
			public void Free_Stamp_On_PDF() throws InterruptedException  { 
				
			   try {
				   page.getInstance(freeStampHandler.class).checkFreeStamp();
			       }
			   
			  finally { 
					 page.getInstance(deleteFonction.class).deleteFromExplorerThumb();
					 page.clickOnElement(thumbExplorerButton);
			       }	        
		    	 }
			
			
			@Test (priority = 15 ,dependsOnMethods={"Upload_PDF_File","Handel_Polygone_On_PDF","Handle_StickyNote_On_PDF"})
			public void delete_Anotation_On_PDF(Method method) throws InterruptedException {				
				    page.getInstance(PolygoneannotationHandler.class).doDrowpolygone();
				    page.getInstance(StickyNoteAnnotationHandler.class).drowNote();
				   
				try {
					page.getInstance(deleteFonction.class).deleteFromExplorerThumb();							  	 
			    	Assert.assertTrue(page.findElement(sadEmptyIcon).isDisplayed(),"ERROR ACCURRED : ANNOTATION ARE DELETED");   		
			        } catch(Exception e) {
						 e.printStackTrace();		
		        }
	        }
			
			@Test (priority = 16 ,dependsOnMethods={"delete_Anotation_On_PDF"})

			public void Refresh_After_Delete_Anotation_On_PDF(Method method) throws InterruptedException {
			    try {
			    	page.clickOnElement(refreshBtn);
  
			  int actualStackPanelSize = page.findElements(stackPanel_content).size();  	
			     Assert.assertEquals(actualStackPanelSize, 0);	
			     
			    } catch(Exception e) {
					 e.printStackTrace();
			    }
			}
			@Test (priority = 17 ,dependsOnMethods="Upload_PDF_File")
			public void SAVE_DATA_ON_PDF(Method method) throws InterruptedException {
	
		     try {
			    	page.getInstance(circleAnnotationHandler.class).doDrowcircle();
			    	page.getInstance(SaveCancelFonction.class).cancelStyleBar();
			    	page.getInstance(SaveCancelFonction.class).saveData();
  	
		 int actualStackPanelSize = page.findElements(stackPanel_content).size();
		     Assert.assertNotEquals(actualStackPanelSize, 0);
			    
		     } catch(Exception e) {
					 e.printStackTrace();	
			}
        }
			@Test (priority = 18 ,dependsOnMethods="SAVE_DATA_ON_PDF")
			public void Refresh_After_Save_Anotation_On_PDF(Method method) throws InterruptedException {
				
			    try {
			    	page.clickOnElement(refreshBtn);
	  	
			   int actualStackPanelSize = page.findElements(stackPanel_content).size();   	
			     Assert.assertNotEquals(actualStackPanelSize, 0);	
			     
			    } catch(Exception e) {
					 e.printStackTrace();
			    }
			}
			@Test (priority = 19 ,dependsOnMethods="Upload_PDF_File")
			public void Add_a_Signet_On_PDF(Method method) throws InterruptedException, IOException {				
				
				SignetTest signet = new SignetTest();	        
				signet.ADD_A_SIGNET(method);
				
	
			}
			@Test (priority = 20 ,dependsOnMethods="Add_a_Signet_On_PDF")
			public void Delete_a_Signet_On_PDF(Method method) throws InterruptedException, IOException {
				try {
				SignetTest signet = new SignetTest();
				signet.DELETE_A_SIGNET(method);
				}
				finally {
					page.clickOnElement(ThumExplorerButton);
				}
			}
			
			@Test (priority = 21 ,dependsOnMethods="Upload_PDF_File")
			public void ADD_AN_ANCRE_On_PDF(Method method) throws InterruptedException, IOException {
				
				AncreTest ancre = new AncreTest();
				ancre.Copy_Ancre(method);
			}
			
			@Test (priority = 22 ,dependsOnMethods="Upload_PDF_File")
			public void SKIP_AN_ANCRE_On_PDF(Method method) throws InterruptedException, IOException {
				
				AncreTest ancre = new AncreTest();
				ancre.Skip_Ancre(method);
			}
			
			@Test (priority = 23 ,dependsOnMethods="Upload_PDF_File")
			public void ZoomIn_On_PDF(Method method) throws InterruptedException, IOException {
				
				ZoomTest zoom = new ZoomTest();
				zoom.zoomIn(method);
			}
			
			@Test (priority = 24 ,dependsOnMethods="Upload_PDF_File")
			public void ZoomOut_On_PDF(Method method) throws InterruptedException, IOException {
				
				ZoomTest zoom = new ZoomTest();
				zoom.zoomOut(method);
			}
			
			@Test (priority = 25 ,dependsOnMethods="Upload_PDF_File")
			public void ZoomInZone_On_PDF(Method method) throws InterruptedException, IOException {
				
				ZoomTest zoom = new ZoomTest();
				zoom.zoomIn_Zone(method);
			}
			
			@Test (priority = 26 ,dependsOnMethods="Upload_PDF_File")
			public void Zoom_Adjust_On_PDF(Method method) throws InterruptedException, IOException {
				
				ZoomTest zoom = new ZoomTest();
				zoom.zoomAdjust(method);
			}
			
			@Test (priority = 27 ,dependsOnMethods="Upload_PDF_File")
			public void Zoom_Text_Box_Control_On_PDF(Method method) throws InterruptedException, IOException {
				
				ZoomTest zoom = new ZoomTest();
				zoom.zoomTextBox(method);
			}
			
			@Test (priority = 28 ,dependsOnMethods="Upload_PDF_File")
			public void Left_Rotation_Control_On_PDF(Method method) throws InterruptedException, IOException {
				
				RotationTest rotation = new RotationTest();
				rotation.leftRotation(method);
			}
			
			@Test (priority = 29 ,dependsOnMethods="Upload_PDF_File")
			public void Right_Rotation_Control_On_PDF(Method method) throws InterruptedException, IOException {
				
				RotationTest rotation = new RotationTest();
				rotation.rightRotation(method);
			}
			
			@Test (priority = 30 ,dependsOnMethods="Upload_PDF_File")
			public void Activate_Multiview_On_PDF(Method method) throws InterruptedException, IOException {
				
				MultiviewTest multiview = new MultiviewTest();
				multiview.Activate_Multiview(method);
			}
			
			@Test (priority = 31 ,dependsOnMethods="Activate_Multiview_On_PDF")
			public void Desactivate_Multiview_On_PDF(Method method) throws InterruptedException, IOException {
				
				MultiviewTest multiview = new MultiviewTest();
				multiview.Desactivate_Multiview(method);
			}
			
			@Test (priority = 32 ,dependsOnMethods="Upload_PDF_File")
			public void Multi_Multiview_On_PDF(Method method) throws InterruptedException, IOException {
				
				MultiviewTest multiview = new MultiviewTest();
				multiview.Multi_Activate_Multiview(method);
			}
}