package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {
    public TradylinnPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Giriş Yap']")
    public WebElement girisYap;

    @FindBy(xpath = "(//input[@name='username'])[1]")
    public WebElement mailBox;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@name='login'])[1]")
    public WebElement hesabagirisYap;

    @FindBy(xpath = "//nav[@class='dropdown-box top-navigation']")
    public WebElement ddm;
    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement hesabim;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement urunler;

    @FindBy(xpath = "(//*[text()='Status'])[1]")
    public WebElement status;

    @FindBy(xpath = "(//*[text()='Price'])[1]")
    public WebElement price;

    @FindBy(xpath = "(//*[text()='Stock'])[1]")
    public WebElement stock;

    @FindBy(xpath = "(//*[text()='Date'])[1]")
    public WebElement date;

    @FindBy(xpath = "//*[text()='Yeni ekle']")
    public WebElement addNewProduct;

    @FindBy(xpath = "//input[@id='is_virtual']")
    public WebElement virtual;

    @FindBy(xpath = "//input[@id='is_downloadable']")
    public WebElement downloadable;


}
