import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// V�cut kitle indeksi hesaplayan program
		
		Scanner input=new Scanner(System.in);
		System.out.print("L�tfen boyunuzu metre cinsinde giriniz: ");
		double boy=input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz: ");
		int kilo=input.nextInt();
		
		double kitleIndeks=kilo/boy*boy;
		System.out.println("V�cut kitle indeksiniz: "+kitleIndeks);
	}

}
