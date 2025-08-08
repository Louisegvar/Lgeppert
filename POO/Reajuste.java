package com.mycompany.reajuste;

import java.util.Scanner;

public class Reajuste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double salario, reaj, novos;
        System.out.print("Digite o salario do funcionario: ");
        salario = teclado.nextDouble();
        reaj = salario * 0.07;
        novos = salario + reaj;
        System.out.print("O novo salario reajustado e de: "+novos);
        
    }
}
