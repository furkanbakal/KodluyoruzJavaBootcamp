import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ��gen alan�n� ve dik ��gen hipoten�s bulan program
		
		
		//Hipoten�s bulma
		int kenar1,kenar2;
		double hipotenus;
		
		Scanner input=new Scanner(System.in);
		System.out.print("1. kenar� giriniz: ");
		kenar1=input.nextInt();
		System.out.print("2. kenar� giriniz: ");
		kenar2=input.nextInt();
		
		hipotenus=Math.sqrt((Math.pow(kenar1, 2))+Math.pow(kenar2, 2));
		System.out.println("Hipoten�s: "+hipotenus);
		
		
		//��gen alan� bulma
		
		System.out.print("1. kenar� giriniz: ");
		int ucgen1=input.nextInt();
		System.out.print("2. kenar� giriniz: ");
		int ucgen2=input.nextInt();
		System.out.print("3. kenar� giriniz: ");
		int ucgen3=input.nextInt();
		
		int cevre,alan,araDeger;
		araDeger=((ucgen1+ucgen2+ucgen3)/2);
		cevre=2*araDeger;
		
		alan=(int) (Math.sqrt(araDeger*(araDeger-ucgen1)*
				(araDeger-ucgen2)*(araDeger-ucgen3)));
		
		System.out.println("��genin �evresi: "+cevre);
		System.out.println("��genin alan�: "+alan);
	}

}
