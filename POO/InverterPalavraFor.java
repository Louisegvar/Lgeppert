package com.mycompany.inverterpalavrafor;

import java.util.Scanner;

public class InverterPalavraFor {

    public static void main(String[] args) {
       Scanner inver = new Scanner(System.in);
       System.out.println("Digite a frase que deseja: ");
       String frase = inver.nextLine();
       for (int i = frase.length() - 1; i >= 0; i--) {
           System.out.print(frase.charAt(i));
       }
    }
}
