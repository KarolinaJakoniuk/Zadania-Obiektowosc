package com.company.Zadanie2;

public abstract class Citizen {
    protected String imie;

    public Citizen(String imie) {
        this.imie = imie;
    }

    public abstract boolean canVote();
}
