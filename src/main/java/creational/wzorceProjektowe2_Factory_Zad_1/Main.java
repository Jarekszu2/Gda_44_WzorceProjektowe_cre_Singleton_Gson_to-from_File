package creational.wzorceProjektowe2_Factory_Zad_1;

public class Main {
    public static void main(String[] args) {
        AsusPC asusPC = AsusPC.createAir13();
        System.out.println(asusPC);


        System.out.println();
        HP_PC hp_pc = HP_PC.createHP_MEGA_5();
        System.out.println(hp_pc);
    }
}
