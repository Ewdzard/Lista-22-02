import java.util.*;

public class abacaxi {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome:");
        String nome = scan.nextLine();

        System.out.print("Peso:");
        int peso = scan.nextInt();

        System.out.print("Altura:");
        double altura = scan.nextDouble();

        double imc = peso / (altura*altura);

        System.out.println("IMC de" + nome + ":" + imc);





    }
}