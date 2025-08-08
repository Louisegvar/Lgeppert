package com.mycompany.senhasegura;

import java.util.Scanner;

public class SenhaSegura {

    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        String senha;
        char escolha;
        
        do{
            System.out.println("Digite uma senha: ");
            senha = digitar.nextLine();
            
            if (senha.length() < 8) {
                System.out.println("A senha deve ter pelo menor 8 caracteres.");
            } else if (!senha.matches(".*[A-Z].*")){
                System.out.println("A senha deve conter pelo menos uma letra maiuscula");
            } else if (!senha.matches(".*[0-9].*")){
                System.out.println("A senha deve conter pelo menos um numero.");
            } else if (senha.contains(" ")){
                System.out.println("A senha não pode conter espacos.");
            } else {
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } 
            
              System.out.println("Deseja tentar novamnete? (S/N): ");
              escolha = digitar.nextLine().toUpperCase().charAt(0);
              
              switch (escolha) {
                  case 'S'-> System.out.println("Digite uma nova senha: ");
                  case 'N' -> System.out.println("Encerrando cadastro.");
                  default -> {
                      System.out.println("Opcao invalida. Encerrando.");
                      escolha = 'N';
                  }
              }
            } while ( escolha == 'S');
    }
}
