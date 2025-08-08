package com.mycompany.guardioesdoparouimpar;

import java.util.Scanner;

public class GuardioesDoParouImpar {

    public static void main(String[] args) {
        Scanner tipo = new Scanner (System.in);
        
        int loop= 0;
        int par = 0;
        int impar = 0;
        
        while (loop<15) {
            System.out.println ("Digite um numero:");
            int numero = tipo.nextInt();
        if (numero%2 ==0) {
            par++;
        } else {
            impar++;
        } loop++;
        
        } System.out.println("Numeros pares:" +par);
          System.out.println("Numeros impares:" +impar); 
          
          System.out.println("Missao cumprida! Os guardioes do equilibrio agradecem sua ajuda.");
       
    }
}
