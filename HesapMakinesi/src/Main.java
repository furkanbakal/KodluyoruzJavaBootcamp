import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Switch case ifadesi ile basit hesap makinesi
		int sayi1,sayi2,sonuc;
		String select;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Ýlk sayýyý giriniz: ");
		sayi1=input.nextInt();
		System.out.println("Ýkinci sayýyý giriniz: ");
		sayi2=input.nextInt();
		
		System.out.println(" '+' Toplama/'-' Çýkarma/'*' Çarpma/'/' Bölme");
		System.out.println("Seçiminiz: " );
		select=input.next();
		
		switch(select) {
		case "+":
			 sonuc=sayi1+sayi2;
			 System.out.println("Ýþlem Sonucu: "+sonuc);
			break;
		case "-":
			 sonuc=sayi1-sayi2;
			 System.out.println("Ýþlem Sonucu: "+sonuc);
			 break;
		case "*":
			 sonuc=sayi1*sayi2;
			 System.out.println("Ýþlem Sonucu: "+sonuc);
			 break;
		case "/":
			 sonuc=sayi1/sayi2;
			 System.out.println("Ýþlem Sonucu: "+sonuc);
			 break;
			 }
		
	}
}
