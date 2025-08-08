package com.mycompany.votacao;

import java.util.Scanner;

public class Votacao {

    public static void main(String[] args) {
        Scanner urna = new Scanner(System.in);
        int opcao, joao=0, maria =0, ana =0, branco =0;
        do{
        System.out.println("Digite seu voto: ");
        System.out.println("1 - Joao");
        System.out.println("2 - Maria");
        System.out.println("3 - Ana");
        System.out.println("4 - Voto em branco");
        System.out.println("0 - Encerrar votacao");
        opcao =urna.nextInt();
        
       
        
        switch (opcao){
            case 1:
        
                joao ++;
            break;
             
            case 2:
                
                maria ++;
            break;
            
            case 3:
               
                ana ++;
            break;
            
            case 4:
                
                branco ++;
            break;
            
            case 0:
                System.out.println("Encerrando votacao...");
            break;
            
            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
        } while (opcao !=0);
        System.out.println("RESULTADO FINAL: ");
        System.out.println("Joao = "+joao);
        System.out.println("Maria = "+maria);
        System.out.println("Ana = "+ana);
        System.out.println("Brancos = " +branco);
        if (joao > maria && joao > ana){
            System.out.println("O vencedor e Joao, com "+joao+" votos.");
        } else if (maria> joao && maria> ana){
            System.out.println("O vencedor e Maria, com " +maria+" votos.");
        } else if (ana > joao && ana> maria){
            System.out.println("O vencedor e Ana, com "+ana+ " votos.");
        } else {
            System.out.println("Empate entre candidatos.");
        }
    }
}
