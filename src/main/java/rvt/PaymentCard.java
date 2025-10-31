package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    public void eatAffordably() {
        if (balance - 2.60 > 0) {
            balance = balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (balance - 4.60 > 0) {
            balance = balance - 4.60;
        }
    }
    public void addMoney(double amount) {
        if (amount > 0) {
        balance = balance + amount;
            if (balance + amount > 150) {
                balance = 150;
            }
        }
    }
}
