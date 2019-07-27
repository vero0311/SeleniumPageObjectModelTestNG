package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    private WebDriver driver;
    @FindBy(how= How.NAME, using = "q")
    private WebElement searchArea;
    @FindBy(how= How.NAME, using = "btnK")
    private WebElement goButton;


    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void searchInGoogle(String textSearch){
        searchArea.sendKeys(textSearch);
        goButton.click();
    }
}
