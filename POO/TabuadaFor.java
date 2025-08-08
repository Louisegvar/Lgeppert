package com.mycompany.tabuadafor;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        System.out.println("Digite o numero que deseja saber a tabuada: ");
        int numero = tabuada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+" x " + i + " = " + ( numero * i));
        }
    }
}
