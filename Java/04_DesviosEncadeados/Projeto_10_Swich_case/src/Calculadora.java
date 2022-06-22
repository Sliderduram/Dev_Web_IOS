import java.util.Scanner; // Import necess�rio para utilizar a classe Scanner

public class Calculadora {
    public static void main(String[] args) {

        System.out.println("======= Calculadora ========");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um n�mero:");
        double num1 = entrada.nextDouble(); // L� a op��o digitada
        System.out.println("Digite outro n�mero:");
        double num2 = entrada.nextDouble(); // L� a op��o digitada
        System.out.println("======= Opera��o Matem�tica ========");
        System.out.println(" + Adicionar os n�meros ");
        System.out.println(" - Subtrair os n�meros ");
        System.out.println(" * multiplicar os n�meros ");
        System.out.println("======== Escolha uma opcao =========");
        String oper = entrada.next(); // L� a op��o digitada

        switch (oper) {
            case "+":
                double soma = num1 + num2;
                System.out.println("Voce escolheu adi��o");
                System.out.println("O n�mero " + num1 + " + " + num2 + " = " + soma);
                break;
            case "-":
                double sub = num1 - num2;
                System.out.println("Voce escolheu subtra��o");
                System.out.println("O n�mero " + num1 + " - " + num2 + " = " + sub);
                break;
            case "*":
                double mult = num1 * num2;
                System.out.println("Voce escolheu subtra��o");
                System.out.println("O n�mero " + num1 + " * " + num2 + " = " + mult);
                break;
            default:
                System.out.println("Opera��o n�o dispon�vel ou inv�lida!");
        }
        entrada.close();
    } // fim do m�todo main
}  // fim da classe Calculadora
