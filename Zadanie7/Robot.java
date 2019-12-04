package com.company.Zadanie7;

public class Robot {
    private int poziomBateri;
    private String nazwaRobota;
    private boolean czyWłączony;

    public Robot(int poziomBateri, String nazwaRobota, boolean czyWłączony) {
        this.poziomBateri = poziomBateri;
        this.nazwaRobota = nazwaRobota;
        this.czyWłączony = czyWłączony;
    }

    public int getPoziomBateri() {
        return poziomBateri;
    }

    public void setPoziomBateri(int poziomBateri) {
        this.poziomBateri = poziomBateri;
    }

    public boolean isCzyWłączony() {
        return czyWłączony;
    }

    public void poruszRobotem(RuchRobota ruch) {
        if (czyWłączony == true) {
            if (poziomBateri - ruch.getPotrzebnaEnergia() >= 0) {
                poziomBateri -= ruch.getPotrzebnaEnergia();
            } else {
                System.out.println("Za niski pozniom baterii na ruch");
            }
        } else {
            System.out.println("Robot wyłączony ");
        }
    }

    public void naładujBaterie() {
        if (isCzyWłączony()) {
            setPoziomBateri(100);
            System.out.println("Bateria Nąłdowana");
        } else {
            System.out.println("Wyłacz robota jesli chcesz naładować baterię");
        }
    }

    public void włączRobota() {
        if (!isCzyWłączony()) {
            this.czyWłączony = !this.czyWłączony;
        } else {
            System.out.println("Robot już został włączony");
        }
    }

    public void wyłaczRobota() {
        if (isCzyWłączony()) {
            this.czyWłączony = !this.czyWłączony;
        } else {
            System.out.println("Robot już wyłączony");
        }
    }
}


