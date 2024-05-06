package Purchase_Order_Transaction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PurchaseOrder_POM.PO;
import XLUTILITY_FILE.XLUTILITY_AMAR_BYTZ;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseOrder                    //......"POM" With "New Purchase" Against "None".......

{
	//----------------------------------
			static void FrameLeft()
			{
			 driver.switchTo().defaultContent();
			  driver.switchTo().frame("FrameLeft");
			   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			    }
			static void FrameCenter() throws InterruptedException
			 {
			  driver.switchTo().defaultContent();
			   driver.switchTo().frame("FrameCentre");
			    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			     }
			//----------------------------------
			
			
		static WebDriver driver=null; //Defining here at class level so it will become Class Variable.
		@BeforeClass
		public void setup() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.navigate().to("https://bytzsoft.in/FlyPalHelp/Index.aspx");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			//LOGIN
			PO.UserName(driver).sendKeys("TEST");
			PO.ARROW1(driver).click();

			PO.PassWord(driver).sendKeys("TEST");
			PO.Login(driver).click();	
			Thread.sleep(5000);

            
			FrameLeft();
			PO.Purchase_Order(driver).click();
			Thread.sleep(1000);
			
			PO.Outright(driver).click();
			Thread.sleep(1000);
			
			FrameCenter();
			
			PO.Range_ListPage(driver).selectByVisibleText("Last 1 Year");
			Thread.sleep(2000);
			PO.Search_ListPage(driver).click();
			Thread.sleep(3000);
			
			
			PO.AddNew_ListPage(driver).click(); //ADD NEW//
			Thread.sleep(3000);
			
			
			
			
			
		}

		//--<ANY DATE>--is not working from Object Repository.
		@Test(priority=1)
		public void Supplier_Order_Details() throws InterruptedException
		{  
			//driver.findElement(By.id("calOrderDate")).click(); //--DATE--<From Object Repo it is not working>
			//Thread.sleep(1000);
			//driver.findElement(By.id("calOrderDate_CalendarExtender_day_3_1")).click();
			//Thread.sleep(1000);
			
			PO.IntOrderNo_OrderDetailPage(driver).sendKeys("85302");
			//PO.For_Aircraft(driver).sendKeys("VT-GSC");
			PO.Delivery_InDays_OrderDetailPage(driver).sendKeys("10");
			
			PO.Name_OrderDetailPage(driver).selectByVisibleText("Airlines Dc");
			Thread.sleep(1000);
			PO.Currency_OrderDetailPage(driver).selectByVisibleText("INR");
			Thread.sleep(1000);	
			
		}

		@Test(priority=2, dataProvider="PartDetails")
		public void Order_Items(String PartNo, String QTY, String Price) throws InterruptedException
		{
			PO.AddItem_OrderDetailPage(driver).click();
			Thread.sleep(1000);
			
			PO.PartNo_PartStockStatusList(driver).sendKeys(PartNo);
			Thread.sleep(1000);
			
			PO.FindNow_PartStockStatusList(driver).click();
			Thread.sleep(1500);
			
			PO.SelectPart_PartStockStatusList(driver).click();
			Thread.sleep(1500);
			
			PO.Alert_For_SelectedPart(driver);
			Thread.sleep(1000);
			
			PO.Quantity_OrderItem(driver).sendKeys(QTY);
			Thread.sleep(1000);
			
			PO.ListPrice_OrderItem(driver).sendKeys(Price);
			Thread.sleep(1000);
		    
			PO.OK_OrderItem(driver).click();
			Thread.sleep(1500);
			
		}
			@Test(priority=3)
			public void Order_Terms() throws InterruptedException
			{
				PO.AddTerm_OrderDetails(driver).click();
				Thread.sleep(2000);
				
				PO.Select_Terms1(driver).click();
				
				PO.OK_OrderTerm(driver).click();
				Thread.sleep(1500);						
			}
		@Test(priority=4)
		public void Order_Chages() throws InterruptedException
		{
		PO.AddCharge_OrderDetailPage(driver).click();
		Thread.sleep(1500);

		PO.ChargeName_OtherCharge(driver).selectByVisibleText("AOG FEE");
		Thread.sleep(1000);

		PO.ChargeAmount_OrderCharge(driver).sendKeys("150");
		Thread.sleep(1000);

		PO.OK_OrderCharge(driver).click();
		Thread.sleep(2500);

		PO.Display_OrderCharges_In_Output(driver);	
		}

		@Test(priority=5)
		public void Save() throws InterruptedException
		{
			PO.Save(driver).click();
			Thread.sleep(1500);
			
			PO.Display_SavePO_In_Output(driver);
			Thread.sleep(2000);	
		}

		@Test(priority=6)
		public void Authorize() throws InterruptedException
		{
		PO.Authorize(driver).click();
		Thread.sleep(2000);
		PO.Authorize_Yes(driver);
		Thread.sleep(1000);
		PO.Display_Authorize_Status(driver);
		Thread.sleep(2500);

		PO.Close(driver).click();
		Thread.sleep(2000);
		}

		@Test(priority=7)
		public void Material_In() throws InterruptedException
		{
			FrameLeft();
			PO.Material_In(driver).click();
			Thread.sleep(1500);
			
			PO.Goods_Recipts(driver).click();
			Thread.sleep(100);
			FrameCenter();
			
			PO.AddNew_ListPage(driver).click();
			Thread.sleep(1500);
		}

		@Test(priority=8)
		public void Pending_Orders() throws InterruptedException
		{
			
		//driver.findElement(By.id("txtDate")).click();//--"DATE" <Form Object Repo> it will not work.
		//Thread.sleep(1000);
		//driver.findElement(By.id("txtDateCalendarExtender_day_4_2")).click();		
		//Thread.sleep(1500);
			
		//  "1st" part Details from 3
		PO.Select_Pending_ORD(driver).click();
		Thread.sleep(1000);
		PO.Select_Pending_ORD_Parts(driver).click();
		Thread.sleep(1000);
			
		}
		@Test(priority=9)
		public void Receiving_Part() throws InterruptedException
		{
			Thread.sleep(1000);
			PO.Store(driver).selectByVisibleText("ADA Maintenance (Chennai)");
			Thread.sleep(1500);
			
			//PO.Rate(driver).clear();
			//Thread.sleep(1000);
			//PO.Rate(driver).sendKeys("1001");
			
			PO.OK_Receiving_Part(driver).click();
			Thread.sleep(2000);
			
			PO.Alert_For_GR(driver);
			Thread.sleep(2500);
			
			PO.Currency_GR(driver).selectByVisibleText("INR");
			Thread.sleep(1000);
			PO.Save(driver).click();  //SAVE & ADD 2nd Item's
			Thread.sleep(3000);
			
		//-------2nd Part--------------------------------------------------------	
			PO.Add_Items_GR(driver).click();
			Thread.sleep(1500);
			PO.Select_Pending_ORD(driver).click();
			Thread.sleep(1000);
			PO.Select_Pending_ORD_Parts(driver).click();
			Thread.sleep(1500);
			
			PO.Store(driver).selectByVisibleText("ADA Maintenance (Chennai)");
			Thread.sleep(1500);
			
			PO.OK_Receiving_Part(driver).click();
			Thread.sleep(1500);
			
			PO.Alert_For_GR(driver);
			Thread.sleep(2500);
			
		//-------3rd Part--------------------------------------------------------	
			/*
		PO.Save(driver).click(); //SAVE & ADD 3rd Item's
		Thread.sleep(3000);
			
		PO.Add_Items_GR(driver).click();	
		Thread.sleep(1500);
		PO.Select_Pending_ORD(driver).click();
		Thread.sleep(1000);
		PO.Select_Pending_ORD_Parts(driver).click();
		Thread.sleep(1500);
		PO.Store(driver).selectByVisibleText("ADA Maintenance (Chennai)");
		Thread.sleep(1500);
		PO.OK_Receiving_Part(driver).click();
		Thread.sleep(1500);
		PO.Alert_For_GR(driver);
		Thread.sleep(2500);
	*/
		}

		@Test(priority=10)
		public void Goods_Receipt_Details() throws InterruptedException
		{
			
			PO.Int_Recpt_No(driver).sendKeys("Int-212");
			Thread.sleep(500);
			PO.DC_NO(driver).sendKeys("DC-101");
			Thread.sleep(500);
			PO.Supplier_Inv_No(driver).sendKeys("D-121");
			Thread.sleep(500);	
		}
				
		@Test(priority=11)	
		public void Other_Charges() throws InterruptedException
		{
			//--Inside "Other Charges"--is working with "PO" object Repository but to display output "title" is not their in GR.
			PO.Other_Charges(driver).click();
			Thread.sleep(1500);
			
			PO.ChargeName_OtherCharge(driver).selectByVisibleText("AOG FEE");
			Thread.sleep(1000);
			
			PO.ChargeAmount_OrderCharge(driver).sendKeys("150");
			Thread.sleep(1000);
			
			PO.OK_OrderCharge(driver).click();	
			Thread.sleep(2500);
		}
			
		@Test(priority=12)
		public void Save_GoodReceipt() throws InterruptedException
		{   
			//--SAVE--is working with "PO" object Repository but to display output "title" is not their in GR.
			PO.Save(driver).click();
			Thread.sleep(3000);
			
			
		}

		@Test(priority=13)
		public void Authorize_GoodReceipt() throws InterruptedException
		{
			//--Authorize--is working with "PO" object Repository but to display output "title" is not their in GR.

			PO.Authorize(driver).click();
			Thread.sleep(2500);
			
			PO.Authorize_Yes_GR(driver);
			Thread.sleep(1000);	
		}


		@DataProvider(name="PartDetails") //"DataProvider" Passes data to test. Using "DataProvider" we can easily inject multiple values in the same Test Case. 
		public String [][] Get_Part_Dataa() throws IOException
		{
		String path= "D:/Amar_TC/DATA_DRIVEN_Sheet/Purchase Order/PO_Datadriven_Bytz.xlsx";	
		XLUTILITY_AMAR_BYTZ xlutil = new XLUTILITY_AMAR_BYTZ(path);	
		int totalrows=xlutil.getRowCount("Purchase_Ord1");
		int totalcols=xlutil.getCellCount("Purchase_Ord1", 1);
		String Test_Amar[][]= new String[totalrows][totalcols];

		for(int i=1; i<=totalrows; i++)
		{
			for(int j=0; j<totalcols; j++)
			{
				Test_Amar[i-1][j]=xlutil.getCellData("Purchase_Ord1", i, j);
				
			}
		}
		return Test_Amar;
		//Test
	}}

