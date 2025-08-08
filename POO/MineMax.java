package com.mycompany.minemax;

import java.util.Scanner;

public class MineMax {

    public static void main(String[] args) {
        int maior = 0;
        int menor = 0;
        
        for (int i= 0; i< 10; i++) {
            int numero= (int)  (Math.random() * 100);
            System.out.println("Numero gerado: " + numero);
            
            if (i ==0){
                maior = numero;
                menor = numero;
            } else {
                maior = Math.max(maior, numero);
                menor = Math.min(menor, numero);
            }}
            System.out.println("Maior numero: " +maior);
            System.out.println("Menor numero: " +menor);
            
        }
                
    
}
