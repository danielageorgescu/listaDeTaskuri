package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> variante = new ArrayList<>();
        Random random = new Random();
        Integer randomInt = null;
        Integer numaratoare;

        for (numaratoare = 0; numaratoare <10; numaratoare++){
                randomInt = random.nextInt(2);
                System.out.print(randomInt + " ");
                variante.add(randomInt);
                Task Task = null;

                if (randomInt== 0) {
                    Task = new Printer(" A fost ales 0");
                } else {
                    Task = new Insumare(2, 3);
                }
                Task.executa();
        }
        System.out.println(variante);
    }
}

