/*burası yeni bir dosyaya konuşlcak ve yanına import java.utils.random.* ; eklejnecek */
public  class investment extends Account {
    @Override
    public String getIsim() {
        return super.getIsim();
    }
    public investment(String isim){
        super(isim);
    }
    public investment(){
        super("Bilmiyoruz");
    }

    double fee = 10 ;
    String ad = getIsim() ;

    public void invest(double howmny){
        if (bal < howmny + fee) {
            System.out.println("o kadar paranız yok \n bakiyeniz : " + bal + "\n Yatırım yapmak istediğiniz miktar :" + howmny + "ve üstüne gelen vergilendirme : " + fee +"\n yani hesaptan şu kadar çekilmeli : " + (fee + howmny));
        }
        else{

                /*kütüphanemi yanlış acaba */
            double b = randomAyar(1000);
            double wich = randomAyar(1);
            if (wich % 2 == 0){                              /*ozaman başka hangi kütüphaneyi kullancağız*/
                bal += b + howmny - fee ;
            }
            else {
                bal += howmny - fee + b ;
            }
        }
    }
}