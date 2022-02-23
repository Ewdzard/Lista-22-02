

public class Ex07 {
    
    public static void main(String[] args) {

        System.out.println("Valor total a ser distribuido: R$ 780.000,00");

        double ptotal = 780.000;

        double pvenc = (780.000)*0.46;
        System.out.println("Premio dedicado ao primeiro vencedor: "+pvenc+" mil");
        ptotal = ptotal-pvenc;
        double svenc = 780.000*0.32;
        System.out.println("Premio dedicado ao segundo vencedor: "+svenc+" mil");
        ptotal = ptotal-svenc;
        System.out.println("Premio dedicado ao terceiro vencedor: "+ptotal+" mil");
        
    }
}