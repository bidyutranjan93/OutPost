import Pages.AboutUsPage;
import Pages.HomePage;
import Pages.PrivacyPage;
import Pages.TermsAndConditionPage;
import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends WebTestBase {

    HomePage homePage;
    PrivacyPage privacyPage;
    TermsAndConditionPage termsAndConditionPage;
    AboutUsPage aboutUsPage;

    public HomeTest(){
        super();
    }
    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage = new HomePage();
        privacyPage = new PrivacyPage();
        termsAndConditionPage = new TermsAndConditionPage();
        aboutUsPage = new AboutUsPage();


    }

    @Test
    public void verifyPrivacyBtn(){
        SoftAssert softAssert = new SoftAssert();
        homePage.checkPrivacyBtn();
        softAssert.assertEquals(privacyPage.getPrivacyPageTxt(),"Privacy Policy", "Outpost privacy policy should be matched");
        softAssert.assertAll();

    }

    @Test
    public void verifyTermsAndConditionBtn(){
        SoftAssert softAssert = new SoftAssert();
        homePage.checkTermsAndCondition();
        softAssert.assertEquals(termsAndConditionPage.getTermsAndConditionPageText(),"Terms & Conditions", "Terms & Conditions should be matched");
        softAssert.assertAll();

    }

    @Test
    public void verifyAboutUsBtn(){
        SoftAssert softAssert = new SoftAssert();
        homePage.checkAboutUs();
        softAssert.assertEquals(aboutUsPage.getAboutUsPage(),"Our values", "Our values should be matched");
        softAssert.assertAll();
        
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
