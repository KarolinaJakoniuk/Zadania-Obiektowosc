package com.company.Zadanie2;

public class King extends Citizen {
    public King(String imie) {
        super(imie);
    }

    @Override
    public boolean canVote() {
        return false;
    }

    @Override
    public String toString() {
        return "King{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
