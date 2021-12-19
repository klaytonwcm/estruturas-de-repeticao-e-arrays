package com.dio.estrutura;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        boolean EntradaValida = false;
        String usuario;
        String senha;

        do {
            System.out.print("Usuario: ");
            usuario = scan.next();

            System.out.print("Senha: ");
            senha = scan.next();

            if (senha.equalsIgnoreCase(usuario)) {
                System.out.println("Senha Inválida tente novamente.");
            } else {
                EntradaValida = true;
                System.out.println("Logado com sucesso, " + usuario);
            }
        } while(!EntradaValida);

    }
}