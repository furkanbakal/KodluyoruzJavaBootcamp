import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen deðer kadar fibonacci serisi bulan program
		
			Scanner input=new Scanner(System.in);
			System.out.print("Sayýyý giriniz: ");
			int sayi=input.nextInt();
			System.out.println(fibo(sayi));

	}

	static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
