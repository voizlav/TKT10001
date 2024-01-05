
public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;
    private static final double affordableMealCosts = 2.50;
    private static final double heartyMealCosts = 4.30;

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }

    public double eatAffordably(double payment) {
        if (payment >= affordableMealCosts) {
            this.money += affordableMealCosts;
            this.affordableMeals++;
            return payment - affordableMealCosts;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(affordableMealCosts)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if (payment >= heartyMealCosts) {
            this.money += heartyMealCosts;
            this.heartyMeals++;
            return payment - heartyMealCosts;
        }
        return payment;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(heartyMealCosts)) {
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
