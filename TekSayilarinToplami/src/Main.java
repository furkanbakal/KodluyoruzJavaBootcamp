import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden
		   ve girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp
		    ekrana basan programý
		 */
		
		Scanner input=new Scanner(System.in);
		
		int toplam=0;
		
		while(true) {
			System.out.print("Sayýyý giriniz: ");
			int sayi=input.nextInt();
			
			if(sayi%2==0) {
				if(sayi%4==0) {
					toplam=toplam+sayi;
				}
			}
			else {
				System.out.println("Girilen sayýlarýn toplamý: "+toplam);
				System.out.println("Tek sayý gidiniz.Program kapanýyor...");
				System.exit(0);
			}
		}

	}

}
