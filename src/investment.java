import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/*burası yeni bir dosyaya konuşlcak ve yanına import java.utils.random.* ; eklejnecek */
public  class investment extends Account {
    double fee = 10 ;
    public void invest(double howmny){
        if (bal < howmny + fee) {
            System.out.println("o kadar paranız yok \n bakiyeniz : " + bal + "\n Yatırım yapmak istediğiniz miktar :" + howmny + "ve üstüne gelen vergilendirme : " + fee +"\n yani hesaptan şu kadar çekilmeli : " + (fee + howmny));
        }
        else{
            Random a = new Random();
            a.setSeed(23124);
            IntStream wich = a.ints();
            DoubleStream b = a.doubles();
            b = (double) b ;                        /*kütüphanemi yanlış acaba */
            if (wich % 2 = 0){
                bal += b + howmny - fee ;
            }
            else {
                bal += howmny - fee + b ;
            }
        }
    }
}