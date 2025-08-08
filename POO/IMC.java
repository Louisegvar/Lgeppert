package com.mycompany.imc;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        System.out.print("Digite seu peso (kg): ");
        double peso = ver.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double altura = ver.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC e: %.2f \n", imc);
        
        if (imc <18.5) {
            System.out.println("Classificacao: Abaixo do peso");
        } else if (imc<25) {
        System.out.println("Classificacao: Peso normal");
            } else if (imc<30) {
        System.out.println("Classificacao: Sobrepeso");
            } else if (imc<35) {
                System.out.println("Classificacao: Obesidade grau 1");
            } else if (imc<40) {
                System.out.println("Classificacao: Obesidade grau 2");
            } else {
                System.out.println("Classificacao: Obesidade grau 3"); 
            }
} }         
