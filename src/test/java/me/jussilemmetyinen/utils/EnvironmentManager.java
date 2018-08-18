package me.jussilemmetyinen.utils;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnvironmentManager {
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        // Tell the app where the driver is
        System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        // Drive Chrome in headless mode
        chromeOptions.addArguments("--headless");
        // Open Chrome
        driver = new ChromeDriver(chromeOptions);

        // Remove all cookies
        driver.manage().deleteAllCookies();

        // Wait until close
        //      Thread.sleep(7000);

        // Suljetaan selain ja ajuri
        //driver.close();

    }
}

