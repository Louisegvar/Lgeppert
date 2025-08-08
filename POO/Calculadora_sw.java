package com.mycompany.calculadora_sw;

import java.util.Scanner;

public class Calculadora_sw {

    public static void main(String[] args) {
        Scanner escolher = new Scanner (System.in);
        int opcao = 0;
        
        while (opcao != 5) {
            System.out.println("\n Calculadora");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma operacao: ");
            opcao = escolher.nextInt();
            
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro numero: ");
                double num1 = escolher.nextDouble();
                System.out.print("Digite o segundo numero: ");
                double num2 = escolher.nextDouble();
                
                switch (opcao) {
                    case 1: 
                        System.out.println("Resultado: " + (num1  + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4: 
                        if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Erro: divisao por zero.");
                        }
                        break;
                } 
          
                
            } else if (opcao == 5) {
                System.out.println("Saindo da calculadora.");
            } else {
                System.out.println("Opcao invalida. Tente novamente");
            }
            
        }
    }
}
