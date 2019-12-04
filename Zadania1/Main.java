package com.company.Zadania1;

public class Main {
    public static void main(String[] args) {
        Komputer komputer1 = new Komputer(256, "Dell", TypProcesora.WIELORDZENIOWY);
        Komputer komputer2 = new Komputer(512, "Mac", TypProcesora.WIELORDZENIOWY);
        Komputer komputer3 = new Komputer(126, "Acer", TypProcesora.JEDNORDZENIOWY);

        Laptop laptop1 = new Laptop(256, "Dell", TypProcesora.JEDNORDZENIOWY, 16.5, true);
        Laptop laptop2 = new Laptop(156, "Asus", TypProcesora.WIELORDZENIOWY, 12.5, false);

        Komputer[] tabela = {komputer1,komputer2,komputer3,laptop1,laptop2};
        for(int i=0; i<tabela.length; i++){
            System.out.println(tabela[i].toString());
        }

    }

}


