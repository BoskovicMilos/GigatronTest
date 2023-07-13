import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronShopTest extends BaseTest {

            PopUpPage popUpPage;

    @BeforeMethod
    public void setUp()
    {
    driver = openBrowser();
    popUpPage = new PopUpPage(driver);

    }
    @Test
    public  void ShopTest()
    {
        popUpPage.clickOnPopup();
        popUpPage.clickPrihvati();
    }

    @AfterMethod
            public void after()
    {
        driver.quit();
    }


}
