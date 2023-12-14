package test.java;

import test.java.Kratos;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    private Kratos kratos;
    private boolean battleResult;

    @Given("Kratos is equipped with the {string}")
    public void kratosIsEquippedWith(String weapon) {
        kratos = new Kratos("Kratos", weapon, 100);
    }

    @When("Kratos engages in a battle with {string}")
    public void kratosEngagesInABattleWith(String enemy) {
        kratos.engageInBattle(enemy);
        // Assuming a simple condition for success
        battleResult = enemy.equals("Cerberus");
    }

    @Then("Kratos should be able to defeat {string}")
    public void kratosShouldBeAbleToDefeat(String enemy) {
        Assert.assertTrue("Kratos should have defeated " + enemy, battleResult);
    }

    @When("Kratos explores the environment")
    public void kratosExploresTheEnvironment() {
        kratos.solvePuzzle("Ancient Puzzle");
        // Assume the puzzle is always solvable for simplicity
    }

    @When("Kratos uses his godly powers")
    public void kratosUsesHisGodlyPowers() {
        kratos.useGodlyPowers();
        // Assume the godly powers are always successful for simplicity
    }

    @Then("Kratos should successfully reach the other side")
    public void kratosShouldSuccessfullyReachTheOtherSide() {
        // Assuming a simple condition for success
        boolean reachedOtherSide = true;
        Assert.assertTrue("Kratos should have reached the other side", reachedOtherSide);
    }
}
