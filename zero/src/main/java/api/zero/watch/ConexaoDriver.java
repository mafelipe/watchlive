package api.zero.watch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConexaoDriver {

    public static WebDriver driver;

    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9015");
        options.setHeadless(true);

        driver = new ChromeDriver(options);
        return driver;
    }
}


