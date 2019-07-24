package wzorceProjektowe2_Builder;

public class Main {
    public static void main(String[] args) {
        Stamp stamp = new Stamp.Builder()
                .setFirstDayNumber(1)
                .setFirstMonthNumber(5)
                .createStamp();
        System.out.println(stamp);

        System.out.println();
        Stamp stamp1 = new Stamp(1, 1, 1, 1, 1, 1, 1, 1, 1);
        System.out.println(stamp1);
    }
}
