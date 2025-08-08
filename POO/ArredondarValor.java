package com.mycompany.arredondarvalor;

import java.util.Scanner;

public class ArredondarValor {

    public static void main(String[] args) {
        Scanner arredonda = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = arredonda.nextDouble() ;
        
        System.out.println("Arredonda normal: " + Math.round(valor));
        System.out.println("Arredonda pra cima: " + Math.ceil(valor));
        System.out.println("Arredonda pra baixo: " + Math.floor(valor));
    }
}
