import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen deðer satýrý kadar ters üçgen çizimi yapan program
		Scanner input=new Scanner(System.in);
		
		System.out.print("Lütfen satýr sayýsýný girin: ");
		int satir=input.nextInt();
		System.out.println();
	   int	space = 1;
        for (int j = 0; j <= satir - 1; j++) 
        {
            for (int i = 0; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (int i = 1; i <= 2 * (satir - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
		
        }
	}

}
