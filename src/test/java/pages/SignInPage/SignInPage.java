package pages.SignInPage;

import jdk.internal.org.jline.utils.Log;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.io.StringReader;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;
    private Object email;

    private SignInPage(){}
    public static SignInPage GetInstance(){
        if (instance == null){
            instance = new SignInPage();
        }
        return instance;
    }

    private final By logo = By.id("logo");
    private final By SignInButton = By.id("btn1");
    private final By SkipSignInButton = By.id("btn2");
    private final By emailField = By.id("email");
    private final By nextButton = By.id("entering");


    public boolean isLogoDisplayed(){
        LOG.info("Verify if Logo is displayed");
        return driver.findElement(logo).isDisplayed();// return se foloseste doar la boolean
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if SignInButton is displayed");
        return driver.findElement(SignInButton).isDisplayed();// return se foloseste doar la boolean
    }

    public boolean isSkipSignInButtonDisplayed() {
        LOG.info("Verify if SkipSignInButton is displayed");
        return driver.findElement(SkipSignInButton).isDisplayed();// return se foloseste doar la boolean
    }

    public boolean isemailFieldDisplayed() {
        LOG.info("Verify if emailField is displayed");
        return driver.findElement(emailField).isDisplayed();// return se foloseste doar la boolean
    }

    public void clickSignInButton() {
        LOG.info("Click SignInButton");
        driver.findElement(SignInButton).click();

        public void clickSkipSignInButton () {
            LOG.info("Click SkipSignInButton");
            driver.findElement(SkipSignInButton).click();

        }
        public void typeInEmailField (String email){
            LOG.info("Type in Email Field");
            driver.findElement(emailField).sendKeys(email);


        }

        public void clickNextButton() {
            LOG.info("Click Next Button");
            driver.findElement(nextButton).click();
        }
    }

