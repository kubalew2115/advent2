package org.example;

public class Main {

    public static void main(String[] args) {
        Gra gra = new Gra();

        String[] dane = {
                "A Y",
                "B X",
                "C Z"
        };

        System.out.println("SZCZEGOLY GRY\n");
        for (int i = 0; i < dane.length; i++) {
            if (!dane[i].trim().isEmpty()) {
                gra.pokazRunde(dane[i], i + 1);
            }
        }

        int wynik = gra.obliczCalkowyWynik(dane);

        System.out.println("\nKONCOWY WYNIK");
        System.out.println("Suma punktów: " + wynik);
    }
}
