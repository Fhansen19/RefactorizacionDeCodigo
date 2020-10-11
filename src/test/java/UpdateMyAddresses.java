import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import pageobjects.MyAddressesPage;
import utils.WebDriverManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {

    @BeforeEach
    public void setUp() {
        WebDriverManagement.driverInitialization();
    }

    @AfterEach
    public void tearDown() {
        WebDriverManagement.quitDriver();
    }

    @Test
    public void updateMyAddress() {

        LoginPage.loginWithValidUser();

        MyAccountPage.navigateToMyAddresses();

        MyAddressesPage.updateMyAddresses();

        MyAddressesPage.updatePhoneField();

        MyAddressesPage.updateMobilePhoneField();

        MyAddressesPage.updateAddressField();

        MyAddressesPage.updateCompanyField();

        MyAddressesPage.updateAliasField();

        MyAddressesPage.save();

        MyAddressesPage.validateUpdatedAlias();
    }
}
