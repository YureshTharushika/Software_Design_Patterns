public class VegetableTea extends MealBuilder{


    private Meal meal;
    public VegetableTea() {
        meal = new Meal();
    }

    @Override
    public void addRoll() {
        this.meal.setRoll("Vegetable");
    }

    @Override
    public void addDrink() {
        this.meal.setDrink("Tea");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
