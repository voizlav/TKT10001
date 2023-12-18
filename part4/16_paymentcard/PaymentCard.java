public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        String text = "The card has a balance of %s euros";
        return String.format(text, Double.toString(this.balance));
    }

    public void eatAffordably() {
        double price = 2.60;
        if (this.balance - price >= 0) {
            this.balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;
        if (this.balance - price >= 0) {
            this.balance -= price;
        }
    }

    public void addMoney(double amount) {
        if (amount <= 0) {
            return;
        }
        int limit = 150;
        if (this.balance + amount > limit) {
            this.balance = limit;
        } else {
            this.balance += amount;
        }
    }
}
