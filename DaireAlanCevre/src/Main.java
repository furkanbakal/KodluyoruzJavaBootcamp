import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Daire alan ve �evresini hesaplayan program
		
		int r;
		double pi=3.14;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Dairenin yar��ap�n� giriniz...");
		r=input.nextInt();
		double alan=pi*r*r;
		double cevre=2*pi*r;
		
		System.out.print("Dairenin alan�: "+alan);
		System.out.print("Dairenin �evresi: "+cevre);
		
	}

}
