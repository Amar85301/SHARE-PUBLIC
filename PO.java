package PurchaseOrder_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;//This Erro is coming because i used Selenium java in pom.xml.
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PO       //---[NEW PURCHASE AGAINST NONE]---
{
	//static WebDriver driver; //Creating Instance of WebDriver.
	   private static WebElement Element= null; ////Defining "WebElemet as class Variable, so that i do not have to define it in every function
	   
	 
	   
	//________________________________________________________________________________________________________________________________________
	   /*
		 public static WebElement ForCloseing(WebDriver driver)
		   {
		    {
		     if (!driver.findElements(By.xpath("")).isEmpty()) 
		      {
			   WebDriverWait wait = new WebDriverWait(driver, 20);
			    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
			     driver.findElement(By.xpath("")).click();
				  }
				  else 
				  {
				  if(!driver.findElements(By.xpath("")).isEmpty()) 
				  {
				  WebDriverWait wait = new WebDriverWait(driver, 20);
				  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
				  driver.findElement(By.xpath("")).click();
				  }
				  else 
				  {
				  if (!driver.findElements(By.xpath("")).isEmpty()) 
				  {
				  WebDriverWait wait = new WebDriverWait(driver, 20);
				  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
				  driver.findElement(By.xpath("")).click();
				  }}}}
			     return Element;
			    }
		      */   
//_______________________LOGIN_____________________________________________________________________________
		//Instead of void we are  using Return type of function "WebElement" 
public static WebElement UserName(WebDriver driver) //Getting Instance of a Driver from our Test.
{
 Element = driver.findElement(By.id("txtUserName"));  //Storing WebElment in "element1" Variable.
  return Element;    //Also need to Return.				
   }	
    public static WebElement ARROW1(WebDriver driver)
     {
      Element = driver.findElement(By.xpath("//body/form[@id='form1']/div[@id='login-full-wrapper']/div[@id='Div6']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/span[2]/a[1]/i[1]"));
	   return Element;
        }	
public static WebElement PassWord(WebDriver driver)
 {
   Element = driver.findElement(By.id("txtPassword"));
	return Element;
     }	   
      public static WebElement Login(WebDriver driver)
       {		
        Element = driver.findElement(By.id("btnLogin"));
         return Element;
	      }
//________________________PURCHASE ORDER LINK________________________________________________________________________________________________
public static WebElement Purchase_Order(WebDriver driver)
 {
  Element = driver.findElement(By.xpath("//label[contains(text(),'Purchase Orders')]"));
   return Element;
	}
//________________________OUTRIGHT_________________________________________________________________________________________________________________	
	 public static WebElement Outright(WebDriver driver)
	 {
	Element=driver.findElement(By.xpath("//a[contains(text(),'Outright/EX/')]"));
   return Element;
  }       
//________________________PURCHASE ORDER LIST PAGE_________________________________________________________________________________________________________________	
public static WebElement AddNew_ListPage(WebDriver driver)
 {
  Element = driver.findElement(By.name("btnAddNewTop"));
   return Element;
	}
	 public static Select Range_ListPage(WebDriver driver)
	  {		
	   Select range= new Select (driver.findElement(By.id("cmbDate")));
	    return range;
         }
	      public static WebElement Edit_ListPage (WebDriver driver)
	       {
		    Element = driver.findElement(By.id("dgGridView_ctl02_EditView"));
		     return Element;
	          }
	           public static Select OrderNo_ListPage (WebDriver driver)
	            {
Select orderno= new Select (driver.findElement(By.id("cmbOrderText")));
return orderno;
		        }		
	             public static WebElement OrderNo_Field_1_ListPage(WebDriver driver)
	            {
	           Element = driver.findElement(By.id("txtNo"));
	          return Element;
	         }
	        public static WebElement Search_ListPage (WebDriver driver)
	       {
		  Element = driver.findElement(By.id("btnFindNow"));
		 return Element;
	    }
       //-----Advance Search Criteria	
public static WebElement Advance_Search_ListPage(WebDriver driver)  //To click Advance Search button.
 {
  Element = driver.findElement(By.id("imgMasters"));
   return Element;
    }		
     public static WebElement IntOrder_ListPage(WebDriver driver)
	  {
	   Element = driver.findElement(By.id("txtInternalOrderNo"));
	    return Element;
	     }
	      public static Select Status_ListPage(WebDriver driver)
	       {
		    Select status=new Select (driver.findElement(By.id("cmbStatus")));
		     return status;
	          }
	           public static Select Priority_ListPage(WebDriver driver)
	           {
Select priority = new Select (driver.findElement(By.name("cmbPriority")));
return priority;
 }
  public static WebElement Aircraft_ListPage(WebDriver driver)
   {
     Element = driver.findElement(By.name("txtForAircraftSearch"));
      return Element;
	   }
	    public static WebElement Quotation_ListPage(WebDriver driver)
	     {
		  Element = driver.findElement(By.id("txtQuotationNo"));
		   return Element;
	        }
	         public static Select Requisition_ListPage(WebDriver driver)
	          {
Select Req = new Select (driver.findElement(By.id("cmbRequisitionText")));
return Req;
	 }
	  public static WebElement Requisition_Field_1_ListPage(WebDriver driver)
	   {
		Element = driver.findElement(By.id("txtRequisitionNo"));
		 return Element;
	      }
	       public static Select OrderType_ListPage (WebDriver driver)
	        {
		     Select ordertype = new Select (driver.findElement(By.id("cmbSearchOrderType")));
		      return ordertype;
	           }
	public static WebElement part_ListPage (WebDriver driver)
	{
	 Element = driver.findElement(By.id("txtPartNoSearch"));
	  return Element;
	   }
	    public static WebElement Supplier_ListPage (WebDriver driver)
	     {
		  Element = driver.findElement(By.id("txtSupplier"));
		   return Element;
	        }
	public static WebElement PBH_ListPage (WebDriver driver)
	 {
	  Element = driver.findElement(By.name("chkIsPBHPurchase"));
	   return Element;
	    }
	
//________________________ORDER DETAIL PAGE_________________________________________________________________________________________________________________
	
	public static WebElement No_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtNo"));
		Element.clear();
		return Element;
	}
	

	
	public static WebElement IntOrderNo_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtIntOrderNo"));
				return Element;
	}
	public static WebElement ForAircraft_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtAircraftReg"));
		return Element;
	}
	public static WebElement Delivery_InDays_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtDeliveryWithinDays"));
		Element.clear();
		return Element;
	}
	public static WebElement AttachFile_OrderDetailPage(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("btnSelectFile")).click();
		Thread.sleep(2000);
		
		 driver.switchTo().defaultContent();
	 	   driver.switchTo().frame("IFileUpload");
		
		WebElement Upload = driver.findElement(By.id("FileUpload1"));
		Upload.sendKeys("C:/Users/Amar/Pictures/Screenshots/Screenshot (2).png");
		
		driver.findElement(By.id("btnupload")).click();
				
		return Element;	
	}
	public static WebElement Remark_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtOrderRemark"));
		return Element;
	}
	public static WebElement Opening_Line_OrderDetailPage(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtOpeningLine"));
		return Element;
	}
	
	//"SHIPPING - BILLING DETAILS"
	public static WebElement Shipping_Billing_Details(WebDriver driver)
	{
		Element=driver.findElement(By.id("btnShipBill"));
		return Element;
	}
	public static Select BillTo_BillingShipping_Details(WebDriver driver)
	{
		Select Billto = new Select(driver.findElement(By.id("cmbBillType")));
		return Billto;
	}
	public static WebElement Address1_BillingShipping_Details(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtBillingAddress"));
		return Element;
	}
	public static Select ShipTo_BillingShipping_Details (WebDriver driver)
	{
		Select shipto = new Select(driver.findElement(By.name("cmbShipType")));
		return shipto;
	}

	public static WebElement Address2_BillingShipping_Details(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtShippingAddress"));
		return Element;
	}
	public static WebElement Apply_Shipping_Details(WebDriver driver)
	{
		Element =driver.findElement(By.name("btnOkShipBillDetails"));
		return Element;
	}
		
