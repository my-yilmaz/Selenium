package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsninjaPage {
    public  TutorialsninjaPage(){
       PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonesvePDA;

    @FindBy(xpath = "//h4")
    public List<WebElement> urunListesi;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement> addCart;

    @FindBy (id="cart-total")
    public WebElement sebetButonu;

    @FindBy (xpath = "//*[@id=\"cart\"]//table/tbody//td[2]/a")
    public List<WebElement> sebetUrunListesi;

}
