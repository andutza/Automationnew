package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

    private String newUrl = getBaseUrl() + "Register.html";

    @Test
    public void register() {
        driver.get(newUrl);

        String firstName = "Darius";
        String lastName = "Fratutiu";
        String Adress = "Bucuresti";
        String language = "Romanian";
        String email = "Automation@domain.com";
        String phone = "0755677899";

        LOG.info("Check title");
        Assert.assertTrue(registerPage.IsTitleDisplayed(), "Title is not displayed");

        LOG.info("Check formTitle");
        Assert.assertTrue(registerPage.IsFormTitleDisplayed(), "formTitle is not displayed");

        LOG.info("Type in FullName");
        registerPage.typeInFirstName(firstName);
        registerPage.typeInLastName(lastName);

        LOG.info("Type In Address");
        registerPage.typeInAddress(Adress);

        LOG.info("Select a Language");
        registerPage.selectLanguage(language);


        LOG.info("Type In Email Address");
        registerPage.typeInEmailAddress(email);


        LOG.info("Type In Phone Number");
        registerPage.typeInPhoneNumber(phone);


    }


}
