package amazonTesting;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import amazonTesting.driver.DriverFactory;

public class Hooks {

    private DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setUP(){
      driverFactory.setBrowser();
      driverFactory.maxiBrowser();
      driverFactory.timeOut();

    }

    @After
    public void tearDown(){
        driverFactory.closeBrowser();

    }
}
