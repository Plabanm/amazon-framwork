package amazonTesting.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;



    private String browser = "chrome";
    //private String url = "https://www.amazon.co.uk/";

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void setBrowser() {
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get("https://www.amazon.co.uk/");
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                driver.get("https://www.amazon.co.uk/");
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.get("https://www.amazon.co.uk/");
            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.get("https://www.amazon.co.uk/");
                break;
        }
    }

    public void maxiBrowser(){
        driver.manage().window().maximize();

    }

    public void timeOut(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void closeBrowser(){
        driver.quit();

    }

}
