import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronShopTest extends BaseTest {

            PopUpPage popUpPage;

            HomePage homePage;




    @BeforeMethod
    public void setUp()
    {
    driver = openBrowser();
    popUpPage = new PopUpPage(driver);
    homePage = new HomePage(driver);

    }
    @Test
    public  void ShopTest()
    {
        popUpPage.clickOnPopup();
        popUpPage.clickPrihvati();
        homePage.inputSearch("Samsung");

    }

   /* @AfterMethod
            public void after()
    {
        driver.quit();*/
    }



