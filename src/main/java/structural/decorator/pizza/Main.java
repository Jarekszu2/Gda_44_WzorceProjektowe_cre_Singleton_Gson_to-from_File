package structural.decorator.pizza;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        SimplePizza simplePizza = new SimplePizza();
        System.out.println(simplePizza);

        CustomPizza wlasna = new CustomPizza(simplePizza, "ser", "mieso", "grzyby");
        System.out.println(wlasna);
    }

}
