import java.util.Scanner;

public class ExemploString {
    public static void main(String[] args) {

        String[] nomes = new String[5];

        Scanner entrada = new Scanner(System.in);

        // loop para leitura de 5 nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(" Digite o nome " + (i + 1));
            nomes[i] = entrada.next();
        }

        // loop para imprimir os 5 nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(" nome : " + (i + 1) + " = " + nomes[i]);
        }

        entrada.close();
    }
}