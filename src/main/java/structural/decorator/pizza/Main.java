package structural.decorator.pizza;
/*
1. tworzę obiekt (SimplePizza), który jest bazą dla innych obiektów;
2. tworzę interfejs (IPizza), który mówi co się będzie zmieniać w obiekcie bazowym (co do niego dodamy)
3. tworzę obiekt po zmianach i definiuję metody zmian
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        SimplePizza simplePizza = new SimplePizza();
        System.out.println(simplePizza);

        CustomPizza wlasna = new CustomPizza(simplePizza, "ser", "mieso", "grzyby");
        System.out.println(wlasna);
    }

}
