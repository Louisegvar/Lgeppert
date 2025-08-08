package com.mycompany.cacadoresdenumeros;

import java.util.Scanner;

public class CacadoresDeNumeros {

    public static void main(String[] args) {
        Scanner numeria = new Scanner (System.in);
        
       int loop = 0;
       int aliados = 0;
       int inimigos = 0;
       
       while (loop<10){
           System.out.println("Digite um numero: ");
           int numero= numeria.nextInt();
       if (numero >=0){
           aliados++;
       } else {
           inimigos++;
       } loop++;
       
       } System.out.println("Aliados: "+aliados);
         System.out.println("Inimigos: "+inimigos);
         System.out.println("Missao concluida com sucesso, defensor de Numeria!");
    }
}
