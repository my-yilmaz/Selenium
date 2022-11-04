package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialsninjaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TutorialsninjaStepDefinitions {
    static List<String> urunListesi = new ArrayList<>();
    static List<String> sepetListesi = new ArrayList<>();
    TutorialsninjaPage obj = new TutorialsninjaPage();

    @Given("kullanici tutorialsninja anasayfasinda")
    public void kullanici_tutorialsninja_anasayfasinda() {

        Driver.getDriver().get(ConfigReader.getProperty("tutorialsninjaUrl"));
    }

    @Then("kullanici Phones & PDAs tiklar")
    public void kullanici_phones_pd_as_tiklar() {
        obj.phonesvePDA.click();
    }

    @Then("telefon marka isimlerini listeler")
    public void telefon_marka_isimlerini_listeler() {

        for (WebElement each : obj.urunListesi
        ) {
            urunListesi.add(each.getText());
        }
    }

    @Then("kullanici sepete tum urunleri ekler")
    public void kullanici_tüm_urunleri_ekler() throws InterruptedException {
        for (WebElement each : obj.addCart
        ) {
            each.click();
        }

        Thread.sleep(3000);
    }

    @Then("kullanici sepete tiklar")
    public void kullanici_sepete_tiklar() {
        obj.sebetButonu.click();
    }

    @Then("sepetteki urunlerin ismini listeler")
    public void sepetteki_ürünlerin_ismini_listeler() {
        for (WebElement each : obj.sebetUrunListesi
        ) {
            sepetListesi.add(each.getText());
        }
    }

    @Then("listedeki ve sebetteki urunleri karsilastirir")
    public void listedeki_ve_sebetteki_urunleri_karsilastirir() {
        Assert.assertTrue(urunListesi.containsAll(sepetListesi));
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
