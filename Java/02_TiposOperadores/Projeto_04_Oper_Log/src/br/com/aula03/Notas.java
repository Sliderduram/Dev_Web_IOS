package br.com.aula03;

import java.util.Scanner;

public class Notas {
    public static void main(String args[]){
        // Instanciar o objeto Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis e ler as informações do teclado
        String jogador;
        double pontos ;

        // Ler a informação digitada pelo usuario
        System.out.println("Digite o nome do jogador:");
        jogador = input.nextLine();

        //Ler os pontos digitados pelo usuario
        System.out.println("Digite o valor de pontos do jogador");
        pontos = input.nextDouble();

        // Fazer a condicional para verificar a quantidade de pontos
        if(pontos>=1000){
            System.out.println("Parabens voce passou de fase!");
        }

        // Fechar o teclado
        input.close();
    }
}
