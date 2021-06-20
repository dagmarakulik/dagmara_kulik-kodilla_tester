package homework.game;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivided implements En {

    private int number;
    private String result;

    public IsItDivided() {
        Given("Number is 3", () -> {
            this.number = 3;
        });

        Given("Number is 5", () -> {
            this.number = 5;
        });

        Given("Number is 15", () -> {
            this.number = 15;
        });

        Given("Number is 4", () -> {
            this.number = 4;
        });

        Given("Number is 30", () -> {
            this.number = 30;
        });

        Given("Number is 25", () -> {
            this.number = 25;
        });

        When("I ask whether the number is divided", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.result = numberChecker.checkIfDivided(this.number);
        });

        Then("It should be returned {string}", (String string) -> {
            Assert.assertEquals(string, this.result);
        });
    }
}
