package com.itfactory;

public class Insumare implements Task{
    private int suma1;
    private int suma2;

    public Insumare(int suma1, int suma2){
        this.suma1=suma1;
        this.suma2=suma2;
    }

    @Override
    public void executa() {
        System.out.println(suma1+suma2);
    }
}
