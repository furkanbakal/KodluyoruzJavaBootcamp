import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// KDV tutarý hesaplayan program
		
		double tutar, kdvOran=0.18;
		Scanner input=new Scanner(System.in);
		System.out.println("Ücret turatýný giriniz: ");
		tutar=input.nextDouble();
		
		if(tutar>1000) 
		{
			kdvOran=0.08;
			
			double kdvTutar=tutar*kdvOran;
			double kdvliTutar=tutar+kdvTutar;	
			System.out.println("KDV' siz tutar: "+tutar);
			System.out.println("KDV oraný: "+kdvOran);
			System.out.println("KDV tutarý: "+kdvTutar);
			System.out.println("KDV' li tutar: " +kdvliTutar);
		}
		
		else 
		{
			double kdvTutar=tutar*kdvOran;
			double kdvliTutar=tutar+kdvTutar;	
			System.out.println("KDV' siz tutar: "+tutar);
			System.out.println("KDV oraný: "+kdvOran);
			System.out.println("KDV tutarý: "+kdvTutar);
			System.out.println("KDV' li tutar: " +kdvliTutar);
			
		}
		
		

	}

}
