import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Girilen deðerlerin üssünü alan program
		
		int sonuc=1;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Üssü alýnacak sayýyý girin: ");
		int sayi=input.nextInt();
		System.out.print("Üssü girin: ");
		int us=input.nextInt();
		
		for (int i = 1; i <= us; i++) {
			sonuc*=sayi;
		}
		System.out.println("Sonuç: "+sonuc);
	}

}
