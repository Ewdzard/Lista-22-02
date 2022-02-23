import java.util.*;

public class Ex02 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite um numero: ");  
            int pnumero= sc.nextInt();
            System.out.print("Digite outro numero: ");
            int snumero = sc.nextInt();
            System.out.print("Digite mais um numero: ");
            int tnumero = sc.nextInt();

            int somanum = pnumero+snumero+tnumero ;


        System.out.println("A soma dos numeros é "+somanum) ;

    }
}}