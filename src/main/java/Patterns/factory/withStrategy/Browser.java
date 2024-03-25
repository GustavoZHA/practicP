package Patterns.factory.withStrategy;

import org.openqa.selenium.WebDriver;

/**
 * Configures the browser's options.
 */
public interface Browser {

    /**
     * Gets the browser's driver.
     *
     * @return the web driver
     */
    WebDriver getWebDriver();
}
