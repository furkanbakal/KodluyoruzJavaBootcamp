import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Klavyeden girilen de�er aral���nda fibonacci serisi bulan program
		
		  Scanner reader = new Scanner(System.in);
	        int n1=0,n2=1,n3,i,n;
	        System.out.print("N Say�s�n� Girin:");
	        n = reader.nextInt();
	        System.out.print(n1+" "+n2);
	  
			 for(i=2;i<n;++i)
			 {  
			  n3=n1+n2;  
			  System.out.print(" "+n3);  
			  n1=n2;  
			  n2=n3;  
			    }
			 System.out.println();
	}

}
