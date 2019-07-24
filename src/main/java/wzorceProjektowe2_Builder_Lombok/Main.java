package wzorceProjektowe2_Builder_Lombok;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Stamp stampBuilder = new Stamp.StampBuilder()
                .firstDayNumber(4)
                .secondDayNumber(5)
                .build();
        System.out.println(stampBuilder);
    }
}
