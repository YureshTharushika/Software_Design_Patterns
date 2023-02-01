public class Burger {

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onioin;
    private boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder){
        size = burgerBuilder.size;
        egg = burgerBuilder.egg;
        extraCheese = burgerBuilder.extraCheese;
        mayonese = burgerBuilder.mayonese;
        onioin = burgerBuilder.onioin;
        lettuce = burgerBuilder.lettuce;

    }


    public static class BurgerBuilder{
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onioin;
        private boolean lettuce;

        public BurgerBuilder size(String size){
            this.size = size;
            return this;
        }
        public BurgerBuilder egg(boolean egg){
            this.egg = egg;
            return this;
        }
        public BurgerBuilder extraCheese(boolean extraCheese){
            this.extraCheese = extraCheese;
            return this;
        }
        public BurgerBuilder mayonese(boolean mayonese){
            this.mayonese = mayonese;
            return this;
        }
        public BurgerBuilder onioin(boolean onioin){
            this.onioin = onioin;
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce){
            this.lettuce = lettuce;
            return this;
        }
        public Burger build(){
            return new Burger(this);
        }

    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", egg=" + egg +
                ", extraCheese=" + extraCheese +
                ", mayonese=" + mayonese +
                ", onioin=" + onioin +
                ", lettuce=" + lettuce +
                '}';
    }
}
