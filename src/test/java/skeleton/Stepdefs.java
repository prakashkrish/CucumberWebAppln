package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Stepdefs {
/*    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);    */
    
    Given(/^I am on the home page$/) do
         visit "http://34.249.86.158:8181/hello/"
        end
    
    
/*    @When("^I wait (\\d+) hour$")
    public void I_wait_hour(int hour) throws Throwable {
        Belly belly = new Belly();
        belly.wait(hour);  */

    When(/^I click JSP page$/) do
         find_link("JSP page").click
        end
   
    
/*    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        Belly belly = new Belly();
        belly.then();  */

      Then(/^I should see the title "(.*?)"$/) do |title|
          expect(page).to have_title(title)
   
}
