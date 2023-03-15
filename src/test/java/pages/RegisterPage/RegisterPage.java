package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;
    private By title = By.xpath("//div[h1='Automation Demo Site ']");
    private By formTitle = By.xpath("//div[h2='Register']");
    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Address']");
    private By inputEmailAddress = By.xpath("//input[@type = 'email']");
    private By inputPhoneNumber = By.xpath("//input[@type = 'tel']");

    private By languageField = By.id("msdd");

    String selectLanguage = "//a[contains(text(), '%s')]";




    private RegisterPage(){

    }

    public static RegisterPage getInstance() {
    if (instance == null) {
        instance = new RegisterPage();
    }
    return instance;
    }
    public boolean IsTitleDisplayed(){
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }
    public boolean IsFormTitleDisplayed() {
        LOG.info("Verify if formTitle is displayed");
        return driver.findElement(formTitle).isDisplayed();
    }

    public void typeInFirstName(String fName){
        LOG.info("Type In FirstName");
        driver.findElement(inputFirstName).sendKeys(fName);

    }

    public void typeInLastName(String lName){
        LOG.info("Type In LastName");
        driver.findElement(inputLastName).sendKeys(lName);

    }
    public void typeInAddress(String Address){
        LOG.info("Type In Address");
        driver.findElement(inputAddress).sendKeys(Address);


    }

    public void typeInEmailAddress(String emailAddress){
        LOG.info("Type In EmailAddress");
        driver.findElement(inputEmailAddress).sendKeys(emailAddress);


    }


    public void typeInPhoneNumber(String phoneNumber){
        LOG.info("Type In PhoneNumber");
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);


    }

    public void selectLanguage(String language){
        LOG.info("Select language");
        driver.findElement(languageField).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();



    }



}
