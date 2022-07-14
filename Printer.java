package com.itfactory;

public class Printer implements Task {

    private String imprimanta;

    public Printer (String imprimanta){
    this.imprimanta= imprimanta;
}
    @Override
    public void executa() {
        System.out.println(imprimanta);
    }
}
