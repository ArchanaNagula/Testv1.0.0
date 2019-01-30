package Selenium.Project;

import org.openqa.selenium.chrome.ChromeDriver;


public class HomeWork2 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		driver.findElementByLinkText("Sign Up (Registration)").click();
		driver.findElementById("u_id").sendKeys("Testsuper89078");
		//driver.findElementByXPath("//*[@id=\"u_id\"]").sendKeys("selenium123");
		driver.findElementByXPath("//*[@id=\"u_pwd\"]").sendKeys("Test12*!@2");
		driver.findElementByXPath("//*[@id=\"u_repwd\"]").sendKeys("Test12*!@2");
		driver.findElementByXPath("//*[@id=\"u_secans\"]").sendKeys("testanswer");
		driver.findElementByXPath("//*[@id=\"u_name\"]").sendKeys("TestName");
		driver.findElementByXPath("//*[@id=\"u_designation\"]").sendKeys("Test");;
		driver.findElementByXPath("//*[@id=\"u_emailid\"]").sendKeys("test@test.com");
		driver.findElementByXPath("//*[@id=\"u_mobile\"]").sendKeys("1234567890");
		driver.findElementByXPath("//*[@id=\"u_phone\"]").sendKeys("99999999");
		driver.findElementByXPath("//*[@id=\"name\"]").sendKeys("test1");
		driver.findElementByXPath("//*[@id=\"capacity\"]").sendKeys("testcap");
		driver.findElementByXPath("//*[@id=\"address\"]").sendKeys("test address");
		driver.findElementByXPath("//*[@id=\"email\"]").sendKeys("test1@test.com");
		driver.findElementByXPath("//*[@id=\"mcontact\"]").sendKeys("12345678890");
		driver.findElementByXPath("//*[@id=\"contact\"]").sendKeys("9987678");
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[1]/tbody/tr[2]/td[1]/input").sendKeys("test2");
		
		
	
	}

}
