import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Sýnýfta kalma yada geçme durumu hesaplayan program
		
		int matNot,fizNot,turkNot,kimNot,muzNot;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		matNot=input.nextInt();
		
		
		System.out.print("Türkçe notunuz: ");
		turkNot=input.nextInt();
		
		
		System.out.print("Fizik notunuz: ");
		fizNot=input.nextInt();
		
		
		System.out.print("Kimya notunuz: ");
		kimNot=input.nextInt();
		
		
		
		System.out.print("Müzik notunuz: ");
		muzNot=input.nextInt();
		
		double average;
		
		if(matNot<0 && matNot>100) {
			average=(muzNot+kimNot+fizNot+turkNot)/4;
		}
		else if(turkNot<0 && turkNot>100) {
			average=(muzNot+kimNot+fizNot+matNot)/4;
		}
		else if(fizNot<0 && fizNot>100) {
			average=(muzNot+kimNot+turkNot+matNot)/4;
		}
		else if(kimNot<0 && kimNot>100) {
			average=(muzNot+fizNot+turkNot+matNot)/4;
		}
		else if(muzNot<0 && muzNot>100) {
			average=(fizNot+kimNot+turkNot+matNot)/4;
		}
		else {
			average=(fizNot+kimNot+turkNot+matNot+muzNot)/5;
		}
		
		
		if(average<55) {
			System.out.println("Sýnýfta kaldýnýz.Ortlamanýz: "+average);
		}
		else
			System.out.println("Sýnýfý geçtiniz.Ortalamanýz: "+average);
	}

}
