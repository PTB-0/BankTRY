public class Account{
    double bal ;
    double fee = 2;
    public void addBal(double num){
        bal =  num - fee ;
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
public  class investment extends Account {
    double fee = 10 ;
    public void invest(double howmny){
        if (bal < howmny + fee) {
            System.out.println("o kadar paranız yok \n bakiyeniz : " + bal + "\n");
        }
    }

}