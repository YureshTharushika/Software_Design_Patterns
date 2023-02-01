public class Main {

    public static void main(String[] args) {
        Meal meal = new MealDirector(new VegetableCoffee()).prepareMeal();
        System.out.println("Your meal contains "+meal.getRoll()+" roll and "+meal.getDrink());


    }
}
