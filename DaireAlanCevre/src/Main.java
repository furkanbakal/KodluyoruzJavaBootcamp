import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Daire alan ve �evresini hesaplayan program
		
		int r;
		double pi=3.14;
	
		Scanner input=new Scanner(System.in);
		
		System.out.print("Dairenin yar��ap�n� giriniz...");
		r=input.nextInt();
		System.out.print("Daire diliminin a��s�n� giriniz: ");
		int aci=input.nextInt();
		double alan=pi*r*r;
		double cevre=2*pi*r;
		double daireDilimAlani=(pi*(r*r)*aci)/360;
		
		System.out.print("Dairenin alan�: "+alan);
		System.out.print("Dairenin �evresi: "+cevre);
		System.out.println("Daire diliminin alan�:"+daireDilimAlani);
		
	}

}
