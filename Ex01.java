import java.util.*;  

public class Ex01 {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");  
        int numero= sc.nextInt();

        int numeromais = numero+1;
        int numeromenos = numero-1;
        System.out.println("O antecessor do seu numero é "+numeromenos);
        System.out.println("O sucessor do seu numero é"+ numeromais);
    }
    }
