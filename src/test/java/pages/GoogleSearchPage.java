package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    private WebDriver driver;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Wikipedia")
    private WebElement textSearch;

    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void goToPage(){
        textSearch.click();
    }

}
