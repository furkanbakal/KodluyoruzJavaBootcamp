import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Hava durumuna g�re etkinlik �neren program
		
		Scanner input=new Scanner(System.in);
		System.out.println("Hava s�cakl���n� giriniz!");
		int sicaklik=input.nextInt();
		
		if(sicaklik<5) {
			System.out.println("Kayak yap�n");
		}
		else if(sicaklik>=5 && sicaklik<15) {
			System.out.println("Sinemaya gidin");
		}
		else if(sicaklik>=15 && sicaklik<25) {
			System.out.println("Pikni�e gidin");
		}
		else {
			System.out.println("Y�zmeye gidin");
		}
	}

}
