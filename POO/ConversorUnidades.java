package com.mycompany.conversor.unidades;

import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {
        Scanner unidade = new Scanner(System.in);
        int opcao;
        double valor, resultado;
        
        while (true) {
            System.out.println("\n=== Menu de Conversao ===");
            System.out.println("1 - Metros para Quilometros");
            System.out.println("2 - Quilometros para Metros");
            System.out.println("3 - Celsius para Fahrenheit");
            System.out.println("4 - Fahrenheit para Celsius");
            System.out.println("0 - Sair");
            
            opcao = unidade.nextInt();
            
            if (opcao == 0) {
                break;
            }
            
            System.out.println("Informe o valor: ");
            valor = unidade.nextDouble();
            
            switch (opcao){
                case 1 -> {
                    resultado = valor / 1000;
                    System.out.println(valor +" m = " + resultado + " km.");
                }
                
                case 2 -> {
                    resultado = valor * 1000;
                    System.out.println(valor +" km = " + resultado + " m.");
                }
                
                case 3 -> {
                    resultado = (valor * 9 / 5) + 32;
                    System.out.println(valor + "°C = " + resultado + "°F.");
                }
                
                case 4 -> {
                    resultado = (valor - 32) * 5 / 9;
                    System.out.println(valor +"°F = " + resultado + "°C.");   
                }
                default -> System.out.println("Opcao invalida.");
            }
        }
    }
}
