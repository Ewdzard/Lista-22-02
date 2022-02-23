import java.util.*;  

public class Ex05 {
    
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um valor para ser convertido (R$): ");  
            double vreal = sc.nextInt();

            //Por incrivel que pareça no momento da atividade o dólar está valendo exatamente 5 reais

            double cdolar = vreal/5;

            System.out.println("O valor inserido é equivalente a $"+cdolar);

            
        }
    }
}