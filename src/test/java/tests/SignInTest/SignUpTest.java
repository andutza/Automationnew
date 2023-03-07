package tests.SignInTest;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage.SignInPage;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;


public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);
    private String newUrl = getBaseUrl() + "Index.html";

    @Test
    public void signUp() {
        String email = "Email@example.com";
        String password = "12345";

        LOG.info("Navigate to Sign Up Page");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sign in is not displayed");
        Assert.assertTrue(signInPage.isSkipSignInButtonDisplayed(), "Skip Sign in is not displayed");
        signInPage.clickSignInButton();

        LOG.info("Type in email and pass");
        signInPage.typeInEmailField(email);
        signInPage.typeInPasswordField(password);

        LOG.info("Click 'Enter' button");
        SignInPage.clickEnterbutton();

        LOG.info("Verifying if error message is displayed");
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message is not displayed)";



    }


}
