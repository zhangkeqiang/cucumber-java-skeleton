package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SyntaxSteps {
    @Given("there are {int} ninjas")
    public void there_are_ninjas(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("a blog post named {string} with Markdown body")
    public void a_blog_post_named_with_markdown_body(String string, String docString) {
        System.out.println(docString);
    }
    @When("{int} ninjas meet, they will fight")
    public void ninjas_meet_they_will_fight(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("one ninja dies \\(but not me)")
    public void one_ninja_dies_but_not_me() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("there is not ninja lass dada")
    public void there_is_not_ninja_lass_dada() {

    }

    @Then("aaaaaaaaaaaaaaaaa")
    public void aaaaaaaaaaaaaaaaa() {
       
    }

    @Then("bbbbbbbbbbbbbbbbb")
    public void bbbbbbbbbbbbbbbbb() {
        
    }

    @Then("ccccccccccccccccc")
    public void ccccccccccccccccc() {
        
    }
}
