package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.GoogleSearchPage;
import pages.WikipediaPage;
import utils.MyDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {

    private WebDriver driver;
    private GoogleHomePage googleHomePage;
    private GoogleSearchPage googleSearchPage;
    private WikipediaPage wikipediaPage;

    @BeforeTest
    public void setup(){
        MyDriver myDriver = new MyDriver();
        driver = myDriver.createDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        googleSearchPage = new GoogleSearchPage(driver);
        googleHomePage = new GoogleHomePage(driver);
        wikipediaPage = new WikipediaPage(driver);

    }

    @AfterTest
    public void testFinish(){
        // driver.quit(); // Cerrar la ventana del navegador
        System.out.println("The test is done");
    }

    @Test
    public void runTheTest(){
        driver.get("https://www.google.com/");
        googleHomePage.searchInGoogle("Medellin");
        googleSearchPage.goToPage();
        wikipediaPage.compareText("Medellín");

    }



}
