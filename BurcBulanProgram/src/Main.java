import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen g�nlere g�re bur�lar� bulan program (ilk 6 ay yaz�ld�)...
		
		int month,day;
		Scanner input=new Scanner(System.in);
		System.out.print("Do�du�unuz ay: ");
		month=input.nextInt();
		
		System.out.print("Do�du�unuz g�n: ");
		day=input.nextInt();
		
		if(day>=1 && day<=31) {
			if(month==1) {
				if(day<22) {
					System.out.println("O�lak burcu");
				}
				else {
					System.out.println("Kova burcu");
				}
			}
			
			else if(month==2) {
				if(day>=1 && day<=28) {		
					if(day<22) {
					System.out.println("Kova burcu");
				}
				else {
					System.out.println("Bal�k burcu");
				}
			}
		}
			
			else if(month==3) {
				if(day<21) {
					System.out.println("Bal�k burcu");
				}
				else {
					System.out.println("Ko� burcu");
				}
			}
			
			else if(month==4) {
				if(day<21) {
					System.out.println("Ko� burcu");
				}
				else {
					System.out.println("Bo�a burcu");
				}
			}
			
			else if(month==5) {
				if(day<22) {
					System.out.println("Bo�a burcu");
				}
				else {
					System.out.println("�kizler burcu");
				}
			}
			
			else if(month==6) {
				if(day<23) {
					System.out.println("�kizler burcu");
				}
				else {
					System.out.println("Yenge� burcu");
				}
			}
			
			else{
				System.out.println("Ge�ersiz bir ay girdiniz..");
			}
			
		}
		else {
			System.out.println("Ge�ersiz bir g�n girdiniz.");
		}
		

	}

}
