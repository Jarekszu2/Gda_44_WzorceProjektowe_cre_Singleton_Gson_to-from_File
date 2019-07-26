package behavioral.strategyZad1;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Hero hero = new Hero("Zawisza");
        Miecz miecz = new Miecz();
        Dzida dzida = new Dzida();
        Maczuga maczuga = new Maczuga();

        hero.pojedynek();
        hero.pojedynek();
        hero.pojedynek();
        hero.zmienBron(maczuga);
        hero.pojedynek();
        hero.pojedynek();
        hero.pojedynek();
        hero.pojedynek();
        hero.zmienBron(dzida);
        hero.pojedynek();
        hero.zmienBron(miecz);
        hero.pojedynek();
        hero.pojedynek();

    }
}
