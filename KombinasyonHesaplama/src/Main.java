import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen deðerlere göre kombinasyon hesaplayan program
		
		int fakto1=1,fakto2=1,fakto3=1;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Kombinasyon hesabý => C(n,r) ");
		
		System.out.print("n deðerini giriniz: ");
		int nDeger=input.nextInt();
		
		System.out.print("r deðerini giriniz: ");
		int rDeger=input.nextInt();
		
		for (int i = 1; i <= nDeger; i++) {
			fakto1=fakto1*i;
		}
		 int nFakto=fakto1;
		 
		for (int i = 1; i <= rDeger; i++) {
			fakto2=fakto2*i;
		} 
			int rFakto=fakto2;
			
		int formul3=nDeger-rDeger;
		
		for (int i = 1; i <=formul3; i++) {
			fakto3=fakto3*i;
		}
		int araDeger=fakto3;
		
		int kombinasyon=nFakto/(rFakto*araDeger);
		
		System.out.println("Kombinasyon sonucu: "+kombinasyon);
		
	}

	
	
}
