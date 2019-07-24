package wzorceProjektowe3;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor

public class AbstractPC {
    private String name;
    private CpmputerBrand computerBrand;
    private int cpuPower;
    private double gpuPower;
    private boolean isOverclocked;

    public AbstractPC(String name, CpmputerBrand computerBrand, int cpuPower, double gpuPower, boolean isOverclocked) {
        this.name = name;
        this.computerBrand = computerBrand;
        this.cpuPower = cpuPower;
        this.gpuPower = gpuPower;
        this.isOverclocked = isOverclocked;
    }
}
