

package com.mycompany.somadeinteiro;

import java.util.Scanner;


public class SomaInteiro {

    
    public static void main(String[] args) {
        int i, n;
        int soma = 0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um número inteiro: ");
        n = ler.nextInt();
        for ( i = 0; i < n; i++) {
            soma += i;  
        }
        System.out.printf("Soma =  " + soma);
        
    }
    
}



