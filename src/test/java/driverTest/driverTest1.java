package driverTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driverTest1 {

    @Test
    public void chromedriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua");
        driver.quit();
    }

    @Test
    public void firefoxdriver() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");
        driver.quit();
    }

    @Test
    public void IEdriver() {
        System.setProperty("webdriver.ie.driver", "D:\\Selenium\\InternetExplorer\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com.ua");
        driver.quit();
    }
}
