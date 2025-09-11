package StepDef;

import Screens.HomeScreen;
import Utilities.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;

public class StepDefinition {

    HomeScreen homeScreen;

    @Given("The Android device launches Chrome browser")
    public void the_android_device_launches_chrome_browser() throws MalformedURLException {
        AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
        this.homeScreen = new HomeScreen(AppiumDriverFactory.getDriver());
    }

    @When("I navigate to the Ndosi homepage")
    public void i_navigate_to_the_ndosi_homepage() {
        AndroidDriver driver = AppiumDriverFactory.getDriver();
        driver.get("https://gray-island-0bd788c1e.2.azurestaticapps.net/");
    }

    @Then("I should see the heading Learn Automation the Right Way displayed")
    public void the_heading_should_be_visible() {
        homeScreen.verifyHeadingLearnAutomationDisplayed();
    }

    @When("I click on the OpenMenu option")
    public void i_click_on_the_open_menu_option() {
        homeScreen.clickOnOpenMenu();
    }

    @And("I tap on the Learning Material tab")
    public void i_tap_on_the_learning_material_tab() {
//        homeScreen.clickOnLearningMaterialTab();
    }

    @Then("The heading {string} should be displayed")
    public void the_heading_should_be_displayed(String string) {

    }


    @Given("I fetch login details for user id {int}")
    public void i_fetch_login_details_for_user_id(Integer int1) {

    }

    @When("I click the login button with those credentials")
    public void i_click_the_login_button_with_those_credentials() {

    }

    @Then("The application dashboard tabs should be displayed")
    public void the_application_dashboard_tabs_should_be_displayed() {

    }

    @Then("localStorage should contain the key {string}")
    public void local_storage_should_contain_the_key(String string) {

    }


    @Given("I retrieve login credentials for user id {int}")
    public void i_retrieve_login_credentials_for_user_id(Integer int1) {

    }

    @When("I attempt to log in with an incorrect password")
    public void i_attempt_to_log_in_with_an_incorrect_password() {

    }

    @Then("An alert message {string} should appear")
    public void an_alert_message_should_appear(String string) {

    }


    @Given("I retrieve login credentials with spaces for user id {int}")
    public void i_retrieve_login_credentials_with_spaces_for_user_id(Integer int1) {

    }

    @When("I attempt to log in after trimming spaces")
    public void i_attempt_to_log_in_after_trimming_spaces() {

    }

    @Then("I should be successfully logged in")
    public void i_should_be_successfully_logged_in() {

    }


    @Given("I am logged in with valid credentials")
    public void i_am_logged_in_with_valid_credentials() {

    }

    @When("I change the URL hash and return to the page")
    public void i_change_the_url_hash_and_return_to_the_page() {

    }

    @Then("I should be forced to log in again")
    public void i_should_be_forced_to_log_in_again() {

    }


    @Given("I am logged in once more")
    public void i_am_logged_in_once_more() {

    }

    @When("I press the Logout button")
    public void i_press_the_logout_button() {

    }

    @Then("The {string} should be removed from localStorage")
    public void the_should_be_removed_from_local_storage(String string) {

    }

    @Then("The login screen should be visible")
    public void the_login_screen_should_be_visible() {

    }


    @Given("I open the registration form for a new user")
    public void i_open_the_registration_form_for_a_new_user() {

    }

    @When("I provide two different passwords")
    public void i_provide_two_different_passwords() {

    }

    @Then("An error {string} should be shown")
    public void an_error_should_be_shown(String string) {

    }


    @Given("I access the registration form again")
    public void i_access_the_registration_form_again() {

    }

    @When("I provide an email with incorrect format")
    public void i_provide_an_email_with_incorrect_format() {

    }

    @Then("An error {string} should be displayed on the screen")
    public void an_error_should_be_displayed_on_the_screen(String string) {

    }


    @Given("I return to the registration form a third time")
    public void i_return_to_the_registration_form_a_third_time() {

    }

    @When("I provide a password shorter than {int} characters")
    public void i_provide_a_password_shorter_than_characters(Integer int1) {

    }

    @Then("An error {string} should be displayed")
    public void an_error_should_be_displayed(String string) {

    }


    @Given("I access the registration form for a valid user")
    public void i_access_the_registration_form_for_a_valid_user() {

    }

    @When("I enter correct details from the database")
    public void i_enter_correct_details_from_the_database() {

    }

    @Then("A message {string} should be displayed")
    public void a_message_should_be_displayed(String string) {

    }

    @Then("The login form should appear with the email pre-filled")
    public void the_login_form_should_appear_with_the_email_pre_filled() {

    }


    @Given("I am on Step {int} of the wizard")
    public void i_am_on_step_of_the_wizard(Integer int1) {

    }

    @When("I leave device type unselected and press Next")
    public void i_leave_device_type_unselected_and_press_next() {

    }

    @Then("I should see the error {string} on the screen")
    public void i_should_see_the_error_on_the_screen(String string) {

    }


    @Given("I select a device type")
    public void i_select_a_device_type() {

    }

    @When("I leave brand unselected and press Next")
    public void i_leave_brand_unselected_and_press_next() {

    }

