import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Gidilen km ye göre taksimetre ücreti hesaplayan program.
		
		int km;
		double perKm=2.20, total, startPrice=10;
		
		Scanner giris=new Scanner(System.in);
		System.out.println("Mesafeyi km cinsinden giriniz: ");
		km=giris.nextInt();
		
		total=(km*perKm);
		total+=startPrice;
		
		total=(total<20) ? 20 : total;
		System.out.println("Toplam tutar: " +total);

	}

}
