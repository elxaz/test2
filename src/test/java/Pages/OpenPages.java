package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenPages extends PageObject {

    @FindBy(id = "center_column")
    public WebElement checkPage;

    @FindBy(className = "login")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement loginField;

    @FindBy(id = "passwd")
    public WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    public WebElement logInButton;

    @FindBy(className = "account")
    public WebElement checkName;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]")
    public WebElement errorText;

}
