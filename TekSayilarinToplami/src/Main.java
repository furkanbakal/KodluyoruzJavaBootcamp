import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden
		   ve girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p
		    ekrana basan program�
		 */
		
		Scanner input=new Scanner(System.in);
		
		int toplam=0;
		
		while(true) {
			System.out.print("Say�y� giriniz: ");
			int sayi=input.nextInt();
			
			if(sayi%2==0) {
				if(sayi%4==0) {
					toplam=toplam+sayi;
				}
			}
			else {
				System.out.println("Girilen say�lar�n toplam�: "+toplam);
				System.out.println("Tek say� gidiniz.Program kapan�yor...");
				System.exit(0);
			}
		}

	}

}
