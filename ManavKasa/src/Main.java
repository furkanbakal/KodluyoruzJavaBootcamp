import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Manav kasa program�
		
		Scanner input=new Scanner(System.in);
		System.out.print("Armut Ka� Kilo?: ");
		int armutKg=input.nextInt();
		System.out.print("Elma Ka� Kilo?: ");
		int elmaKg=input.nextInt();
		System.out.print("Domates Ka� Kilo? ");
		int domatesKg=input.nextInt();
		System.out.print("Muz Ka� Kilo? ");
		int muzKg=input.nextInt();
		System.out.print("Patl�can Ka� Kilo? ");
		int patlicanKg=input.nextInt();
		
		double topTutar=(2.14*armutKg)+(3.67*elmaKg)+(1.11*domatesKg)+(0.95*muzKg)+(5.00*patlicanKg);
		
		System.out.println("Toplam tutar: "+topTutar);


	}

}
