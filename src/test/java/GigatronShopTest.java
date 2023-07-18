import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronShopTest extends BaseTest {

    PopUpPage popUpPage;

    HomePage homePage;


    @BeforeMethod
    public void setUp() {
        driver = openBrowser();
        popUpPage = new PopUpPage(driver);
        homePage = new HomePage(driver);

    }

    @Test
    public void ShopTest() {
        /*popUpPage.clickOnPopup();*/
        popUpPage.clickPrihvati();
        homePage.inputSearch("Samsung");

        Assert.assertEquals(homePage.getResult.isDisplayed(), true, "SAMSUNG Galaxy S23+ 8/512GB Lavander");

        homePage.addToCartSamsung();
        Assert.assertEquals(homePage.getCart(), "1");

    }


    @AfterMethod
    public void after() {
        driver.quit();
    }
}



