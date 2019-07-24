package wzorceProjektowe3;

public class AsusPC extends AbstractPC {
    public AsusPC(String name, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, CpmputerBrand.ASUS, cpuPower, gpuPower, isOverclocked);
    }

    public static AsusPC createAir13() {
        return new AsusPC("Air13", 10, 1, false);
    }
}
