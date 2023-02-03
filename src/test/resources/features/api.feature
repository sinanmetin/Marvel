@api
Feature:As a tester, I want to verify that the API returns the correct data for comics, including its id,
  title, and resourceURI, so I can ensure the accuracy of the information.



  Scenario: verify information for comics
    Given I logged Marvel api using apikey and hash
    When I get the current comics from api
    Then status code should be 200