package com.mycompany.maioridade;

import java.util.Scanner;

public class Maioridade {

    public static void main(String[] args) {
       Scanner maior= new Scanner(System.in);
       System.out.println("Digite sua idade: ");
       int idade = maior.nextInt();
       
       if (idade >= 18) {
           System.out.println("Voce e maior de idade.");
    } else {
           System.out.println("Voce e menor de idade.");
           }
}
}
