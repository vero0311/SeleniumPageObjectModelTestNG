package pages;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    private WebDriver driver;
    @FindBy(how= How.ID, using = "firstHeading")
    private WebElement captureText;


    public WikipediaPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void compareText(String name){
        MatcherAssert.assertThat(captureText.getText(), Matchers.equalToIgnoringCase(name));

    }
}
