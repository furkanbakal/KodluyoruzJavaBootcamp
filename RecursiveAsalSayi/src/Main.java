import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        int num, prime;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Pozitif bir sayi giriniz : ");
	        num = scanner.nextInt();

	        prime = asl(num, num / 2);

	        if (prime == 1) {
	            System.out.println(num + " sayisi asaldir !");
	        } else {
	            System.out.println(num + " sayisi asal deðildir !");
	        }
	    }

	    private static int asl(int num, int i) {
	        if (i == 1) {
	            return 1;
	        } else {
	            if (num % i == 0) {
	                return 0;
	            } else {
	                return asl(num, i - 1);
	            }
	        }
	    }

}
