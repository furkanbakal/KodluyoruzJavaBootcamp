import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Girilen de�er sat�r� kadar ters ��gen �izimi yapan program
		Scanner input=new Scanner(System.in);
		
		System.out.print("L�tfen sat�r say�s�n� girin: ");
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
