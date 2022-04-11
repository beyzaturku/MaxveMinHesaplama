package maxveminhesaplama;
import java.util.*;
public class MaxveMinHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?");
        int number = input.nextInt();
        
        int enBuyuk=0;
        int enKucuk=0;
        
        for(int i=1; i<=number; i++)
        {
            System.out.print(i + ". sayıyı giriniz:");
            int sayi = input.nextInt();
            
            if(enBuyuk<sayi){
                enBuyuk=sayi;
                if(enKucuk==0){
                    enKucuk=sayi;
                }
              
            }
            if(sayi<enKucuk){
                enKucuk=sayi;
                if(enBuyuk==0){
                    enBuyuk=sayi;
                }
            }
        }
        
        System.out.println("En büyük sayı:" + " " + enBuyuk);
        System.out.println("En küçük sayı:" + " " + enKucuk);
    }
    
}
