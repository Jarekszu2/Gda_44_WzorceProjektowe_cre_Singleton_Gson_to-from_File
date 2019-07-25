package structural.decorator.pizza;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Data
//@AllArgsConstructor
@ToString
//@NoArgsConstructor
public class SimplePizza implements IPizza {
    private List<String> ingredients = new ArrayList<String>();
    private double price;

    public SimplePizza() {
        ingredients.add("pepper");
        ingredients.add("onion");
        ingredients.add("tomato");
        this.price = 10.5;
    }

    public List<String> getIngredients() {

        return ingredients;
    }

    public double getPrice() {
        return price;
    }
}
