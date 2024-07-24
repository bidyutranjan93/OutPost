package Pages;

import TestBase.WebTestBase;
import Util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='About us']")
    WebElement aboutUsBtn;

    public AboutUsPage(){
        PageFactory.initElements(driver, this);
    }


    public String getAboutUsPage(){
        return WebElementUtil.getTextOfElement(aboutUsBtn);
    }
}
