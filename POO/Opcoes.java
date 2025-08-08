package com.mycompany.opcoes;

import java.util.Scanner;

public class Opcoes {

    public static void main(String[] args) {
        Scanner escolher = new Scanner (System.in);
        int opcao = 0; 
        while (opcao != 5){
        
        System.out.println("Bem-vindo ao Aventuras em CodigoLand!");
        System.out.println("Escolha uma opcao: ");
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Garregar Jogo");
        System.out.println("3 - Configuracoes");
        System.out.println("4 - Creditos");
        System.out.println("5 - Sair");
        
        System.out.print("Digite sua opcao: ");
        opcao = escolher.nextInt();
        
        
            
        switch (opcao) {
            case 1:
                System.out.println("Iniciando nova aventura... Boa sorte!");
                break;
            case 2: 
                System.out.println("Carregando jogo salvo...");
                break;
            case 3: 
                System.out.println("Abrindo configuracoes...");
                break;
            case 4:
                System.out.println("Creditos:\nDesenvolvido por Turma de Desenvolvimento de Sistemas.");
                break;
            case 5:
                System.out.println("Saindo do jogo. Ate a proxima aventura!");
                break;
            default:
                System.out.println("Opcao invalida. Tente novamente.");
                
        }
    }
}}

