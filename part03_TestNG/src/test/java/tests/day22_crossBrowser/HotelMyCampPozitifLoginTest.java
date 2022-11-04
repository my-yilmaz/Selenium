package tests.day22_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class HotelMyCampPozitifLoginTest extends TestBaseRapor {


    @Test
    public void test01() {
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");
        // 1. https://www.hotelmycamp.com adresine gidiniz.
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        extentTest.info("hotel anasayafaya gidildi");
        // 2. kullanici girisi yapiniz
        hotelmycampPage.logIn.click();
        extentTest.info("kullanici girisi paneline giris yapildi");
        // 3. username= manager
        hotelmycampPage.username.sendKeys(ConfigReader.getProperty("hotelUsername"));
        extentTest.info("username girildi");
        // 4. password= 12345
        hotelmycampPage.password.sendKeys(ConfigReader.getProperty("HotelPassword"));
        extentTest.info("sifre girildi");
        // 5. login yapiniz.
        hotelmycampPage.submitButonu.click();
        extentTest.info("giris butonuna tiklandi");
        // 6. Basarili bir sekilde giris yaptiginizi test ediniz.
        String expectedUsername = "manager";
        String actualUsername = hotelmycampPage.kullaniciProfilIsmi.getText();
        Assert.assertEquals(actualUsername, expectedUsername);

        extentTest.pass("kullanici basarili bir sekilde giris yapti");

        Driver.closeDriver();

    }

}
