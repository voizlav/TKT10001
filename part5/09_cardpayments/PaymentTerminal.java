
public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        double affordableMealCosts = 2.50;
        if (payment < affordableMealCosts) {
            return payment;
        }
        this.money += affordableMealCosts;
        this.affordableMeals++;
        return payment - affordableMealCosts;
    }

    public double eatHeartily(double payment) {
        double heartyMealCosts = 4.30;
        if (payment < heartyMealCosts) {
            return payment;
        }
        this.money += heartyMealCosts;
        this.heartyMeals++;
        return payment - heartyMealCosts;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
