import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen n tane say�dan en k����� ve en b�y��� bulma
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Ka� tane say� gireceksiniz: ");
		int adet=input.nextInt();
		
		System.out.print("1. say�y� giriniz: ");
		int enKucuk=input.nextInt();
		
		System.out.print("2. say�y� giriniz: ");
		int enBuyuk=input.nextInt();
		for (int i = 3; i <= adet; i++) {
			System.out.print(i+ ". say�y� giriniz: ");
			int sayi=input.nextInt();
			
			if(sayi<enKucuk) {
				enKucuk=sayi;
			}
			else if(sayi==enKucuk){
				continue;
			}
			else {
				enBuyuk=sayi;
			}
		}
		System.out.println("En b�y�k say�: "+enBuyuk);
		System.out.println("En k���k say�: "+enKucuk);
	}

}
