public class EggTea extends MealBuilder{

    private Meal meal;

    public EggTea() {
        meal = new Meal();
    }

    @Override
    public void addRoll() {
        this.meal.setRoll("Egg");
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
