import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Üçgen alanýný ve dik üçgen hipotenüs bulan program
		
		
		//Hipotenüs bulma
		int kenar1,kenar2;
		double hipotenus;
		
		Scanner input=new Scanner(System.in);
		System.out.print("1. kenarý giriniz: ");
		kenar1=input.nextInt();
		System.out.print("2. kenarý giriniz: ");
		kenar2=input.nextInt();
		
		hipotenus=Math.sqrt((Math.pow(kenar1, 2))+Math.pow(kenar2, 2));
		System.out.println("Hipotenüs: "+hipotenus);
		
		
		//Üçgen alaný bulma
		
		System.out.print("1. kenarý giriniz: ");
		int ucgen1=input.nextInt();
		System.out.print("2. kenarý giriniz: ");
		int ucgen2=input.nextInt();
		System.out.print("3. kenarý giriniz: ");
		int ucgen3=input.nextInt();
		
		int cevre,alan,araDeger;
		araDeger=((ucgen1+ucgen2+ucgen3)/2);
		cevre=2*araDeger;
		
		alan=(int) (Math.sqrt(araDeger*(araDeger-ucgen1)*
				(araDeger-ucgen2)*(araDeger-ucgen3)));
		
		System.out.println("Üçgenin çevresi: "+cevre);
		System.out.println("Üçgenin alaný: "+alan);
	}

}
