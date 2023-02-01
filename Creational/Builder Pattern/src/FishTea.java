public class FishTea extends MealBuilder{

    private Meal meal;
    public FishTea() {

        meal = new Meal();
    }

    @Override
    public void addRoll() {
        this.meal.setRoll("Fish");
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
