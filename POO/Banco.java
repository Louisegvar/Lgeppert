package com.mycompany.banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);
        double saldo = 1000;
        int opcao;
        
        do{
            System.out.println("\n=== CAIXA ELETRONICO ===");
            System.out.println("1. Ver saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = banco.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                    
                case 2:
                    System.out.println("Digite o valor para saque: ");
                    double saque = banco.nextDouble();
                    if (saque <=0){
                        System.out.println("Valor invalido para saque.");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
                    }
                    break;
                    
                case 3:
                    System.out.println("Digite o valor para deposito: ");
                    double deposito = banco.nextDouble();
                    if (deposito <=0){
                        System.out.println("Valor invalido para deposito.");
                    } else {
                        saldo += deposito;
                        System.out.println("Deposito realizado. Novo saldo: R$" + saldo);
                    }    break;
                    
                case 4:
                    System.out.println("Encerrando sessao.");
                    break;
                    
                default: 
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }       while (opcao !=4);
    }
}
