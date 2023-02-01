public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder().egg(true).extraCheese(true).onioin(true).size("LARGE").build();
        System.out.println(burger.toString());
    }
}
