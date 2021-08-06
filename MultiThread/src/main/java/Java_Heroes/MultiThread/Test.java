package Java_Heroes.MultiThread;

public class Test implements Runnable{
    
    private int sayac = 0;
    private int islemNo;
 
    public Test(int islemNo){
        this.islemNo = islemNo;
    }
   
    @Override
    public void run() {
        while(true){
            System.out.println("Islem " + this.islemNo + " : " + this.sayac++);
        }
    }
}
