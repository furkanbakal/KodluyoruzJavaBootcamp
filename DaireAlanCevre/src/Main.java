import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Daire alan ve çevresini hesaplayan program
		
		int r;
		double pi=3.14;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Dairenin yarýçapýný giriniz...");
		r=input.nextInt();
		double alan=pi*r*r;
		double cevre=2*pi*r;
		
		System.out.print("Dairenin alaný: "+alan);
		System.out.print("Dairenin çevresi: "+cevre);
		
	}

}
