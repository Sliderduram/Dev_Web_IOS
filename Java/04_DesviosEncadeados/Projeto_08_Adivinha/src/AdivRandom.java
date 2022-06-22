import java.util.Scanner; // Import necess�rio para utilizar a classe Scanner
import java.util.Random; // Import necess�rio para utilizar a classe Random

public class AdivRandom {
    public static void main(String[] args) {
        // Int�ncia (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        // Int�ncia utilizando a classe Random
        Random rand = new Random();
        int palpite, num = 0;
        num = rand.nextInt(10) + 1;
        System.out.println("Digite seu palpite:");
        palpite = entrada.nextInt();
        if (palpite == num) {
            System.out.println("Voc� acertou!!! O n�mero era " + num);
        } else {
            if (palpite < num) {
                System.out.println("Seu palpite est� abaixo!!! O n�mero era " + num);
            } else {
                System.out.println("Seu palpite est� acima. O n�mero era " + num);
            }
        }
        entrada.close();
    } // fim do m�todo main
}  // fim da classe AdivRandom
