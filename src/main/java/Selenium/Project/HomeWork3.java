package Selenium.Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Homework3
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nvsp.in/Forms/Forms/form6?lang=en-GB");
		driver.findElementById("isExistingVoter").click();
		driver.findElementByXPath("//*[@id=\"applicantName\"]").sendKeys("Test1");
		driver.findElementById("//*[@id=\"applicantName_v1\"]").sendKeys("Test1");
		driver.findElementById("//*[@id=\"applicantSurname\"]").sendKeys("Test2");
		driver.findElementById("//*[@id=\"applicantSurname_v1\"]").sendKeys("Test2");
		driver.findElementById("//*[@id=\"applicantFMHName\"]").sendKeys("Test3");
		driver.findElementById("//*[@id=\"applicantFMHName_v1\"]").sendKeys("Test3");
		driver.findElementById("//*[@id=\"applicantFMHSurname\"]").sendKeys("Test4");
		driver.findElementById("//*[@id=\"applicantFMHSurname_v1\"]").sendKeys("Test4");
		driver.findElementByXPath("//*[@id=\"applicantPresentHouseNo\"]").sendKeys("Houseno:1");
		driver.findElementByXPath("//*[@id=\"applicantPresentHouseNo_v1\"]").sendKeys("H.No:02");
		driver.findElementById("//*[@id=\"applicantPresentStreet\"]").sendKeys("StreetNo:1");
		driver.findElementByXPath("//*[@id=\"applicantPresentStreet_v1\"]").sendKeys("StreetNo:02");
		driver.findElementByXPath("//*[@id=\"applicantPresentVillage\"]").sendKeys("village1");
		driver.findElementByXPath("//*[@id=\"applicantPresentVillage_v1\"]").sendKeys("Village2");
		driver.findElementByXPath("//*[@id=\"applicantPresentPostoffice\"]").sendKeys("post1");
		driver.findElementByXPath("//*[@id=\"applicantPresentPostoffice_v1\"]").sendKeys("post2");
		driver.findElementByXPath("//*[@id=\"applicantPresentPincode\"]").sendKeys("123456");
		driver.findElementByXPath("//*[@id=\"applicantPermanentHouseNo\"]").sendKeys("House11");
		driver.findElementByXPath("//*[@id=\"applicantPermanentHouseNo_v1\"]").sendKeys("House21");
		driver.findElementByXPath("//*[@id=\"applicantPermanentStreet\"]").sendKeys("street11");
		driver.findElementByXPath("//*[@id=\"applicantPermanentStreet_v1\"]").sendKeys("Street21");
		driver.findElementByXPath("//*[@id=\"applicantPermanentVillage\"]").sendKeys("village1");
		driver.findElementByXPath("//*[@id=\"applicantPermanentVillage_v1\"]").sendKeys("village22");
		driver.findElementByXPath("//*[@id=\"applicantPermanentPostoffice\"]").sendKeys("postoffice11");
		driver.findElementByXPath("//*[@id=\"applicantPermanentPostoffice_v1\"]").sendKeys("posto");
		driver.findElementByXPath("//*[@id=\"applicantPermanentPincode\"]").sendKeys("100200");
		driver.findElementById("ddPermanentDist").sendKeys("Test");
		driver.findElementByXPath("//*[@id=\"applicantPrevepicno\"]").sendKeys("123345");
		driver.findElementByXPath("//*[@id=\"applicantFamilyPrevepicno\"]").sendKeys("7890");
		driver.findElementByXPath("//*[@id=\"IS_VISUALLY_IMPAIRED\"]").click();
		driver.findElementByXPath("//*[@id=\"applicantEmail\"]").sendKeys("test@test.com");
		driver.findElementByXPath("//*[@id=\"applicantMobile\"]").sendKeys("5467890090");
		driver.findElementByXPath("//*[@id=\"applicantBirthVillage\"]").sendKeys("testvillage");
		driver.findElementByXPath("//*[@id=\"applicantPreHouseNo\"]").sendKeys("housenumber1");
		driver.findElementByXPath("//*[@id=\"applicantPreVillage\"]").sendKeys("Previllage");
		driver.findElementByXPath("//*[@id=\"applicantPreStreet\"]").sendKeys("prestreet");
		driver.findElementByXPath("//*[@id=\"applicantPrePostoffice\"]").sendKeys("postoffice");
		driver.findElementById("applicantPrePincode").sendKeys("980890");
		driver.findElementByXPath("//*[@id=\"applicantFormPlace\"]").sendKeys("Chennai");
		
		driver.close();
	}

}