//_____________  //SUPPLIER DETAILS\\____________________________________________________________________________________________________________________________
	   	
	public static Select Name_OrderDetailPage(WebDriver driver)
	{
	Select Vendor=new Select(driver.findElement(By.id("cmbVendorList")));
	//Vendor.selectByVisibleText("ACE AVIATION");
	return Vendor;
	}
	public static WebElement QuotationNo_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtQuotationNo"));
				return Element;	
	}
	
	public static WebElement Order_CongNo_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtOrderConfirmationNo"));
		return Element;
	}
	public static Select Currency_OrderDetailPage(WebDriver driver)
	{
		Select currency=new Select (driver.findElement(By.id("cmbCurrencyList")));
		//currency.selectByVisibleText("Rupees");
		return currency;	
	}
	public static WebElement Factor_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtConversionFactor"));
		return Element;
	}
	public static WebElement Roundoff_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.id("chkIsRoundOff"));
		return Element;
	}

	        //DETAILS\\
	
	public static WebElement Details_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.id("btnAddress"));
		return Element;
	}
	public static WebElement KindAttention_SupplierDetailsPage (WebDriver driver)
	{
		Element=driver.findElement(By.id("txtAttention"));
		return Element;
	}
	public static WebElement Apply_Supplier_DetiailPage(WebDriver driver)
	{
		Element=driver.findElement(By.name("btnOK"));
		return Element;
	}
	public static WebElement Back_SupplierDetailPage(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnVendorDetailsBack"));
		return Element;
	}
	
	
	public static WebElement AddItem_OrderDetailPage(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnAdd"));
		return Element;		
	}
