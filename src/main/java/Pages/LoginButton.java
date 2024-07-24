package Pages;

import TestBase.WebTestBase;
import Util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginButton extends WebTestBase {

    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;

    public LoginButton(){
        PageFactory.initElements(driver,this);
    }

    public String clickOnTheLoginBtn(){
        return WebElementUtil.getTextOfElement(loginBtn);
    }
}
