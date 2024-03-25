package Patterns.factory.withStrategy;

import org.openqa.selenium.WebDriver;

public class Example {
    public  void methodTest(String browser) {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.google.com/");
    }
}
