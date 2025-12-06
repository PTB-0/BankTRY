import java.util.Scanner ;
public class doingIt {
    public static void  main(String[] args) {
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
            }
        }
    }
}