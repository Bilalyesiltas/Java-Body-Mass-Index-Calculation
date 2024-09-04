
package bedenkitleındeksikosulludurumlar;

import java.util.Scanner;


public class BedenKitleIndeksiKosulluDurumlar {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuz: ");
        
        int kilo = scanner.nextInt();
        
        System.out.println("Boy");
        
        double boy = scanner.nextDouble();
        
        double bki = (kilo/(boy * boy));
        
        if (bki <18.){
            System.out.println("Zayıfsın");
        }
        
        else if (bki >= 18.5 && bki< 25){
            System.out.println("Normal");
        }
        else if (bki >= 25 && bki < 30){
            System.out.println("Fazla Kilolu");
        }
        
        else{
            System.out.println("OBEZSİN...");
        }
         
    }
    
}
