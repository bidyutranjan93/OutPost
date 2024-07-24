package Pages;

import TestBase.WebTestBase;
import Util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsAndConditionPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Terms and conditions']")
    WebElement termsAndConditionBtn;

    public TermsAndConditionPage(){
        PageFactory.initElements(driver,this);
    }
    public String getTermsAndConditionPageText(){
        return WebElementUtil.getTextOfElement(termsAndConditionBtn);
    }
}
