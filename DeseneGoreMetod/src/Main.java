import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Bir sayý girin: ");
		int sayi=input.nextInt();
		int temp = sayi;
		
		while(!(sayi<=0)) {
			System.out.print(sayi+" ");
			sayi-=5;			
		}
		
		for (int i = sayi; i <=temp; i+=5) {
			System.out.print(i+" ");
		}
	}

}
