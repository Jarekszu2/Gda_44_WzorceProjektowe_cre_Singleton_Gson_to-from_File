package structural.decorator.choinka;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SimpleChristmasTree implements ITree {
    private int size;

    public SimpleChristmasTree(int size) {
        this.size = size;
    }

    public String buildStringTree() {
        String stringTree = "";

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < ((size - i) - 1); j++) {
                stringTree += " ";
            }

            for (int j = 0; j < (2 * i + 1); j++) {
                stringTree += "*";
            }

            stringTree += "\n";

        }

        return stringTree;
    }

    public void printTree() {
        System.out.println(buildStringTree());
    }
}
