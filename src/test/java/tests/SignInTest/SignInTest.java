package tests.SignInTest;

import jdk.internal.org.jline.utils.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {

    private final String email;

    public SignInTest(String email) {
        this.email = email;
    }

    @Test
    public void checkIfLogoIsDisplayed(){
        Log.info("Verify if Logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

        Log.info("Complete the email field");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email field is not displayed");
        signInPage.typeInEmailField(email);

        Log.info("Click the Next button");
        signInPage.clickNextButton();
    }
}
