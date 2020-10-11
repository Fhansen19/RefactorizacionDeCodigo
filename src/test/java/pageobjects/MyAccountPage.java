package pageobjects;

import utils.WebDriverManagement;

public class MyAccountPage {

    public static void navigateToMyAddresses() {
        WebDriverManagement.clickByCssSelector("li:nth-child(3) > a > span:nth-child(2)");
    }

}
