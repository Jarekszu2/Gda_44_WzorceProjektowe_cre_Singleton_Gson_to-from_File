package behavioral.strategyZad1;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Hero {
    private String name;
    private I_Strategy i_strategy;

    public Hero(String name) {
        this.name = name;

        Miecz miecz = new Miecz();
        this.i_strategy = miecz;
    }

    public void zmienBron(I_Strategy i_strategy) {
        setI_strategy(i_strategy);
    }

    public void pojedynek() {
        i_strategy.walcz();
    }
}
