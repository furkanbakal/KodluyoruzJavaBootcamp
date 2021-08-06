#Java ile Multithreading Kavramı

Thread başka threadlerle eş zamanlı çalışabilen bir iş parçacığı olarak ifade edilebilir. Türkçe’ye çevirecek olursak “multithreading”i “eşzamanlılık”, “thread”i ise “iş parçacığı” olarak ifade edebiliriz.

Burada Java’da threadler oluşturmanın ve çalıştırmanın iki basit yolunu göreceğiz.

Birinci yol “Thread” sınıfını genişleten (extend) bir sınıf oluşturmak ve “run()” metodunu gerçekleştirerek (implement) threadin yapmasını istediğimiz işi bu “run()” metodu içerisinde kodlamaktır:


```
 public class Runner extends Thread {

    @Override
    public void run() {
        // Thread çalıştığında yapılması istenen işlemler buraya yazılır
    }

}
```

“InterruptedException” istisnası ile sıkça karşılaştık. Bu istisna bir threadin çalışması yarıda kesildiğinde fırlatılır. Peki çalışmakta olan bir threadin çalışması nasıl yarıda kesilir? Gelin yaptığı işlem uzun süren bir threadi belli süre geçtikten sonra durdurmayı deneyelim. Bunun için “Thread” sınıfının sağladığı “interrupt()” metodunu kullanacağız:

###Thread Oluşturma Şekilleri 
*Çekirdek Uzayında Gerçeklenen Threadler :Thread tablosu kernel’de (işletim sisteminde) yer alır. Hangi thread’in çalışacağına kernel (çekirdek) karar verir. Yeni thread oluşturmak için kernel’da sistem çağrısı yürütülür.
*Kullanıcı Uzayında Gerçeklenen Threadler :Kernel, threadlerden haberdar değildir, bu nedenle threadleri desteklemeyen işletim sistemlerinde bile kullanıabilir. Her process’in (programın) ayrı thread tabloları bulunmaktadır. Bu sayede her processte farklı iş sıralama algoritmaları kullanılabilmektedir.
*Hibrit Threadler :Çekirdek ve kullanıcı düzeyinde threadler vardır, ancak kernel sadece kernel düzeyindeki threadlerden haberdardır. Bir kernel düzeyi thread üzerinde birden fazla kullanıcı düzeyi thread sıra ile çalışır.


***
##Kaynakça

[https://umiitkose.com/2015/04/java-thread-islemleri/]