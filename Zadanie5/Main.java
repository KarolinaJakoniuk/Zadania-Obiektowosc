package com.company.Zadanie5;

public class Main {
    public static void main(String[] args) {
        Pozycja nr1 = new Pozycja("Chleb", 5, 4.2);
        Pozycja nr2 = new Pozycja("Mars",5,3.1);
        Pozycja nr3 = new Pozycja("Mleko",3,3.6);

        Zamowienie zamowienie1 = new Zamowienie(3);
        zamowienie1.dodajPozycje(nr1);
        zamowienie1.dodajPozycje(nr2);
        zamowienie1.dodajPozycje(nr3);

        zamowienie1.obliczWartosc();

        System.out.println((zamowienie1.toString()));
    }


}