    @Then("I should see the error {string} on the screen displayed")
    public void i_should_see_the_error_on_the_screen_displayed(String string) {

    }


    @Given("I select device, brand, and storage")
    public void i_select_device_brand_and_storage() {

    }

    @When("I enter quantity as {int} and continue")
    public void i_enter_quantity_as_and_continue(Integer int1) {

    }

    @Then("I should see the error {string} pop up")
    public void i_should_see_the_error_pop_up(String string) {

    }


    @Given("I select device, brand, and storage again")
    public void i_select_device_brand_and_storage_again() {

    }

    @When("I enter quantity as {int}")
    public void i_enter_quantity_as(Integer int1) {

    }

    @Then("I should see the error {string} shown")
    public void i_should_see_the_error_shown(String string) {

    }


    @Given("I select valid device, brand, storage, and quantity")
    public void i_select_valid_device_brand_storage_and_quantity() {

    }

    @When("I leave address empty and press Next")
    public void i_leave_address_empty_and_press_next() {

    }

    @Then("I should see the error {string}")
    public void i_should_see_the_error(String string) {

    }


    @Given("I select valid device, brand, storage, quantity, and address from DB")
    public void i_select_valid_device_brand_storage_quantity_and_address_from_db() {

    }

    @When("I press Next")
    public void i_press_next() {

    }

    @Then("I should be navigated to Step {int} of the wizard")
    public void i_should_be_navigated_to_step_of_the_wizard(Integer int1) {

    }


    @Given("I configure a Phone with 64GB storage and quantity {int}")
    public void i_configure_a_phone_with_64gb_storage_and_quantity(Integer int1) {

    }

    @Then("The unit price should display {string} on the screen")
    public void the_unit_price_should_display_on_the_screen(String string) {

    }

    @Then("The subtotal should display {string} correctly")
    public void the_subtotal_should_display_correctly(String string) {

    }


    @Given("I configure a Phone with 128GB storage and quantity {int}")
    public void i_configure_a_phone_with_128gb_storage_and_quantity(Integer int1) {

    }

    @Then("The unit price should display {string}")
    public void the_unit_price_should_display(String string) {

    }

    @Then("The subtotal should display {string}")
    public void the_subtotal_should_display(String string) {

    }


    @Given("I configure a valid device in Step {int}")
    public void i_configure_a_valid_device_in_step(Integer int1) {

    }

    @When("I add the device to the cart")
    public void i_add_the_device_to_the_cart() {

    }

    @Then("The cart panel should display {string} on top")
    public void the_cart_panel_should_display_on_top(String string) {

    }


    @Given("I already have one device in the cart")
    public void i_already_have_one_device_in_the_cart() {

    }

    @When("I add a new different device")
    public void i_add_a_new_different_device() {

    }

    @Then("The cart panel should display {string}")
    public void the_cart_panel_should_display(String string) {

    }


    @Given("I have multiple items in the cart")
    public void i_have_multiple_items_in_the_cart() {

    }

    @When("I remove every item from the cart")
    public void i_remove_every_item_from_the_cart() {

    }

    @Then("The cart panel should disappear completely")
    public void the_cart_panel_should_disappear_completely() {

    }


    @Given("I have at least one item available in the cart")
    public void i_have_at_least_one_item_available_in_the_cart() {

    }

    @When("I click Review Cart Order and then Place Order")
    public void i_click_review_cart_order_and_then_place_order() {

    }

    @Then("I should see a success toast with {string}")
    public void i_should_see_a_success_toast_with(String string) {

    }

    @Then("The cart should be emptied")
    public void the_cart_should_be_emptied() {

    }


    @Given("I have items pending in the cart")
    public void i_have_items_pending_in_the_cart() {

    }

    @When("I double click the Place Order button quickly")
    public void i_double_click_the_place_order_button_quickly() {

    }

    @Then("Only one success toast should appear")
    public void only_one_success_toast_should_appear() {

    }

    @Then("The cart should clear just once")
    public void the_cart_should_clear_just_once() {

    }


    @Given("I configure one valid device")
    public void i_configure_one_valid_device() {

    }

    @When("I press the Confirm Purchase button")
    public void i_press_the_confirm_purchase_button() {

    }

    @Then("I should see a toast showing {string}")
    public void i_should_see_a_toast_showing(String string) {

    }

    @Then("The wizard should reset back to Step {int}")
    public void the_wizard_should_reset_back_to_step(Integer int1) {

    }


    @Given("I type a discount code {string}")
    public void i_type_a_discount_code(String string) {

    }

    @When("I click the Apply button")
    public void i_click_the_apply_button() {

    }

    @Then("I should see an error {string}")
    public void i_should_see_an_error(String string) {

    }


    @Given("I use the keyboard to navigate")
    public void i_use_the_keyboard_to_navigate() {

    }

    @Then("I should be able to select storage by radio buttons")
    public void i_should_be_able_to_select_storage_by_radio_buttons() {

    }

    @Then("All error messages should use role={string}")
    public void all_error_messages_should_use_role(String string) {

    }

    @Then("All toast messages should use role={string}")
    public void all_toast_messages_should_use_role(String string) {

    }


}
