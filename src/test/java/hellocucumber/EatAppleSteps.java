package hellocucumber;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatAppleSteps {
 
    @Given("宝宝得到了 {int} 个苹果")
    public void 宝宝得到了_个苹果(int int1) {
        assertEquals(3, int1);
    }

    @When("宝宝吃掉了 {int} 个苹果")
    public void 宝宝吃掉了_个苹果(int int1) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("宝宝还剩下 {int} 个苹果")
    public void 宝宝还剩下_个苹果(int int1) {
        // Write code here that turns the phrase above into concrete actions
        
    }
}
