import java.util.Scanner;
public class madeni extends investment {
    @Override
    public String getIsim() {
        return super.getIsim();
    }
    public madeni(String isim){
        super(isim);
    }
    public madeni(){
        super("Bilmiyoruz");
    }

    public static double sahipOlunanAltin ;
    public void buyMadeni() {
        Scanner in = new Scanner(System.in) ;
        double istek = randomAyar(100);
        double altinG = 2300.00 ;
        double gumusG = 78.00 ;
        double platinG = 1020.00 ;
        System.out.println("Ne Tür Madeni almak istersiniz ?");
        System.out.println("Madenler: \n Altın \n Gram fiyatı" + altinG + " \n Gümüş \n Gram fiyatı :" + gumusG + "\n Platin \n Gram fiyatı : " + gumusG);
        String ask = in.nextLine() ;
        System.out.println("Şunu alıyorsunuz : " + ask);
        in.reset();
        if (ask.equals("Altın")){
            System.out.println("Gram fiyatı :" + altinG);
            System.out.println("Ne kadar almak istersiniz (Gram olarak)");
            in.reset();
            double howmc = in.nextDouble();
            double odenmek = howmc * altinG ;
            double istekAltin = istek + 1 ;
            double newFiyat = (((istek * altinG) /2) / (altinG - 100 *(2+20))) ;
            if (bal - odenmek >= 0){
                double sahipOlunanAltin = howmc ;
                bal = bal - odenmek ;
            }
        } else if (ask.equals("Gümüş")) {
            System.out.println("Gram fiyatı :" + gumusG);
        } else if (ask.equals("Platin")) {
            System.out.println("Gram fiyatı :" + platinG);
        }
        else {
            System.out.println("Üzgünüm isteğiniz gerçekleşemedi (geçerli fiyatı bulunmamakta)");
        }
    }
    public void balSeeWin() {
        System.out.println(bal +""+sahipOlunanAltin);
    }
}