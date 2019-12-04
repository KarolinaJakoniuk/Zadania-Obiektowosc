package com.company.Zadania1;

public class Laptop extends Komputer {
    protected double wielkoscMatrycy;
    protected boolean retine;


    public Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora,double wielkoscMatrycy, boolean retine) {
        super(potrzebnaMoc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.retine = retine;
    }
    @Override
    public String toString(){
        return "Potrzebna moc: "+this.potrzebnaMoc+ ", Producent: "+this.producent+" ,Typ prcesora: "+this.typProcesora+ ", wielośc matrycy: "+this.wielkoscMatrycy+ ", retine: "+this.retine;

    }
}
