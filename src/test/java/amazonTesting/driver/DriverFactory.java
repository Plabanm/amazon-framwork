package amazonTesting.driver;

import com.sun.glass.ui.View;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;
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
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setBrowserName("chrome");
                driver = new RemoteWebDriver(new URL("http://192.168.0.43:4444/wd/hub"), cap);
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
