import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*0 dan girilen sayýya kadar sayýlarýn 3 ve 4 ile bölünebilenlerinin toplamýnýn 
		ortalamasýný bulan program */
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Sayýyý giriniz: ");
		int sayi=input.nextInt();
		
		int i = 1, toplam=0, sayac=0;
		
		while(i<sayi) {
			if(i%3==0 && i%4==0) {
				toplam+=i;
				sayac++;
			}
			i++;
		}
		int ortalama=toplam/sayac;
		System.out.println("Bulunan sayýlarýn ortalamasý: "+ortalama);
	}
}
