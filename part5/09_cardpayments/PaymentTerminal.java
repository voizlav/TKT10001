
public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;
    private double affordableMealCosts;
    private double heartyMealCosts;

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
        this.affordableMealCosts = 2.50;
        this.heartyMealCosts = 4.30;
    }

    public double eatAffordably(double payment) {
        if (payment >= this.affordableMealCosts) {
            this.money += this.affordableMealCosts;
            this.affordableMeals++;
            return payment - this.affordableMealCosts;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(this.affordableMealCosts)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if (payment >= this.heartyMealCosts) {
            this.money += this.heartyMealCosts;
            this.heartyMeals++;
            return payment - this.heartyMealCosts;
        }
        return payment;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(this.heartyMealCosts)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
