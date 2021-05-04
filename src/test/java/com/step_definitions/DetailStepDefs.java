package com.step_definitions;

import com.pages.Detail_Page;
import com.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class DetailStepDefs {


    @Then("the movie {string} is displayed on the content page")
    public void the_movie_is_displayed_on_the_content_page(String movieName) {
        Detail_Page detail_page = new Detail_Page();
        detail_page.isMovieDisplayedOnDetailPage(movieName);
        BrowserUtils.waitFor(3);


    }


}
