Feature: feature to test booksearch from website

  Scenario: Check book can be searched with book name

    Given user is on books search page
    When user enters book name on searchbar
    Then correct book title must be displayed