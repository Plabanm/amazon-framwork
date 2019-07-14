package amazonTesting.steps;

import amazonTesting.pageObject.HomePage;
import amazonTesting.pageObject.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    @Given("^user am on home page$")
    public void user_am_on_home_page(){
        String actualdUrl = homePage.getHomeUrl();
        assertThat("Home Page ends with .co.uk", actualdUrl, Matchers.endsWith(".co.uk/"));

    }

    @When("^user search for a product \"([^\"]*)\"$")
    public void user_search_for_a_product(String item){
        homePage.productSearch(item);

    }

    @Then("^user should see respective results$")
    public void user_should_see_respective_results(){
        String actualSearchTitle =resultPage.getSearchTitle();
        assertThat("", actualSearchTitle,Matchers.endsWith(actualSearchTitle));

    }

    @Given("^user am on home Page$")
    public void userAmOnHomePage() {
        String actualdUrl = homePage.getHomeUrl();
        assertThat("Home Page ends with .co.uk", actualdUrl, Matchers.endsWith(".co.uk/"));
    }

    @When("^user search for \"([^\"]*)\"$")
    public void userSearchFor(String items) {
        homePage.productSearch(items);
    }

}
