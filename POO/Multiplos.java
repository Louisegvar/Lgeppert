package com.mycompany.multiplos;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);
        System.out.println("Digite o multiplo que deseja saber: ");
        int num = multi.nextInt();
        int cont = 0;
        for(int i = 1; i <=100; i++) {
        if (i % num == 0) {
        cont++;
           }
            
       }
        System.out.println("A quantidade de multiplos de " +num+ " e de: "+cont);
    }
}
