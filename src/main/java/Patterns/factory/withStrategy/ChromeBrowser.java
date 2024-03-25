package Patterns.factory.withStrategy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser implements Browser {
    boolean withHeadless = true;
    private ChromeOptions chromeOptions;

    public void setChromeOptions() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications", "--ignore-certificate-errors",
                "--disable-extensions", "--no-sandbox");
        if (withHeadless) {
            chromeOptions.addArguments("--headless", "--disable-gpu");
        }
    }

    @Override
    public WebDriver getWebDriver() {
        WebDriverManager.chromedriver().setup();
        setChromeOptions();
        return new ChromeDriver(chromeOptions);
    }
}
