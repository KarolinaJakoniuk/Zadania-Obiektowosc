package com.company.Zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robot robocik = new Robot(100, "Robocik", true);

        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
            System.out.println("Podaj komendę: ruch, naładuj, włącz, wyłącz, koniec");
            komenda = scanner.nextLine();

            if (komenda.equals("ruch")) {
                System.out.println("Jaki ruch ma wykonać robot: KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA, RUCH_REKA_PRAWA, SKOK ?");
                String rodzajRuchu = scanner.nextLine();

                switch (rodzajRuchu) {
                    case "KROK_LEWA":
                        robocik.poruszRobotem(RuchRobota.KROK_LEWA);
                        break;
                    case "KROK_PRAWA":
                        robocik.poruszRobotem(RuchRobota.KROK_PRAWA);
                        break;
                    case "RUCH_REKA_LEWA":
                        robocik.poruszRobotem(RuchRobota.RUCH_REKA_LEWA);
                        break;
                    case "RUCH_REKA_PRAWA":
                        robocik.poruszRobotem(RuchRobota.RUCH_REKA_PRAWA);
                        break;
                    case "SKOK":
                        robocik.poruszRobotem(RuchRobota.SKOK);
                        break;
                    default:
                        System.out.println("Podałeś niewłaściwą komendę");
                }
            } else {
                switch (komenda) {
                    case "naładuj":
                        robocik.naładujBaterie();
                        break;
                    case "włącz":
                        robocik.wyłaczRobota();
                        break;
                    case "wyłącz":
                        robocik.wyłaczRobota();
                        break;
                }
            }
        } while (!komenda.equals("koniec"));
    }
}
