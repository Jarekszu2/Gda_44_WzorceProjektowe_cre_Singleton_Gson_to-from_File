package creational.wzorceProjektowe1_Builder_Zad_2_Lombok;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
@Builder
public class Stamp {
    private int firstDayNumber;
    private int secondDayNumber;
    private int firstMonthNumber;
    private int secondMonthNumber;
    private int yearNumber1;
    private int yearNumber2;
    private int yearNumber3;
    private int yearNumber4;
    private int caseNumber;

}
