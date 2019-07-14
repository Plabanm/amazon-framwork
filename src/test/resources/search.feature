@search
Feature: Amazon search feature

  AS A customer
  I WANT TO search for a product
  SO THAT I can see respective results

  @smoke
  Scenario: Search for a product
    Given user am on home page
    When user search for a product "watch"
    Then user should see respective results

    Scenario Outline: Search for multiple products
      Given user am on home Page
      When user search for "<product>"
      Then user should see respective results
      Examples:
        | product |
        | watch |
        | iPhone |
        | sunglass |
        | chair |
        | keyboard |
