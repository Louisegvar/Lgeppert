package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner cal = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double num1 = cal.nextDouble();
        
        System.out.println("Digite um operador (+, -, *, /): ");
        char operador = cal.next(). charAt(0);
        
        System.out.println("Digite um segundo numero: ");
        double num2 = cal.nextDouble();
        
        double resultado;
        
        if (operador == '+'){
            resultado = num1 + num2; 
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '*'){
            resultado = num1 * num2; 
        } else if (operador == '/'){
            if (num2 != 0){
                resultado = num1 / num2;
            } else{
                System.out.println("Erro: divisao por zero!"); 
                return;
            } 
        } else {
            System.out.print("Operador invalido.");
            return;
        }
        System.out.println("Resultado: " + resultado);
}}
