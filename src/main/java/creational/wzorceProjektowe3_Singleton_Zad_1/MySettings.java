package creational.wzorceProjektowe3_Singleton_Zad_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class MySettings {
    private int zakres_liczby_1;
    private int zakres_liczby_2;
    private String dostepne_dzialania;
    private int ilosc_rund;
}
