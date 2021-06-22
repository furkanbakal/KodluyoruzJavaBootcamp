import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen n tane sayýdan en küçüðü ve en büyüðü bulma
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Kaç tane sayý gireceksiniz: ");
		int adet=input.nextInt();
		
		System.out.print("1. sayýyý giriniz: ");
		int enKucuk=input.nextInt();
		
		System.out.print("2. sayýyý giriniz: ");
		int enBuyuk=input.nextInt();
		for (int i = 3; i <= adet; i++) {
			System.out.print(i+ ". sayýyý giriniz: ");
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
		System.out.println("En büyük sayý: "+enBuyuk);
		System.out.println("En küçük sayý: "+enKucuk);
	}

}
