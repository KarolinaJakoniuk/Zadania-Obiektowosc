package com.company.Zadanie2;

public class Soldier extends Citizen {
    public Soldier(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return true;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
