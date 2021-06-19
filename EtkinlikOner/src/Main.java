import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Hava durumuna göre etkinlik öneren program
		
		Scanner input=new Scanner(System.in);
		System.out.println("Hava sýcaklýðýný giriniz!");
		int sicaklik=input.nextInt();
		
		if(sicaklik<5) {
			System.out.println("Kayak yapýn");
		}
		else if(sicaklik>=5 && sicaklik<15) {
			System.out.println("Sinemaya gidin");
		}
		else if(sicaklik>=15 && sicaklik<25) {
			System.out.println("Pikniðe gidin");
		}
		else {
			System.out.println("Yüzmeye gidin");
		}
	}

}
