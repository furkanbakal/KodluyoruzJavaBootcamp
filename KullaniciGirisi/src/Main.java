import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Kullan�c� Giri�i Uygulamas�
		
		String userName,password;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Kullan�c� ad�n�z: ");
		userName=input.nextLine();
		
		System.out.print("�ifreniz: ");
		password=input.next();
		
		if(userName.equals("furkan") && password.equals("12345")) {
			System.out.println("Giri� yapt�n�z.");
		}else {
			System.out.println("Bilgileriniz yanl��.");
		}
		
		if(!password.equals("12345")) {
			System.out.println("Yanl�� kullan�c� ad� girdiniz �ifrenizi s�f�rlamak ister misiniz?");
			System.out.print("yes/no");
			String choose=input.next();
			if(choose.equalsIgnoreCase("yes")) {
				System.out.println("Girdi�iniz �ifre eski �ifreniz ile ayn� olmamal�d�r!");
				System.out.print("Yeni �ifreniz: ");
				String newPassword=input.next();
				if(newPassword.equals("12345")) {
					System.out.println("�ifreniz eski �ifre ile ayn� olamaz!");
				}
				else if(!newPassword.equals("12345")){
					// password=newPassword;
					System.out.println("�ifreniz ba�ar�yla de�i�tirild.");
				}
				
			}
		}
	}

}
