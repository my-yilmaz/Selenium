package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q5 {
     /*
       // ...Exercise5...
       // Navigate to website  https://testpages.herokuapp.com/styled/index.html
       // Under the  ORIGINAL CONTENTS
       // click on Alerts
       // print the URL
       // navigate back
       // print the URL
       // Click on Basic Ajax
       // print the URL
       // enter value-> 20 and Enter
       // and then verify Submitted Values is displayed open page
       // close driver

        */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//*[text()='Alerts']")).click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//*[text()='Basic Ajax']")).click();
        System.out.println(driver.getCurrentUrl());
        WebElement value = driver.findElement(By.xpath("//input[@id='lteq30']"));
        value.sendKeys("20" + Keys.ENTER);
        WebElement displayed = driver.findElement(By.xpath("//div[@id='_id']"));
        if (displayed.isDisplayed()) {
            System.out.println("Bilgiler sayfada gosteriliyor");

        }
        driver.close();


    }

}
