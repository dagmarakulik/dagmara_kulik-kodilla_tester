package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("Balance of my wallet should be $170", () -> {
            Assert.assertEquals(170, wallet.getBalance());
        });

        When("I request $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("Nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Given("There is $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I withdraw $300", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 300);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, wallet.getBalance());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("You don't have enough money in your wallet", 200, wallet.getBalance());
        });

        When("I check the balance of my wallet", () -> {
            System.out.println(wallet.getBalance());
        });

        Then("It should be shown that the balance is $200", () -> {
            Assert.assertEquals(200, wallet.getBalance());
        });


    }
}