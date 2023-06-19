package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Edge";
    static String baseUrl = "http://the-internet.herokuapp.com/login";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeDriver driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxDriver driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeDriver driver1 = new EdgeDriver();

        } else {
            System.out.println("number is Wrong ");
        }
        WebDriver driver =new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        System.out.println(" Page title " +title);
        //Get the Print Url
        System.out.println("Current url " + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page Sourse"+ driver.getPageSource());
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("bhg123@gmail.com");
//get the password into password filed
        driver.findElement(By.name("password")).sendKeys(" Bhg123");
        //close the  Browser
        driver.close();
    }
}