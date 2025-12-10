import java.util.Random;

public class Account{
    public madeni madeni;
    public investment investment ;
    private String isim ;
    public String getIsim(){
        return isim ;
    }
    public void setIsim(String newOne){
        isim = newOne ;
    }
    public Account(String isim){
        this.isim = isim ;
    }
    public Account(){
        this.isim = "Bilmiyoruz" ;
    }

    @Override
    public String toString() {
        return isim ;
    }

    public static double randomAyar(double upperbound){
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
        if (howmc >= 0) {
            if (bal >= howmc) {
                whom.addBal(howmc);
                bal = bal - howmc + fee;
                System.out.println("İşlem başarı ile gerçekleşmiştir \n işlemden sonra kalan bakiyeniz : \n" + bal);
            } else {
                System.out.println("BAKİYENİZ YETERSİZ\n Bakiyeniz :" + bal + "\n göndermeye çalıştığınız tutar" + howmc);
            }
        }
    }
    public void STOPAJ(){
        double stopaj1 = (bal / 100)-1 ;
        double stopaj2 = ((bal * 102) - 1342) * 0.001 ;
        bal = bal - (stopaj1+stopaj2) ;
    }
    public static Account findByName(String name){
        for(Account acc : AccountCrate.AccountMaker.accounts){
            if(acc.getIsim().equalsIgnoreCase(name)){
                return acc ;
            }
            else {
                System.out.println("NO ACCOUNTS NAMED LIKE THAT");
            }
        }
        return null ;
    }
}