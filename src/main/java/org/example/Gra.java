package org.example;

public class Gra {
    private int punktyZaKsztalt(String ksztalt) {
        switch (ksztalt) {
            case "X": return 1;
            case "Y": return 2;
            case "Z": return 3;
            default: return 0;
        }
    }

    private int punktyZaWynik(String przeciwnik, String gracz) {
        if ((przeciwnik.equals("A") && gracz.equals("X")) ||
                (przeciwnik.equals("B") && gracz.equals("Y")) ||
                (przeciwnik.equals("C") && gracz.equals("Z"))) {
            return 3;
        }

        if ((przeciwnik.equals("A") && gracz.equals("Y")) ||
                (przeciwnik.equals("B") && gracz.equals("Z")) ||
                (przeciwnik.equals("C") && gracz.equals("X"))) {
            return 6;
        }

        return 0;
    }

    public int obliczPunktyRundy(String linia) {
        String[] ruchy = linia.trim().split(" ");
        String przeciwnik = ruchy[0];
        String gracz = ruchy[1];

        return punktyZaKsztalt(gracz) + punktyZaWynik(przeciwnik, gracz);
    }

    public int obliczCalkowyWynik(String[] linie) {
        int suma = 0;

        for (String linia : linie) {
            if (!linia.trim().isEmpty()) {
                suma += obliczPunktyRundy(linia);
            }
        }

        return suma;
    }

    public void pokazRunde(String linia, int numer) {
        String[] ruchy = linia.trim().split(" ");
        String przeciwnik = ruchy[0];
        String gracz = ruchy[1];

        String ksztaltPrzeciwnika = tlumaczKsztalt(przeciwnik);
        String ksztaltGracza = tlumaczKsztalt(gracz);
        int punkty = obliczPunktyRundy(linia);

        System.out.println("Runda " + numer + ": " +
                ksztaltPrzeciwnika + " vs " + ksztaltGracza +
                " = " + punkty + " pkt");
    }

    private String tlumaczKsztalt(String kod) {
        switch (kod) {
            case "A":
            case "X": return "Kamień";
            case "B":
            case "Y": return "Papier";
            case "C":
            case "Z": return "Nożyce";
            default: return "?";
        }
    }
}
