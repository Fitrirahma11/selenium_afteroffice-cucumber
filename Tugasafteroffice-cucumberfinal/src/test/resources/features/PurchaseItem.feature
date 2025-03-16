Feature: Purchase the order from ecommerce

Background: User landed to website
    Given: User landing to ecommerce

Scenario: Purchase Item Positive Case
    Given User Logged to website
    When User add item to Cart
    And User checkout item
    Then User will see message is displayed on confirmation page

Scenario: Purchase Item Negative Case
    Given User Logged to website
    When User add item to Cart
    And User click remove on checkout button
    Then User will see message is displayed on confirmation page
