import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen y�l�n art�k y�l olup olmad���n� hesaplayan program
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Y�l giriniz: ");
		int yil=input.nextInt();
		
		if(yil%4==0) {
			System.out.println(yil+" art�k y�ld�r");
		}
		else {
			System.out.println(yil+" art�k y�l de�ildir");
		}
	}

}
