package dojo; 

import java.util.List;
import static org.junit.Assert.assertEquals;

import dojo.Order;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void someone_who_wants_to_buy_a_drink(String personName) {
        order = new Order();
        order.declareOwner(personName);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for(String targetPerson) {
        order.declareTarget(targetPerson);
    }

    @When("{int} cocktails are added to the order")
    public void cocktails_are_added_to_the_order(int numberOfCocktails) {
        for (int i = 0; i < numberOfCocktails; i++) {
            order.addCocktail("Cocktail " + (i + 1));
        }
    }

    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order() {
        List<String> cocktails = order.getCocktails();
        assertEquals(0, cocktails.size());
    }

    @Then("the order contains {int} cocktails")
    public void the_order_contains_cocktails(int expectedNumberOfCocktails) {
        List<String> cocktails = order.getCocktails();
        assertEquals(expectedNumberOfCocktails, cocktails.size());
    }
}

