import java.util.Random;

public class Selecao {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(5);
        String[] alunos = {"Eric","Jheniffer","Luiz","Bruno","Hercules"};

        System.out.println("O escolhido(a) foi: " + alunos[num]);

    }
}
