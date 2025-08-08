package com.mycompany.soma100for;
public class Soma100For {

    public static void main(String[] args) {
        int soma =0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma = " +soma);
    }
}
