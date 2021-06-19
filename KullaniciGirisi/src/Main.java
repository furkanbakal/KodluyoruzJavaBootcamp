import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Kullanýcý Giriþi Uygulamasý
		
		String userName,password;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Kullanýcý adýnýz: ");
		userName=input.nextLine();
		
		System.out.print("Þifreniz: ");
		password=input.next();
		
		if(userName.equals("furkan") && password.equals("12345")) {
			System.out.println("Giriþ yaptýnýz.");
		}else {
			System.out.println("Bilgileriniz yanlýþ.");
		}
		
		if(!password.equals("12345")) {
			System.out.println("Yanlýþ kullanýcý adý girdiniz Þifrenizi sýfýrlamak ister misiniz?");
			System.out.print("yes/no");
			String choose=input.next();
			if(choose.equalsIgnoreCase("yes")) {
				System.out.println("Girdiðiniz þifre eski þifreniz ile ayný olmamalýdýr!");
				System.out.print("Yeni þifreniz: ");
				String newPassword=input.next();
				if(newPassword.equals("12345")) {
					System.out.println("Þifreniz eski þifre ile ayný olamaz!");
				}
				else if(!newPassword.equals("12345")){
					password=newPassword;
					System.out.println("Þifreniz baþarýyla deðiþtirild.");
				}
				
			}
		}
	}

}
