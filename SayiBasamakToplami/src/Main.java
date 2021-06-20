import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen sayýnýn basamaklarý toplaný veren program
		
		 Scanner reader = new Scanner(System.in);
	        
	        System.out.print("Bir Sayý Girin: ");
	 
	       
	        int num = reader.nextInt();
	 
	        int adet = 0,toplam=0;
	 
	        while(num != 0)
	        {
	           toplam=(num%10)+toplam;
	           num /= 10;
	            ++adet;
	        }
	 
	        System.out.println("Basamak Toplamý: " + toplam);

	}

}
