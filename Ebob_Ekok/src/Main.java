import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen sayýlarýn EBOB,EKOK hesaplamaýsýný yapan program.
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("1. sayýyý giriniz: ");
		int sayi1=input.nextInt();
		
		System.out.print("2. sayýyý giriniz: ");
		int sayi2=input.nextInt();
		int ebob=1;
		
		int i=1;
		while(i<=sayi1) {
			if(sayi1%i==0 && sayi2%i==0) {
				ebob=i;
				i++;
			}
		}
		System.out.println("EBOB: "+ebob);
		
		int j=1;
		while(j<=sayi1*sayi2) {
			if(j%sayi1==0 && j%sayi2==0) {
				System.out.println(i);
				j++;
				break;
			}
		}
			
		}
	}


