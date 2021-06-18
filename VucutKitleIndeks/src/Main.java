import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Vücut kitle indeksi hesaplayan program
		
		Scanner input=new Scanner(System.in);
		System.out.print("Lütfen boyunuzu metre cinsinde giriniz: ");
		double boy=input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz: ");
		int kilo=input.nextInt();
		
		double kitleIndeks=kilo/boy*boy;
		System.out.println("Vücut kitle indeksiniz: "+kitleIndeks);
	}

}