//______________________PART STOCK STATUS LIST___________________________________________________________________________________________________________________

	public static WebElement PartNo_PartStockStatusList(WebDriver driver)
	{
		Element= driver.findElement(By.id("txtSearch"));
		Element.clear();
		return Element;	
	}

	public static WebElement FindNow_PartStockStatusList (WebDriver driver)
	{
		Element=driver.findElement(By.id("btnFindNow"));
	    return Element;	
	}

	public static WebElement SelectPart_PartStockStatusList(WebDriver driver)
	{
		Element=driver.findElement(By.xpath("//a[contains(text(),'Select Part')]"));
		return Element;
	}

	public static WebElement Alert_For_SelectedPart (WebDriver driver)
	{
		Element=driver.findElement(By.id("MSGBoxCtrl_lblMsgTitle"));
		if(Element.isDisplayed())
		{
			System.out.println(Element.getText());
			driver.findElement(By.id("MSGBoxCtrl_btnYes")).click();
			 System.out.println("* --------------Selected Part is already Raised Order");
		}
		else
		{
			 System.out.println("Alert din't Display");
		}
		return Element;
	    }
//______________________//Purchase Order Item New Page\\___________________________________________________________________________________________________________________

	public static Select Part_Type_OrderItem(WebDriver driver)
	{
	    Select Type = new Select(driver.findElement(By.id("cmbPartType")));
		return Type;
	}

	public static WebElement Quantity_OrderItem(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtQty"));
		Element.clear();	
		return Element;
	}

	public static WebElement ListPrice_OrderItem(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtRate"));
		Element.clear();	
		return Element;
	}
	public static WebElement Discount_OrderItem(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtPerDiscount"));
		Element.clear();
		return Element;
	}

	public static Select ApplicableTo_OrderItem(WebDriver driver)
	{
		Select Applicable=new Select(driver.findElement(By.id("cmbApplicable")));
		return Applicable;
	}
	public static Select Priority_OrderItem (WebDriver driver)
	{
		Select Priority = new Select(driver.findElement(By.id("cmbPriority")));
		return Priority;
	}
	public static WebElement RequestedBy_OrderItem(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtRequestedBy"));
		return Element;
	}
	public static WebElement DeliveryIn_OrderItem(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtDeliveryInDays"));
		Element.clear();
		return Element;
	}
	public static WebElement Remark_OrderItem(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtRemark"));
		return Element;
	}
	public static WebElement Note_OrderItem(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtNote"));
		return Element;
	}

	public static WebElement OK_OrderItem(WebDriver driver)
	{
		Element=driver.findElement(By.id("btnSave"));
		return Element;
	}
//________________//ORDER TERMS\\_________________________________________________________________________________________________________________________

	public static WebElement AddTerm_OrderDetails(WebDriver driver)
	{
		Element=driver.findElement(By.id("btnAddTerm"));
		return Element;
	}
	public static WebElement Select_Terms1(WebDriver driver)
	{
		Element=driver.findElement(By.id("dgTerm_ctl05_chkSelect"));
		return Element;
	}

	public static WebElement OK_OrderTerm(WebDriver driver)
	{
		Element = driver.findElement(By.name("btnOK"));
		return Element;
	}
