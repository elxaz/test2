package CheckSteps;

import Pages.OpenPages;
import org.junit.Assert;

public class DoSteps {

    OpenPages page;

    public void isPageLoaded() {

        page.open();
        Assert.assertTrue(page.checkPage.isDisplayed());

    }

    public void goToSignInPage() {

        page.signInButton.click();

    }

    public void enterCredentials(String string1, String string2) {

        page.loginField.sendKeys(string1);
        page.passwordField.sendKeys(string2);

    }

    public void clickLogIn() {

        page.logInButton.click();

    }

    public void isLoggedIn() {

        Assert.assertTrue(page.checkName.isDisplayed());

    }

}
