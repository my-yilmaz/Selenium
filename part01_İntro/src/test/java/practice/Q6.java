package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q6 {
    /*
  // ...Exercise6...
  1.  https://id.heroku.com/login sayfasina gidin
  2.  Bir mail adersi giriniz
  3.  Bir password giriniz
  4.  Login butonuna tiklayiniz
  5.  "There was a problem with your login." texti gorunur ise
  6.  "kayit yapilamadi" yazdiriniz
  8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
  9.  Tum sayfalari kapatiniz

   */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://id.heroku.com/login");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@name='commit']")).click();
        WebElement onay = driver.findElement(By.xpath("//*[text()='There was a problem with your login.']"));
        if (onay.isDisplayed()) {
            System.out.println("kayit yapilamadi");
        } else {
            System.out.println("kayit yapildi");
        }
        driver.close();
    }
}
