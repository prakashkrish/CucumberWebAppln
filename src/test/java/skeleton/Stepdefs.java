package skeleton;

import cucumber.api.java.en.Given;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    
    @When("^I wait (\\d+) hour$")
    public void I_wait_hour(int hour) throws Throwable {
        Belly belly = new Belly();
        belly.wait(hour);
    }
}
