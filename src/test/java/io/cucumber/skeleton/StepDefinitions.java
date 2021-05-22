package io.cucumber.skeleton;

import io.cucumber.java.en.*;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void I_wait_hour(int hour) {
        System.out.println(hour);
    }

    @Then("my belly should growl {int}")
    public void My_belly_should_growl(int cukes) {
        
    }
}
