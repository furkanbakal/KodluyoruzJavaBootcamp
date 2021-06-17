import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 6 dersin notlarýný kullanýcýdan alýp ortalamasýný ekrana basan program.
		Scanner input=new Scanner(System.in);
		System.out.print("Kimya notunuzu giriniz: ");
		int kimyaNotu=input.nextInt();
		System.out.print("Matematik notunuzu giriniz: ");
		int matNotu=input.nextInt();
		System.out.print("fizik notunuzu giriniz: ");
		int fizikNotu=input.nextInt();
		System.out.print("Türkçe notunuzu giriniz: ");
		int turkceNotu=input.nextInt();
		System.out.print("Tarih notunuzu giriniz: ");
		int tarihNotu=input.nextInt();
		System.out.print("Müzik notunuzu giriniz: ");
		int muzikNotu=input.nextInt();
		
		int toplam=(kimyaNotu+matNotu+fizikNotu+turkceNotu+tarihNotu+muzikNotu);
		
		int ortalama=toplam/6;
		
		System.out.println("Ortalama not: "+ortalama);
	}

}
