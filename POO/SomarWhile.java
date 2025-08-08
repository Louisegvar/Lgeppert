package com.mycompany.somarwhile;

import java.util.Scanner;

public class SomarWhile {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int soma=0;
        int numero;
        
        System.out.println("Digite numeros positivos para somar " + "(digite um numero negativo para sair)");
        
        while (true) {
        System.out.print("Digite um numero: ");
        numero = num.nextInt();
        
        if (numero < 0){
            System.out.println("Numero negativo detectado! Encerrando...");
            break;
        }
        soma += numero;
        System.out.println("Soma atual: "+ soma);
    }
        System.out.println("Soma final: " + soma);
}
}

