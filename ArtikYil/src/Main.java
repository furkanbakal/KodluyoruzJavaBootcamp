import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen yýlýn artýk yýl olup olmadýðýný hesaplayan program
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Yýl giriniz: ");
		int yil=input.nextInt();
		
		if(yil%4==0) {
			System.out.println(yil+" artýk yýldýr");
		}
		else {
			System.out.println(yil+" artýk yýl deðildir");
		}
	}

}
