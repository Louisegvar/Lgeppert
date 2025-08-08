package com.mycompany.logintentativa;

import java.util.Scanner;

public class Logintentativa {

    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";
        int tentativas =3;
        
        
        
        while (tentativas>0){
            System.out.print("Usuario: ");
            String usuario = login.nextLine();
            
             System.out.print("Senha: ");
            String senha = login.nextLine();
            
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
        System.out.println("Login bem-sucedido!");
        break;
        } else {
            tentativas--;
            System.out.println("Usuario ou senha incorretos. " + "Tentativas restantes: " + tentativas);
    }
           } 
        if (tentativas ==0) {
            System.out.println("Numero maximo de tentativas excedido." + "Acesso bloqueado.");
        }
    }
}
