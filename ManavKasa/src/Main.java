import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Manav kasa programý
		
		Scanner input=new Scanner(System.in);
		System.out.print("Armut Kaç Kilo?: ");
		int armutKg=input.nextInt();
		System.out.print("Elma Kaç Kilo?: ");
		int elmaKg=input.nextInt();
		System.out.print("Domates Kaç Kilo? ");
		int domatesKg=input.nextInt();
		System.out.print("Muz Kaç Kilo? ");
		int muzKg=input.nextInt();
		System.out.print("Patlýcan Kaç Kilo? ");
		int patlicanKg=input.nextInt();
		
		double topTutar=(2.14*armutKg)+(3.67*elmaKg)+(1.11*domatesKg)+(0.95*muzKg)+(5.00*patlicanKg);
		
		System.out.println("Toplam tutar: "+topTutar);


	}

}
