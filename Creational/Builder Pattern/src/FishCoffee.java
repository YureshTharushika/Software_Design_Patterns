public class FishCoffee extends MealBuilder{

    private Meal meal;

    public FishCoffee() {
        meal = new Meal();
    }

    @Override
    public void addRoll() {
        this.meal.setRoll("Fish");
    }

    @Override
    public void addDrink() {
        this.meal.setDrink("Coffee");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
