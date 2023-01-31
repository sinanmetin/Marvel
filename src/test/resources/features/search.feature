Feature: The user can be able to search movie or series by using search function

  Background:
    Given The user is on home page

    Scenario: The user can be able to use search function in the “COMICS” section
      When the user navigate to search page
      And the user select COMICS section
      And the user enter Avengers in search field
      Then the user expected that 20 result on page
      Then the user expected that "161" page of result