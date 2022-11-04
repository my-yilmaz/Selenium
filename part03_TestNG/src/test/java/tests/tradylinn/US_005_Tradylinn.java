package tests.tradylinn;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class US_005_Tradylinn {
    TradylinnPage tradylinnPage = new TradylinnPage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void US_005() {

        // 1) kullanici tradylinn anasayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnnUrl"));

        // 2) kullanici giris yapmak için giris yap sayfasina tiklar
        tradylinnPage.girisYap.click();

        // 3) kullanici mail ve sifresini girer
        tradylinnPage.mailBox.sendKeys(ConfigReader.getProperty("tradylinnValidMail"));
        tradylinnPage.passwordBox.sendKeys(ConfigReader.getProperty("tradylinnValidPassword"));

        // 4) kullanici giris yap butonuna tiklar
        tradylinnPage.hesabagirisYap.click();
        ReusableMethods.waitFor(10);

        // 5) kullanici hesabım sayfasina tiklar
        tradylinnPage.hesabim.click();

        // 6) kullanici store manager linkine tiklar
        tradylinnPage.storeManager.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // 7) kullanici urunler sekmesine tiklar
        tradylinnPage.urunler.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // 8) kullanici Status, Stock, Price ve Date basliklarini dogrular
        Assert.assertTrue(tradylinnPage.status.isDisplayed());
        Assert.assertTrue(tradylinnPage.stock.isDisplayed());
        Assert.assertTrue(tradylinnPage.price.isDisplayed());
        Assert.assertTrue(tradylinnPage.date.isDisplayed());

        // 9) kullanici Add New Product butonuna tiklar
        tradylinnPage.addNewProduct.click();

        // 10) kullanici urun seceneklerinde Virtual ve Downloadable butonlari oldugunu dogrular

        Assert.assertTrue(tradylinnPage.virtual.isDisplayed());
        Assert.assertTrue(tradylinnPage.downloadable.isDisplayed());

        // 11)

        // 12)

    }
}
