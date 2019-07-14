package amazonTesting.pageObject;

import amazonTesting.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    public static String searchProduct;

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(css =".nav-search-submit")
    private WebElement magnifyingGlass;

    public void productSearch(String item){
        searchProduct = item;
        searchBox.sendKeys(item);
        magnifyingGlass.click();
    }

    public String getHomeUrl(){
        System.out.println("getting home url");
        return driver.getCurrentUrl();
    }



}