//_____________________//ORDER CHARGES\\____________________________________________________________________________________________________________________
	
	public static WebElement AddCharge_OrderDetailPage(WebDriver driver)
	{
		Element=driver.findElement(By.id("btnAddCharges"));
		return Element;
	}
	public static Select ChargeName_OtherCharge(WebDriver driver)
	{
		Select charge= new Select(driver.findElement(By.id("cmbCharge")));
		return charge;
	}
	public static WebElement Percentage_OrderCharge(WebDriver driver)
	{
		Element=driver.findElement(By.id("txtPercentage"));
		Element.clear();
		return Element;
	}
	public static WebElement ChargeAmount_OrderCharge(WebDriver driver)
	{
		Element=driver.findElement(By.name("txtChargeAmount"));
		Element.clear();
		return Element;
	}
	public static WebElement OK_OrderCharge(WebDriver driver)
	{
		Element=driver.findElement(By.id("btnOK")); 
		return Element;
	}
	public static WebElement Display_OrderCharges_In_Output(WebDriver driver)
	{
		Element=driver.findElement(By.xpath("//*[@id=\"dgOrderCharges\"]/tbody/tr[2]/td[2]"));
		if(Element.isDisplayed())
		{
			System.out.println("Other Charges---->"+Element.getText());
			System.out.println("*__________________________________________________________________________________________________");
		}
		return Element;
	}
//----------------------
	public static WebElement Save(WebDriver driver)
	{
	Element=driver.findElement(By.id("btnSave"));
	return Element;
	}

	public static WebElement Display_SavePO_In_Output(WebDriver driver)
	{
	Element=driver.findElement(By.id("lblTitle"));
	if(Element.isDisplayed())
	{
		System.out.println("Transaction---->" + Element.getText());
		System.out.println("*__________________________________________________________________________________________________");
	}
	return Element;
	}

	public static WebElement Authorize(WebDriver driver) throws InterruptedException
	{
	    Element=driver.findElement(By.id("btnAuthorized"));
	    Thread.sleep(2000);
		return Element;
	}

	public static WebElement Authorize_Yes(WebDriver driver)
	{
		Element=driver.findElement(By.id("MSGBoxCtrl_lblMsgTitle"));
		if(Element.isDisplayed())
		{
			driver.findElement(By.id("MSGBoxCtrl_btnYes")).click();
		}
		else
		{
			System.out.println("Authorization Pop Up Not Displayed ");
		}
		return Element;
	}

	public static WebElement Display_Authorize_Status(WebDriver driver)
	{
		
		Element =driver.findElement(By.id("lblStatus"));
		if(Element.isDisplayed())
		{
			Assert.assertTrue(true);
			System.out.println("Transaction---->" +Element.getText());
			System.out.println("*__________________________________________________________________________________________________");
		}
		return Element;
	    }
  public static WebElement Cancel(WebDriver driver)
  {
 	 Element=driver.findElement(By.id("btnCancel"));
 	 return Element;
  }
  
  public static WebElement Amend (WebDriver driver)
  {
 	 Element=driver.findElement(By.id("btnAmend"));
 	 return Element;
  }
//--------------------------------------------------------- 
  //SEND MAIL\\
	 public static WebElement SendMail(WebDriver driver)
	 {
		 Element=driver.findElement(By.id("btnSendMail"));
		 return Element;
	 }
	 public static WebElement To(WebDriver driver)
	 {
		 Element =driver.findElement(By.name("txtMailIDs"));
		 return Element;
	 }
	 public static WebElement CC(WebDriver driver)
	 {
		 Element=driver.findElement(By.name("txtCCIDs"));
		 return Element;
	 }
	 public static WebElement Send(WebDriver driver)
	 {
		 Element = driver.findElement(By.name("btnSendMail"));
		 return Element; 
	 }
	 public static WebElement Close_SendMail(WebDriver driver)
	 {
		 Element = driver.findElement(By.id("btnBack"));
		 return Element;
	 }
//---------------------------------------------------------
	 public static WebElement Print(WebDriver driver)
	 {
		 Element=driver.findElement(By.id("btnPrint"));
		 return Element;
	 }
	 
	 public static WebElement Close(WebDriver driver)
	 {
		 Element=driver.findElement(By.id("btnBack"));
		 return Element;	
	 }
	 
