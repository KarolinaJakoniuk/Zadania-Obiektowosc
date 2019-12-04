package com.company.Zadanie5;

public class Pozycja {
   protected String nazwaTowaru;
   protected int iloscSztuk;
   protected double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }
    public double obliczWartosc() {
        return cenaSztuki*iloscSztuk;
    }


    @Override
    public String toString() {
        return
                this.nazwaTowaru + "  " +
                        this.cenaSztuki + "zł " +
                        this.iloscSztuk + "szt.  " +
                        obliczWartosc() + "zł "
                        + "\n";
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public double getCenaSztuki() {
        return cenaSztuki;
    }
}
