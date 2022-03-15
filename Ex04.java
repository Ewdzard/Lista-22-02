import java.util.*;  

public class Ex04 {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma velocidade para ser convertida (km/h): ");  
        int kmh = sc.nextInt();

        int mps = kmh/36;

        System.out.println("A velocidade inserida é equivalente a "+mps+"m/s");

            
        
    }
}