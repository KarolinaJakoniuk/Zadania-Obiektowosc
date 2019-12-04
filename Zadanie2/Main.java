package com.company.Zadanie2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Citizen k1 = new King("Alfred");
        Citizen k2 = new King("Jurek");
        Citizen p1 = new Peasant("Jacek");
        Citizen s1 = new Soldier("Rambo");
        Citizen t1 = new Townsman("Hubert");
        Citizen t2 = new Townsman("Lech");

      Citizen[] tablicaMieszkanców = {k1,k2,p1,s1,t1,t2 };
        System.out.println(Town.howManyCanVote(tablicaMieszkanców));
        System.out.println(Arrays.toString(Town.whoCanVote2(tablicaMieszkanców)));

    }


}
