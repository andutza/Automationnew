package pages.SignInPage;



import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;




public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;


    private SignInPage() {
    }

    public static SignInPage GetInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private final By logo = By.id("logo");
    private final By signInButton = By.id("btn1");
    private final By skipSignInButton = By.id("btn2");
    private final By emailField = By.id("email");
    private final By nextButton = By.id("enterimg");
    private final By errorMsg = By.id("errormsg");

    //SignIn
    private By signInEmailField = By.xpath("//input[@type='text']");
    private By signInPasswordField = By.xpath("//input[@type='password']");
    private By enterButton = By.id("enterbtn");


    public void clickEnterbutton() {
        LOG.info("Click the 'Enter' Button");
        driver.findElement(enterButton).click();

    }


    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo is displayed");
        return driver.findElement(logo).isDisplayed();// return se foloseste doar la boolean
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if SignInButton is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isSkipSignInButtonDisplayed() {
        LOG.info("Verify if SkipSignInButton is displayed");
        return driver.findElement(skipSignInButton).isDisplayed();
    }

    public boolean isEmailFieldDisplayed() {
        LOG.info("Verify if EmailField is displayed");
        return driver.findElement(emailField).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Click SignInButton");
        driver.findElement(signInButton).click();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click SkipSignInButton");
        driver.findElement(skipSignInButton).click();

    }

    public void typeInEmailField(String email) {
        LOG.info("Type in Email Field");
        driver.findElement(emailField).sendKeys(email);


    }

    public void typeInPasswordField(String password) {
        LOG.info("Type in Email Field");
        driver.findElement(emailField).sendKeys(password);
    }

        public void clickNextButton () {
            LOG.info("Click Next Button");
            driver.findElement(nextButton).click();
        }


        public void typeInSignInPasswordField (String password){
            LOG.info("Typing email address in 'Email' field");
            driver.findElement(signInPasswordField).sendKeys(password);
        }
    public void typeInSignInEmailField(String email) {
        LOG.info("Type in Email address in 'Email' field");
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void clickEnterButton(){
        LOG.info("Click the 'Enter' button");
        driver.findElement(enterButton).click();

    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Verifying if error message is displayed");
        return driver.findElement(errorMsg).isDisplayed();
    }

    public void clickBack(){
        LOG.info("Clicking back in browser");
        driver.navigate().back();
    }



}

