public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        String text = "The card has a balance of %.2f euros.";
        return String.format(text, this.balance);
    }
}
