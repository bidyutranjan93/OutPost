package Pages;

import TestBase.WebTestBase;
import Util.JavaScriptExecutorUtil;
import Util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Privacy Policy']")
    WebElement privacyBtn;

    @FindBy(xpath = "//a[text()='Terms and conditions']")
    WebElement termsAndConditionBtn;

    @FindBy(xpath = "//a[text()='About us']")
    WebElement aboutUsBtn;

    @FindBy(xpath = "//a[text()='Lists']")
    WebElement listsBtn;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[text()='Frequently Asked Questions']")
    WebElement frequentAskedQuestion;

    public void checkPrivacyBtn() {

        WebDriverUtil.waitElementUntilClickable(privacyBtn);
    }
    public void checkTermsAndCondition(){
        WebDriverUtil.waitElementUntilClickable(termsAndConditionBtn);
    }

    public void checkAboutUs(){
        WebDriverUtil.waitElementUntilClickable(aboutUsBtn);
    }

    public void checkLists(){
        WebDriverUtil.waitElementUntilClickable(listsBtn);
    }

    public void checkLoginAndRegister(){
        WebDriverUtil.waitElementUntilClickable(loginBtn);
    }

    public void scrollToTheText() {

        JavaScriptExecutorUtil.scrollByElement(frequentAskedQuestion);
    }

}
