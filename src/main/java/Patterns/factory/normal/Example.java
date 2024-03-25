package Patterns.factory.normal;

import org.openqa.selenium.WebDriver;

public class Example {
    public  void factoryMethodTest(String browser) {
        WebDriver driver = DriveFactory.getDriver(browser);
        driver.get("https://www.google.com/");
    }
}
