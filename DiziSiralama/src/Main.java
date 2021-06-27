import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int gecici;
	    int adet;
	    System.out.print("Kac adet sayi girilecek: "); adet=sc.nextInt();
	   int [] dizi = new int[10];
	   
	   for(int i = 0; i < adet; i++)
	   {
	       System.out.print("Dizinin " + (i+1) + ". elemanýný giriniz: ");
	       dizi[i] = sc.nextInt();
	   }
	   System.out.println("Dizinin kucukten buyuge dogru sýralanmýs hali:\n");
	   for(int i = 0; i < adet-1; i++)
	   {
	       for(int j = i+1; j < adet; j++)
	       {
	           if(dizi[j] < dizi[i]) {
	               gecici = dizi[i];
	               dizi[i] = dizi[j];
	               dizi[j] = gecici;
	           }
	       }
	   }
	   for(int i = 0; i < adet; i++)
	   {
	       System.out.print("-" + dizi[i]);
	   }
	}
	
}

