package structural.decorator.pizza;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Data
public class CustomPizza implements IPizza {
    private SimplePizza simplePizza;
    List<String> dodatki = new ArrayList<>();
    private double price;

    public CustomPizza(SimplePizza simplePizza, String... dodatki) {
        this.dodatki.addAll(Arrays.asList(dodatki));
        this.simplePizza = simplePizza;
        this.price = getPrice();
    }

//    public void addIngredient(String ingredient) {
//        dodatki.add(ingredient);
//    }

    public List<String> getIngredients() {
        List<String> nowaLista = new ArrayList<>();
        nowaLista.addAll(dodatki);
        nowaLista.addAll(simplePizza.getIngredients());
        return nowaLista;
    }

    public double getPrice() {
        return simplePizza.getPrice() + dodatki.size() * 5;
    }
}
