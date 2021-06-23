import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// Girilen sayýnýn palindrom olup olmadýðýný bulan program
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Sayýyý giriniz: ");
		int sayi=input.nextInt();
		System.out.println(isPalindrom(sayi));
	}
	
	
	static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;
        
        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

}
