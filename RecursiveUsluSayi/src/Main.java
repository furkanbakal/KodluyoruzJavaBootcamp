import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.print("Sayýyý giriniz: ");
		int sayi=input.nextInt();
		
		System.out.print("Üs giriniz: ");
		int us=input.nextInt();
		
		usAlma(sayi,us);
		
		}
	static int usAlma(int sayi, int us) {
		 if (us == 0) {
	            return 1;
	        }
	        if (us == 1) {
	            return sayi;
	        } else {
	            return sayi * usAlma(sayi, us - 1);
	        }
	}

}
