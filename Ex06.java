import java.util.*;  

public class Ex06 {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma temperatura para ser convertida (C°): ");  
        double gcs = sc.nextInt();

        double gf = gcs*(9.0/5.0)+32.0 ;

        System.out.println("A temperatura inserida é equivalente a "+gf+" graus Fahrenheit");

            
        
    }
}