//$$$$$$$$$$-MATERIAL_IN-$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 
	 public static WebElement Material_In(WebDriver driver)
	 {
		 Element= driver.findElement(By.xpath("//label[contains(text(),'Material In')]"));
		 return Element;
	 }
	 public static WebElement Goods_Recipts(WebDriver driver)
	 {
		 Element=driver.findElement(By.xpath("//tbody/tr[4]/td[1]/ul[1]/li[4]/div[1]/ul[1]/li[2]/a[1]"));
		 return Element;
	 }
	              //For "Add New" button already there
	 
//_______________________//PENDING ORDERS LIST\\_______________________________________________________
	 
	
	 public static WebElement Select_Pending_ORD(WebDriver driver)
	 {
		 Element = driver.findElement(By.xpath("//tbody/tr[2]/td[9]/a[1]"));
		 return Element;
	 }
	 public static WebElement Select_Pending_ORD_Parts(WebDriver driver)
	 {
		 Element = driver.findElement(By.xpath("//tbody/tr[2]/td[7]/a[1]"));
		 return Element;
	 }
//________  //RECEIVING PART\\________________________________________________________________________
	 public static Select Part_Status(WebDriver driver)
	 {
		 Select partstatus = new Select(driver.findElement(By.id("cmbPartType")));
		 return partstatus;
	 }
	 public static WebElement QTY(WebDriver driver)
	 {
		 Element = driver.findElement(By.id("txtQuantity"));
		 Element.clear();
		 return Element;
	 }
	 public static WebElement Release_Note_No(WebDriver driver)
	 {
		 Element = driver.findElement(By.id("txtReleaseNote"));
		 return Element;
	 }
	public static Select Store (WebDriver driver)
	{
		Select store = new Select (driver.findElement(By.id("cmbStore")));
		return  store;
	}
	public static WebElement Rate(WebDriver driver) throws InterruptedException
	{
		Element = driver.findElement(By.id("txtDisplayCRate"));
		//Element.clear();
		Thread.sleep(1000);
		return Element;
	}
	public static WebElement Serial_No(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtSerialNo"));
		return Element;
	}
	public static WebElement Bin_Location(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtLocation"));
		return Element;
	}
	public static WebElement Batch_No(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtBatchNo"));
		return Element;
	}
	public static WebElement OK_Receiving_Part(WebDriver driver)
	{
		Element = driver.findElement(By.name("btnOK"));
		return Element;
	}
	
	public static WebElement Alert_For_GR(WebDriver driver)
	{
		Element = driver.findElement(By.id("MSGBoxCtrl_lblMsgTitle"));
		if(Element.isDisplayed())
		{
			System.out.println(Element.getText());
			driver.findElement(By.id("MSGBoxCtrl_btnYes")).click();
			//System.out.println("");
		}
		return Element;
	}
//___________________//GOODS RECEIPT DETAILS -Page\\______________________
	 
	public static Select Currency_GR(WebDriver driver)
	{
   Select currency = new Select (driver.findElement(By.name("cmbCurrency")));
   return currency;
	}
	public static WebElement Int_Recpt_No(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtInternalReceiptNo"));
		return Element;
	}
	public static WebElement DC_NO(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtDCNo"));
		return Element;
	}
	public static WebElement Supplier_Inv_No(WebDriver driver)
	{
		Element = driver.findElement(By.name("txtVendorInvNo"));
		return Element;
	}
	 public static WebElement Custom_Bill_Entry(WebDriver driver)
	 {
		 Element = driver.findElement(By.name("txtAWBNo"));
		 return Element;
	 }
	public static WebElement RoundOff_Required(WebDriver driver)
	{
		Element = driver.findElement(By.id("chkIsRoundOff"));
		return Element;
	}
	public static WebElement Remark_GR(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtRemark"));
		return Element;
	}
	
	
	public static WebElement Add_Items_GR(WebDriver driver)
	{
	Element = driver.findElement(By.name("btnAddItem"));
	return Element;
	}
	public static WebElement Other_Charges(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnAddCharge"));
		return Element;
	}
	   //--"Inside OTHER cHARGES" page ARE SAME FOR "GR" & IT'S WORKING...
	   //--"SAVE & AUTHORIZE" ARE SAME FOR "GR" & IT'S WORKING...
	public static WebElement Authorize_Yes_GR(WebDriver driver)
	{
		Element = driver.findElement(By.id("MSGBoxCtrl_lblMsgTitle"));
		if(Element.isDisplayed())
		{
			driver.findElement(By.id("MSGBoxCtrl_btnYes")).click();
		}
		return Element;
	}
		
	
}
