package com.step_definitions;


import com.pages.*;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginStepDefs {


    Login_page login_page;
    Detail_Page detail_page;
    CreateAccountPage createAccountPage = new CreateAccountPage();


    @Given("the user clicks the login button")
    public void the_user_clicks_the_login_button() {

        login_page = new Login_page();
        BrowserUtils.waitFor(5);
        createAccountPage.switchFrame();
        createAccountPage.acceptAll.click();
        login_page.login.click();
    }

    @When("the user logins successfully with valid credentials")
    public void the_user_logins_successfully_with_valid_credentials(Map<String, String> validCredentials) {
        login_page.login(validCredentials.get("email"), validCredentials.get("password"));

    }

    @When("the user should see the notification button as a verification")
    public void the_user_should_see_the_notification_button_as_a_verification() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.visibilityOf(login_page.notification));
        Assert.assertTrue(login_page.notification.isDisplayed());
    }

    @Then("the user searches the movie {string} on the search button")
    public void the_user_searches_the_movie_on_the_search_button(String theMovie) throws InterruptedException {
        Thread.sleep(5000);
        Dashboard_Page dashboard_page = new Dashboard_Page();
        dashboard_page.search.sendKeys(theMovie, Keys.ENTER);
    }

    @When("the user clicks the result")
    public void the_user_clicks_the_result() throws InterruptedException {
        Thread.sleep(2000);
        Result_Page result_page = new Result_Page();
        result_page.result.click();

    }


    @Then("the user clicks the action icon to add to wishlist")
    public void the_user_clicks_the_action_icon_to_add_to_wishlist() throws InterruptedException {
        Thread.sleep(2000);
        detail_page = new Detail_Page();
        detail_page.actionElement.click();
    }

    @Then("the user goes to the wishlist")
    public void the_user_goes_to_the_wishlist() throws InterruptedException {

        Thread.sleep(2000);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(detail_page.navmenu).perform();
        detail_page.wishList.click();
    }

    @Then("the user should see the movie {string} added to the wishlist")
    public void the_user_should_see_the_movie_added_to_the_wishlist(String addedMovie) throws InterruptedException {

        Thread.sleep(3000);
        List<String> movies = new ArrayList<>();
        List<WebElement> options = detail_page.contentList;
        for (WebElement webElement : options) {
            movies.add(webElement.getText());
            System.out.println(movies);

        }

    }


}
