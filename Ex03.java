import java.util.Scanner;

// import java.util.*;

public class Ex03 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Em que ano estamos?");
            int anoatual = sc.nextInt();

            System.out.println("Em que ano você nasceu?");
            int anonascimento = sc.nextInt();

            int idade = anoatual-anonascimento;

            System.out.println("Você tem "+idade+" anos");
        }
    }
}