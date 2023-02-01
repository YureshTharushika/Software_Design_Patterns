public class EggCoffee extends MealBuilder{
    private Meal meal;

    public EggCoffee() {
        meal = new Meal();
    }

    @Override
    public void addRoll() {
        this.meal.setRoll("Egg");
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
