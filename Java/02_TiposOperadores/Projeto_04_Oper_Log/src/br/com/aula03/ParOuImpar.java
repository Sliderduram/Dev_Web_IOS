package br.com.aula03;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String args[]){
        // Intaciar o objeto Scanner
        Scanner teclado = new Scanner(System.in);

        // Criou a variavel e adicionou o valor que foi digitado pelo usuario
        System.out.println("- Digite um número : ");
        int numero = teclado.nextInt();

        // Logica para identificar se o numero digitado é impar ou par
        if ((numero % 2) != 0) {
            System.out.println("- Seu número é Impar!");
        }
        else {
            System.out.println("- Seu número é Par!");
        }

        teclado.close();
    }
}
