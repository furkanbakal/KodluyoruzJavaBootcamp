import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Girilen de�erlerin �ss�n� alan program
		
		int sonuc=1;
		
		Scanner input=new Scanner(System.in);
		System.out.print("�ss� al�nacak say�y� girin: ");
		int sayi=input.nextInt();
		System.out.print("�ss� girin: ");
		int us=input.nextInt();
		
		for (int i = 1; i <= us; i++) {
			sonuc*=sayi;
		}
		System.out.println("Sonu�: "+sonuc);
	}

}
