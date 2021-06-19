import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen günlere göre burçları bulan program (ilk 6 ay yazıldı)...
		
		int month,day;
		Scanner input=new Scanner(System.in);
		System.out.print("Doğduğunuz ay: ");
		month=input.nextInt();
		
		System.out.print("Doğduğunuz gün: ");
		day=input.nextInt();
		
		if(day>=1 && day<=31) {
			if(month==1) {
				if(day<22) {
					System.out.println("Oğlak burcu");
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
					System.out.println("Balık burcu");
				}
			}
		}
			
			else if(month==3) {
				if(day<21) {
					System.out.println("Balık burcu");
				}
				else {
					System.out.println("Koç burcu");
				}
			}
			
			else if(month==4) {
				if(day<21) {
					System.out.println("Koç burcu");
				}
				else {
					System.out.println("Boğa burcu");
				}
			}
			
			else if(month==5) {
				if(day<22) {
					System.out.println("Boğa burcu");
				}
				else {
					System.out.println("İkizler burcu");
				}
			}
			
			else if(month==6) {
				if(day<23) {
					System.out.println("İkizler burcu");
				}
				else {
					System.out.println("Yengeç burcu");
				}
			}
			
			else{
				System.out.println("Geçersiz bir ay girdiniz..");
			}
			
		}
		else {
			System.out.println("Geçersiz bir gün girdiniz.");
		}
		

	}

}
