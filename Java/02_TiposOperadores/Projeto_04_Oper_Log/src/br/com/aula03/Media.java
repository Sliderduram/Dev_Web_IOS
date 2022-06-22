package br.com.aula03;

import java.util.Scanner;

public class Media {
    public static void main(String args[]){
        //Cria Scanner e instanciar o objeto
        Scanner teclado = new Scanner(System.in);

        // Declar as variaveis
        String aluno;
        System.out.println("Digite o nome do aluno");
        aluno = teclado.nextLine();

        //Declar variaveis para receber os valores
        double nota1, media;

        System.out.println("Digite duas notas");
        nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();

        // Fazer a media do aluno
        media = (nota1 + nota2) / 2;

        // Mostrar as informações para o usuario
        System.out.println(aluno + " Sua media e: " + media);

        //Close do teclado
        teclado.close();
    }
}
