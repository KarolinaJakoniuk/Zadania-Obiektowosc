package com.company.Zadania1;

public class Komputer {
    protected int potrzebnaMoc;
    protected String producent;
    protected TypProcesora typProcesora;

    public Komputer(int potrzebnaMoc, String producent, TypProcesora typProcesora) {
        this.potrzebnaMoc = potrzebnaMoc;
        this.producent = producent;
        this.typProcesora = typProcesora;
    }

    public String toString() {
        return "Potrzebna moc: " + this.potrzebnaMoc + ", Producent: " + this.producent + " ,Typ prcesora: " + this.typProcesora;

    }
}
