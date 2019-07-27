package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

    public WebDriver createDriver(String driverType){
        if(driverType==null){
            return  null;
        }
        if(driverType.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
            return new ChromeDriver();
        }
        else if(driverType.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/test/drivers/geckodriver.exe");
            return new FirefoxDriver();
        }
        return null;
    }
}
