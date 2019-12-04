package com.company.Zadanie5;

import java.util.Arrays;

public class Zamowienie {
    private int maxRozmiar;
    private Pozycja[] pozycje;

    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycje = new Pozycja[maxRozmiar];
    }

    public Zamowienie() {
        maxRozmiar = 10;
    }
    public void dodajPozycje(Pozycja pozycja) {
        for (int i = 0; i <pozycje.length; i++) {
            if (pozycje[i] == null) {
                pozycje[i] = pozycja;
                break;
            }
        }
    }

    public double obliczWartosc(){
        double wartoscZamowniea=0.0;
        for (int i =0; i<pozycje.length;i++){
            wartoscZamowniea+= pozycje[i].obliczWartosc();
        }return wartoscZamowniea;

    }


    @Override
    public String toString() {
        return "Zamowienie:" +"\n "+
                Arrays.toString(pozycje)+
                "Razem: "+obliczWartosc()+ "zł";

    }
}
