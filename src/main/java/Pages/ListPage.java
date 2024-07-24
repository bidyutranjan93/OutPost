package Pages;

import TestBase.WebTestBase;
import Util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Lists']")
    WebElement listsBtn;

    public ListPage(){
        PageFactory.initElements(driver,this);
    }

    public String getListBtnPageText(){
        return WebElementUtil.getTextOfElement(listsBtn);
    }

}
