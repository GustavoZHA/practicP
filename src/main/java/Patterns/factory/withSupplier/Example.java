package Patterns.factory.withSupplier;

import org.openqa.selenium.WebDriver;

public class Example {
    public  void factoryMethodTest(String browser) {
        WebDriver driver = DriverFactory.getDriver(browser);
        driver.get("https://www.google.com/");
    }
}
