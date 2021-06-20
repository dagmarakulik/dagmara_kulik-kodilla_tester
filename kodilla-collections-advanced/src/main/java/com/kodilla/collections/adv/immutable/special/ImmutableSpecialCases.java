package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 1160; //zmienna a typu Integer o wartosci 1160
        Integer b = 1160; // zmienna b typu Integer o wartosci 1160
        System.out.println(a == b); // false, bo porówna nie obiekty, a jedynie zawartosci zmiennych a i b
        System.out.println(a.equals(b)); // = true, bo oba obiekty zawieraja te sama wartosc
        Integer f = 112;
        Integer g = 112;
        System.out.println(f == g);
        System.out.println(f.equals(g));
        // oba są true, bo Dzieje się tak, ponieważ klasa Integer posiada z góry utworzone, predefiniowane obiekty dla liczb o wartościach od -128 do 127. Zakres ten odpowiada zakresowi wartości, który można zapisać w jednym bajcie pamięci (w wersji ze znakiem). Dzięki temu częste używanie małych liczb nie powoduje zapełniania pamięci komputera nowymi obiektami – po prostu Java używa ponownie już raz wykorzystane obiekty dla tych wartości. Stąd też w przypadku liczb o zakresie wartości od -128 do 127 adresy obiektów przechowujących te liczby będą takie same, jeżeli stworzymy kilka zmiennych o tej samej wartości. W przypadku wartości bardziej odległych od zera sytuacja taka nie będzie już miała miejsca i dwie zmienne przechowujące tę samą wartość będą tak naprawdę osobnymi obiektami w pamięci komputera.
        System.out.println("-------");
        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("-------");
        Integer c = 100;
        Integer d = 100;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        c = 10567;
        d = 10567;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
    }
}
