package com.mycompany.adivinhacao;

import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        Scanner adivinha = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int tentativa = 0;
        int palpite;
        boolean acertou = false;
        
        System.out.println("Adivinhe o numero entre 1 e 100!");
        
        while (!acertou) {
            tentativa++;
            System.out.print("Tentativa " + tentativa + ": ");
            palpite = adivinha.nextInt();
            
            int diferenca = Math.abs(numeroSecreto - palpite);
            
            if (palpite == numeroSecreto){
                System.out.println("Parabens! Voce acertou em " + tentativa + " tentativas.");
                acertou = true;
            } else if (diferenca >= 50) {
                System.out.println("Frio! Tente novamente.");
            } else if (diferenca >= 20){
                System.out.println("Morno... Esta chegando.");
        } else if (diferenca >= 10) { 
                System.out.println("Quente!");
        } else {
                System.out.println("Pegando fogo!");
        }
    }
}}
