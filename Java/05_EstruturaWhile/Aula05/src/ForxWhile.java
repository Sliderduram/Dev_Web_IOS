public class ForxWhile {
    public  static void main(String[] args){
        //Loop no For

        for(int i = 0; i < 5; i++){
            System.out.println("O valor do contador �:" + i);
        }

        System.out.println("**********");
        System.out.println("Com While");
        //Loop no While
        int contador = 0;
        while (contador < 5){
            System.out.println("O valor do contador �:" + contador);
            contador++;
        }

    }
}
