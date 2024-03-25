package Patterns.factory.withStrategy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowser implements Browser {
    boolean withHeadless = true;
    FirefoxOptions firefoxOptions;

    public void setFirefoxOptions() {
        firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--disable-web-security");
        firefoxOptions.addArguments("--allow-running-insecure-content");
        if (withHeadless) {
            firefoxOptions.addArguments("--headless");
        }
    }

    @Override
    public WebDriver getWebDriver() {
        WebDriverManager.firefoxdriver().setup();
        setFirefoxOptions();
        return new FirefoxDriver(firefoxOptions);
    }
}
