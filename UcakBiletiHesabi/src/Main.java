import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Mesafeye göre uçak bileti hesabı yapan program
		
		double tutar,ucret;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Lütfen mesafe bilgisi giriniz (km): ");
		int mesafe=input.nextInt();
		
		System.out.print("Yaşınızı giriniz: ");
		int yas=input.nextInt();
		
		System.out.print("Yolculuk tipinizi giriniz (gidis-dönüs icin->1/tek yön icin->2): ");
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
			System.out.println("Geçersiz değer yada değerler girdiniz!");
		}
		
	}

}
