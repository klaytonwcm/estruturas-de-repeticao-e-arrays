package com.dio.estrutura;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Invalida! Digite nova");
            nota = scan.nextInt();
            }
           }
        }

