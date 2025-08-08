package com.mycompany.mediaaluno;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);
        int opcao;
        
        while (true){
            System.out.println("1. Calcular nova media");
            System.out.println("2. Sair");
            opcao = media.nextInt();
            
            switch(opcao){
                case 1 -> {
                    media.nextLine();
                 System.out.println("Digite o nome do aluno:");
            String nome = media.nextLine();
            
            System.out.println("Digite a primeira nota do aluno: ");
            double nota1 = media.nextDouble();
            
            System.out.println("Digite a segunda nota do aluno: ");
            double nota2 = media.nextDouble();
            
            double resul=(nota1 + nota2)/2;
            
            if (resul>=9) {
                System.out.println("A media do aluno e: "+resul+ " Conceito A");
                System.out.println(nome+", parabens, otimo desempenho!");
            } else if (resul>=7 && resul<=8.9){
                System.out.println("A media do aluno e: "+resul+ " Conceito B");
                System.out.println(nome+", parabens, otimo desempenho!");
            } else if (resul>=5 && resul<=6.9){
                System.out.println("A media do aluno e: "+resul+ " Conceito C");
                System.out.println(nome+", atencao! Voce esta na media.");
                
            } else if (resul>=3 && resul<=4.9){
                System.out.println("A media do aluno e: "+resul+ " Conceito D");
                System.out.println(nome+", procure apoio para melhorar seu rendimento.");
                
            } else {
                System.out.println("A media do aluno e: "+resul+ " Conceito E");
                System.out.println(nome+", procure apoio para melhorar seu rendimento.");
               
            }   }
                case 2 -> {
                    System.out.println("Encerrando sessao.");
                    break;
                    }  
               
                
            }
        }
    }
    }

            
            
        
        

