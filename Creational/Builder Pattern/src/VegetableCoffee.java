public class VegetableCoffee extends MealBuilder{

    private Meal meal;
    public VegetableCoffee() {
        meal = new Meal();
    }

    @Override
    public void addRoll() {
        this.meal.setRoll("Vegetable");
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
