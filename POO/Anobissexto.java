package com.mycompany.anobissexto;

import java.util.Scanner;

public class Anobissexto {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Digite um ano:");
        int ano = data.nextInt();
        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano e bissexto.");
        } else {
            System.out.println("O ano nao e bissexto.");
        }
      
    }
}
