package com.mycompany.gerenciadorestoque;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorEstoque {

    public static void main(String[] args) {
        Scanner escolher = new Scanner(System.in);
        ArrayList<String> estoque = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("\n==== MENU GERENCIADOR DE ESTOQUE ====");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Listar item");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = escolher.nextInt();
            escolher.nextLine();
            
            switch (opcao) {
                case 1: 
                    System.out.println("Digite o nome do item para adicionar: ");
                    String itemAdd = escolher.nextLine();
                    if (!itemAdd.trim(). isEmpty()) {
                        estoque.add(itemAdd);
                        System.out.println("Item adicionado."); 
                    } else {
                            System.out.println("Nome invalido.");
                            }
                    break;
                    
                case 2: 
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                    } else {
                        System.out.println("Digite o nome do item para remover: ");
                        String itemRemove = escolher.nextLine();
                        if (estoque.contains(itemRemove)) {
                        estoque.remove(itemRemove);
                        System.out.println("Item removido.");
                    } else {
                    System.out.println("Item nao encontrado.");
                    }
                }
                break;
                
                case 3: 
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                    } else {
                        System.out.println("Itens no estoque: ");
                        for (String item: estoque) {
                            System.out.println("- " + item);
                        }
                    }
                    break;
                case 4: 
                    System.out.println("Saindo do programa...");
                    break;
                    
                default: 
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 4);
    }
}
