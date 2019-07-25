package creational.wzorceProjektowe2_Factory_Zad_1;
/*
Uwaga!
1. W konstruktorze usuwam pole ComputerBrand computerBrand.
2. W konstruktorze (super) dopisuję pozycję, którą chcę wybrać (np. ComputerBrand.ASUS)
3. Tworzę metodę statyczną z parametrami obiektu jakie chcę ustawić jako początkowe.
4. Jak chcę zmienić parametry to: setami.
 */
public class AsusPC extends AbstractPC {
    public AsusPC(String name, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, CpmputerBrand.ASUS, cpuPower, gpuPower, isOverclocked);
    }

    public static AsusPC createAir13() {
        return new AsusPC("Air13", 10, 1, false);
    }
}
