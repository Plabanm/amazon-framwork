package amazonTesting.pageObject;

import amazonTesting.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends DriverFactory {

    @FindBy(css = ".bxw-pageheader__title__text")
    private WebElement searchTitle;

    public String getSearchTitle(){
       String searchTitle = driver.getTitle();
       return searchTitle;

    }

}
