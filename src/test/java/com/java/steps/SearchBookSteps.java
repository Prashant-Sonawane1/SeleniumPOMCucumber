package com.java.steps;

import com.demo.pages.BookSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchBookSteps {

    @Given("user is on books search page")
    public void user_is_on_books_search_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on books search page");
        BookSearchPage.initialize();
    }
    @When("user enters book name on searchbar")
    public void user_enters_book_name_on_searchbar() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters book name on searchbar");
        BookSearchPage.searchBook("The Cucumber");

    }
    @Then("correct book title must be displayed")
    public void correct_book_title_must_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("correct book title must be displayed");
        BookSearchPage.verifyBookName("The Cucumber for Java Bok");

        BookSearchPage.driver.close();
        BookSearchPage.driver.quit();

    }


}
