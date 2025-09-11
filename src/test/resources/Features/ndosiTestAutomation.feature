Feature: Ndosi Mobile Test Automation

  Scenario: Launch Ndosi website on Android Chrome
    Given The Android device launches Chrome browser
    When I navigate to the Ndosi homepage
    Then I should see the heading Learn Automation the Right Way displayed
    When I click on the OpenMenu option
    And I tap on the Learning Material tab
    Then The heading "Login to Access Learning Materials" should be displayed

  Scenario: Valid login using database user id 25
    Given I fetch login details for user id 25
    When I click the login button with those credentials
    Then The application dashboard tabs should be displayed
    And localStorage should contain the key "authToken"

  Scenario: Invalid login attempt using user id 26
    Given I retrieve login credentials for user id 26
    When I attempt to log in with an incorrect password
    Then An alert message "Login failed: Invalid login credentials" should appear

  Scenario: Login with trimmed credentials using user id 27
    Given I retrieve login credentials with spaces for user id 27
    When I attempt to log in after trimming spaces
    Then I should be successfully logged in

  Scenario: Session ends after navigation reset
    Given I am logged in with valid credentials
    When I change the URL hash and return to the page
    Then I should be forced to log in again

  Scenario: User logs out and token is cleared
    Given I am logged in once more
    When I press the Logout button
    Then The "authToken" should be removed from localStorage
    And The login screen should be visible

  Scenario: Registration attempt with mismatched passwords
    Given I open the registration form for a new user
    When I provide two different passwords
    Then An error "Passwords do not match!" should be shown

  Scenario: Registration attempt with invalid email address
    Given I access the registration form again
    When I provide an email with incorrect format
    Then An error "Please enter a valid email address" should be displayed on the screen

  Scenario: Registration attempt with short password
    Given I return to the registration form a third time
    When I provide a password shorter than 8 characters
    Then An error "Password must be at least 8 characters long" should be displayed

  Scenario: Successful registration with valid user data
    Given I access the registration form for a valid user
    When I enter correct details from the database
    Then A message "Registration successful" should be displayed
    And The login form should appear with the email pre-filled

  Scenario: Step 1 fails when device is not selected
    Given I am on Step 1 of the wizard
    When I leave device type unselected and press Next
    Then I should see the error "Select a device type" on the screen

  Scenario: Step 1 fails when brand is not selected
    Given I select a device type
    When I leave brand unselected and press Next
    Then I should see the error "Select a brand" on the screen displayed

  Scenario: Step 1 fails when quantity is zero
    Given I select device, brand, and storage
    When I enter quantity as 0 and continue
    Then I should see the error "Quantity must be ≥ 1" pop up

  Scenario: Step 1 fails when quantity is more than allowed
    Given I select device, brand, and storage again
    When I enter quantity as 11
    Then I should see the error "Quantity must be ≤ 10" shown

  Scenario: Step 1 fails when address is left blank
    Given I select valid device, brand, storage, and quantity
    When I leave address empty and press Next
    Then I should see the error "Address required"

  Scenario: Step 1 passes with all valid fields
    Given I select valid device, brand, storage, quantity, and address from DB
    When I press Next
    Then I should be navigated to Step 2 of the wizard

  Scenario: Pricing calculation for Phone 64GB Qty1
    Given I configure a Phone with 64GB storage and quantity 1
    Then The unit price should display "$400.00" on the screen
    And The subtotal should display "$400.00" correctly

  Scenario: Pricing calculation for Phone 128GB Qty2
    Given I configure a Phone with 128GB storage and quantity 2
    Then The unit price should display "$480.00"
    And The subtotal should display "$960.00"

  Scenario: Adding a single device to the cart
    Given I configure a valid device in Step 2
    When I add the device to the cart
    Then The cart panel should display "(1 item)" on top

  Scenario: Adding a different device to the cart
    Given I already have one device in the cart
    When I add a new different device
    Then The cart panel should display "(2 items)"

  Scenario: Removing all items clears the cart
    Given I have multiple items in the cart
    When I remove every item from the cart
    Then The cart panel should disappear completely

  Scenario: Place order successfully from review cart
    Given I have at least one item available in the cart
    When I click Review Cart Order and then Place Order
    Then I should see a success toast with "Grand Total"
    And The cart should be emptied

  Scenario: Prevent duplicate orders with double click
    Given I have items pending in the cart
    When I double click the Place Order button quickly
    Then Only one success toast should appear
    And The cart should clear just once

  Scenario: Confirm purchase of a single item
    Given I configure one valid device
    When I press the Confirm Purchase button
    Then I should see a toast showing "Total:"
    And The wizard should reset back to Step 1

  Scenario: Apply invalid discount code
    Given I type a discount code "random"
    When I click the Apply button
    Then I should see an error "Invalid code"

  Scenario: Accessibility compliance check
    Given I use the keyboard to navigate
    Then I should be able to select storage by radio buttons
    And All error messages should use role="alert"
    And All toast messages should use role="status"
