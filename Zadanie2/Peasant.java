package com.company.Zadanie2;

public class Peasant extends Citizen {
    public Peasant(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return false;
    }

    @Override
    public String toString() {
        return "Peasant{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
