import java.util.Random;

public class Account{
    private String isim ;
    public String getIsim(){
        return isim ;
    }
    public Account(String isim){
        this.isim = isim ;
    }
    public Account(){
        this.isim = "Bilmiyoruz" ;
    }
    public static double randomAyar( double upperbound){
        Random random = new Random();
        int intRandom = random.nextInt(100);
        double doubleRandom = random.nextDouble(100);
        float floatRandom = random.nextFloat();
        return doubleRandom * upperbound ;
    }
    public void balSee(){
        System.out.println("ismininiz : \n" + isim + "\nSizin suanki bakiyeniz : \n"+bal);
    }
    double bal = 0;
    double fee = 2;
    public void addBal(double num){
        Account.this.bal =  num - fee ;
    }
    public void transfer(Account whom , double howmc){
        if (bal >= howmc){
            whom.addBal(howmc);
            bal = bal - howmc + fee ;
            System.out.println("İşlem başarı ile gerçekleşmiştir \n işlemden sonra kalan bakiyeniz : \n" + bal);
        }
        else {
            System.out.println("BAKİYENİZ YETERSİZ\n Bakiyeniz :" + bal + "\n göndermeye çalıştığınız tutar" + howmc);
        }
    }
    public void VERGI(){
        double vergi1 = (bal / 100)-1 ;
        double vergi2 = ((bal * 102) - 1342) * 0.001 ;
        bal = bal - (vergi1+vergi2) ;
    }
}
