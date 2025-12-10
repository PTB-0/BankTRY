import java.util.Scanner ;
public class doingIt {
    public  void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Ne yapmak istersiniz\n SEÇENEKLER : \n 1. Hesap Oluştur \n 2. Transfer \n 3. Para ekleme \n 4. maden alma (madeni hesap) \n 5. yatırım yap (yatırım hesabı / madeni hesap)");
            String ask = in.nextLine();
            switch (ask.toLowerCase()) {
                case "1.",  "hesap oluştur","1":
                    AccountCrate.AccountMaker maker = new AccountCrate.AccountMaker();
                    maker.Worker();
                    break;
                case "2" , "2." , "transfer" , "2. transfer","2 transfer","2.transfer","2transfer" :
                    System.out.println(AccountCrate.AccountMaker.accounts);
                    System.out.println("Transfer yapacağın kişi kim");
                    java.lang.String howm = in.nextLine();
                    Account Hedef = Account.findByName(howm);
                    in.reset();
                    if (Hedef == null){
                        System.out.println("Böyle bir hesap yok");
                        break;
                    }
                    System.out.println("Ne kadar yapacaksın");
                    double howmny = in.nextDouble();
                    in.reset();
                    System.out.println(AccountCrate.AccountMaker.accounts);
                    System.out.println("Hesap ID nizi girin");
                    String ID = in.next();
                    Account Ben = Account.findByName(ID);
                    if (Ben.bal < howmny){
                        System.out.println("Hesabınızda yeterli para yok");
                        while(Ben.bal < howmny){
                            in.reset();
                            System.out.println("Ne kadar para yollamak istiyorsunuz");
                            howmny = in.nextDouble();
                        }
                    }
                    Ben.transfer(Hedef,howmny);
                    break;
                case "3","3.","para ekleme" :
                    in.reset();
                    System.out.println("Ne kadar para eklemek istiyorsunuz");
                    howmny = in.nextDouble();
                    System.out.println("Şu kadar para ekliyoruz :" + howmny + "\n Lütfen eklemek istediğiniz hesabı aşağıda çıkan listeden bulup bize bildirin");
                    System.out.println(AccountCrate.AccountMaker.accounts);
                    ID = in.nextLine();
                    Account SelectedACC1 = Account.findByName(ID);
                    SelectedACC1.addBal(howmny);
                    break;
                case "4" , "4." , "maden alma" :
                    System.out.println("Hangi madenden almak istersiniz?\n ALTIN \n GÜMÜŞ \n PLATIN");
                    in.reset();
                    String maden = in.next();
                    madeni.buyMadeni(maden);
            }
        }
    }
}