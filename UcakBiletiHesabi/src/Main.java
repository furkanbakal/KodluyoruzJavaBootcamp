import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Mesafeye g�re u�ak bileti hesab� yapan program
		
		double tutar,ucret;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("L�tfen mesafe bilgisi giriniz (km): ");
		int mesafe=input.nextInt();
		
		System.out.print("Ya��n�z� giriniz: ");
		int yas=input.nextInt();
		
		System.out.print("Yolculuk tipinizi giriniz (gidis-d�n�s icin->1/tek y�n icin->2): ");
		int tip=input.nextInt();

		if(mesafe>0 && yas>=0 && (tip==1 ||tip==2)) {
			
			if(tip==1) {
				if(yas<12) {
					tutar=(mesafe*0.10)*0.50*0.20;
					System.out.println("Toplam tutar: "+tutar);
				}
				else if(yas>12 && yas<24) {
					tutar=(mesafe*0.10)*0.10*0.20;
					System.out.println("Toplam tutar: "+tutar);
				}
				else if(yas>65) {
					tutar=(mesafe*0.10)*0.30*0.20;
					System.out.println("Toplam tutar: "+tutar);
				}
				else {
					tutar=(mesafe*0.10)*0.20;
					System.out.println("Toplam tutar: "+tutar);
				}
			}
			else {
				if(yas<12) {
					tutar=(mesafe*0.10)*0.50;
					System.out.println("Toplam tutar: "+tutar);
				}
				else if(yas>12 && yas<24) {
					tutar=(mesafe*0.10)*0.10;
					System.out.println("Toplam tutar: "+tutar);
				}
				else if(yas>65) {
					tutar=(mesafe*0.10)*0.30;
					System.out.println("Toplam tutar: "+tutar);
				}
				else {
					tutar=(mesafe*0.10);
					System.out.println("Toplam tutar: "+tutar);
				}
			}
		}
		else {
			System.out.println("Ge�ersiz de�er yada de�erler girdiniz!");
		}
		
	}

}
