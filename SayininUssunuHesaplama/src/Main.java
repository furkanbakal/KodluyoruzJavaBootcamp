import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana yazd�ran program�

		Scanner input=new Scanner(System.in);
		
		int sayi, i=1;
		
		System.out.println("S�n�r say�s�n� giriniz: ");
		sayi=input.nextInt();
		
		while(i<sayi) {
			System.out.print(i+" 'nin 4 kuvveti: "+(int)Math.pow(i, 4)+ " ==== ");
			System.out.print(i+" 'nin 5 kuvveti: "+(int)Math.pow(i, 5));
			System.out.println();
			
			
			i++;
		}
	}
	}


