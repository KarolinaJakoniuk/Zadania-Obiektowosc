package com.company.Zadanie7;

public enum RuchRobota {
    KROK_LEWA (15),
    KROK_PRAWA(15),
    RUCH_REKA_LEWA(10),
    RUCH_REKA_PRAWA(10),
    SKOK(40);

    private int potrzebnaEnergia;

    RuchRobota(int potrzebnaEnergia) {
        this.potrzebnaEnergia = potrzebnaEnergia;
    }

    public int getPotrzebnaEnergia() {
        return potrzebnaEnergia;
    }
}


