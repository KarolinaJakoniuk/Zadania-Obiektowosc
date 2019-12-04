package com.company.Zadanie2;

public class Townsman extends Citizen{
    public Townsman(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return true;
    }

    @Override
    public String toString() {
        return "Townsman{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
