/*3.Write down the following test into ‘RegisterTest’ class
	1.verifyThatSigningUpPageDisplay
			* click on the ‘Register’ link
			* Verify the text ‘Signing up is easy!’
    2.userSholdRegisterAccountSuccessfully
			* click on the ‘Register’ link
			* Enter First name
			* Enter Last name
			* Enter Address
			* Enter City
			* Enter State
			* Enter Zip Code
			* Enter Phone
			* Enter SSN
			* Enter Username
			* Enter Password
			* Enter Confirm
			* Click on REGISTER button
			* Verify the text 'Your account was created successfully. You are now logged in.’
package testsuite;*/
package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest3 extends BaseTest {
    String BaseUrl = "https://parabank.parasoft.com/parabank/index.htm";
    @Before
    public void Setup(){
        openBrowser(BaseUrl);
    }
    @Test
    public void verifyThatSigningUpPageDisplay()
    {
        //Find Register Link and Click on Register link
        WebElement RegisterLink = driver.findElement(By.linkText("Register"));
        RegisterLink.click();

        //This is from requirement
        String expectedMessage = "Signing up is easy!";//variable insilition
        //Find the Signing up is easy! element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println("Actual Message :" + actualMessage);

        //Validate actual and expected message
        Assert.assertEquals("Message is not as expected", expectedMessage, actualMessage);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //Find Register Link field  and Click on Register link
        WebElement RegisterLink = driver.findElement(By.linkText("Register"));
        RegisterLink.click();
        //Find the first name field and enter first name
        WebElement FirstName = driver.findElement(By.id("customer.firstName"));
        FirstName.sendKeys("Beena");
        //Find the Last name field  and enter Last name
        WebElement LastName = driver.findElement(By.id("customer.lastName"));
        LastName.sendKeys("patel");
        //Find the Address field  and enter Address
        WebElement Address = driver.findElement(By.id("customer.address.street"));
        Address.sendKeys("Harrow Close");
        //Find the City field and enter City
        WebElement City = driver.findElement(By.id("customer.address.city"));
        City.sendKeys("Watford");
        //Find the State field and enter State
        WebElement State = driver.findElement(By.id("customer.address.state"));
        State.sendKeys("Hertfordshire");
        //Find the Zip Code field and enter Zip Code
        WebElement ZipCode = driver.findElement(By.id("customer.address.zipCode"));
        ZipCode.sendKeys("WD20 6TZ");
        //Find the Phone field and enter Phone
        WebElement PhoneNumber = driver.findElement(By.id("customer.address.zipCode"));
        PhoneNumber.sendKeys("0790797896");
        //Find the SSN field and enter  SSN
        WebElement  SSNfield  = driver.findElement(By.id("customer.ssn"));
        SSNfield.sendKeys("AA-12-34-56-B");
        //Find the Username field and enter Username
        WebElement  Username  = driver.findElement(By.id("customer.username"));
        Username.sendKeys("Beena-Patel");
        //Find the Password field and enter Password
        WebElement  Password  = driver.findElement(By.id("customer.password"));
        Password.sendKeys("Beena1343");
        //Find the Confirm field and enter ConfirmPassword
        WebElement  ConfirmPassword  = driver.findElement(By.id("repeatedPassword"));
        ConfirmPassword.sendKeys("Beena1343");
        //Find Register field  and Click on Register Field
        WebElement Register = driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        Register.click();

        //This is from requirement
        String expectedMessage = "Your account was created successfully. You are now logged in.";//variable insilition
        //Find the Signing up is easy! element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println("Actual Message :" + actualMessage);

        //Validate actual and expected message
        Assert.assertEquals("Message is not as expected", expectedMessage, actualMessage);
    }
    @After
    //closing the driver
    public void closedown(){
        closeBrowser();
    }
}
