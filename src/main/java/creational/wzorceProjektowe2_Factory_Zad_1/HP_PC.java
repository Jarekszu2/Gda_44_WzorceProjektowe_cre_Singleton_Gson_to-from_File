package creational.wzorceProjektowe2_Factory_Zad_1;

public class HP_PC extends AbstractPC {
    public HP_PC(String name, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, CpmputerBrand.HP, cpuPower, gpuPower, isOverclocked);
    }

    public static HP_PC createHP_MEGA_5() {
        return new HP_PC("MEGA_5", 5, 10, true);
    }
}
