import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Switch case ifadesi ile basit hesap makinesi
		int sayi1,sayi2,sonuc;
		String select;
		
		Scanner input=new Scanner(System.in);
		System.out.print("�lk say�y� giriniz: ");
		sayi1=input.nextInt();
		System.out.println("�kinci say�y� giriniz: ");
		sayi2=input.nextInt();
		
		System.out.println(" '+' Toplama/'-' ��karma/'*' �arpma/'/' B�lme");
		System.out.println("Se�iminiz: " );
		select=input.next();
		
		switch(select) {
		case "+":
			 sonuc=sayi1+sayi2;
			 System.out.println("��lem Sonucu: "+sonuc);
			break;
		case "-":
			 sonuc=sayi1-sayi2;
			 System.out.println("��lem Sonucu: "+sonuc);
			 break;
		case "*":
			 sonuc=sayi1*sayi2;
			 System.out.println("��lem Sonucu: "+sonuc);
			 break;
		case "/":
			 sonuc=sayi1/sayi2;
			 System.out.println("��lem Sonucu: "+sonuc);
			 break;
			 }
		
	}
}
