package Java_Heroes.MultiThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Test islem1 = new Test(1);
	       
		Test islem2 = new Test(2);
       
        Thread thread1 = new Thread(islem1);
        Thread thread2 = new Thread(islem2);
     
        thread1.start();
        Thread.sleep(500);
        thread2.start();

	}

}
