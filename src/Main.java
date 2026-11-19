import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
     int i=1;
     int sayi;
     int poz=0;
     int neg=0;
     int tek=0;
     int cift=0;
     int toplam=0;
     float ort;
     int enbuyuk=0;
     int enkucuk=0;
     int sayitaslak;
    
  
     do { System.out.println(i+". sayiyi giriniz:"+" (Eger 0 girerseniz sayi girme islemleriniz sona erer)");
     sayi=sc.nextInt();
         if (sayi==0 && i==1) { System.out.println("!! Hata !! Hic sayi girmeden direkt 0 giremezsiniz!"); break; }
          toplam+=sayi;
           if (sayi>0) {poz++;}
           if (sayi==0 && i!=1) { System.out.println("Sayi girme islemleriniz bitmistir."); 
           break; }
           if (sayi<0) {neg++;}
           if (sayi%2==0) {cift++;}
           if (sayi%2!=0) {tek++;}
           if (i == 1) { enbuyuk = sayi; enkucuk = sayi; }
           if (sayi>enbuyuk) {enbuyuk=sayi;}
           if (sayi<enkucuk) {enkucuk=sayi;}
           i++;
           int j;
           boolean asal=true;          //OZEL SAYİ ANALİZİ - asal
            if (sayi<2) {
                asal=false;}
             else {
                for (j=2; j<sayi; j++) {
                    if (sayi%j==0) {
                        asal=false;
                        break; }
               } 
            }
            boolean mukemmel=false; // Ozel syayi analizi -mukemmel
            if (sayi>0) {
                int bolentoplami=0;
                for (int k=1; k<sayi; k++) {
                    if (sayi%k==0) {
                        bolentoplami+=k;
                    }
                }
                if (bolentoplami==sayi) {
                    mukemmel=true;
                }
            }
          sayitaslak=sayi;     
          int basamak=0;
        do {                        //Ozel sayi - basamak
            
            sayitaslak=sayitaslak/10;
            basamak++; } 
        while (sayitaslak!=0); 

         System.out.println("Ozel Sayi analizi:");
         if (mukemmel) {System.out.println("Girdiginiz sayi mukemmel sayidir.");}
         if (mukemmel==false) {System.out.println("Girdiginiz sayi mukemmel sayi degildir.");}   
         if (asal) {System.out.println("Girdiginiz sayi asal sayidir.");}
         if (asal==false) {System.out.println("Girdiginiz sayi asal sayi degildir.");}
         System.out.println("Girdiginiz sayi "+basamak+" basamakli sayidir");
         
           
     
     } while(sayi!=0);
   
     ort=toplam/(i-1);
        System.out.println("-> SAYI ANALIZI <-");
        System.out.println("Girdiginiz sayilardan "+poz+" tanesi pozitiftir.");
        System.out.println("Girdiginiz sayilardan "+neg+ " tanesi negatiftir.");
        System.out.println("Girdiginiz sayilardan "+tek+ " tanesi tektir.");
        System.out.println("Girdiginiz sayilardan "+cift+ " tanesi cifttir.");
        System.out.println("Girdiginiz sayilardan en kucuk sayi "+enkucuk);
        System.out.println("Girdiginiz sayilardan en buyuk sayi "+enbuyuk);
        System.out.println("Girdiginiz sayilarin toplami:"+toplam);
        System.out.println("Girdiginiz sayilarin ortalamasi:"+ort);
        

        scanner.close();
    }
}
