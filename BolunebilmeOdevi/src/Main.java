import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*0 dan girilen sayıya kadar sayıların 3 ve 4 ile bölünebilenlerinin toplamının 
		ortalamasını bulan program */
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Sayıyı giriniz: ");
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
		System.out.println("Bulunan sayıların ortalaması: "+ortalama);
	}
}
