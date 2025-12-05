import java.util.ArrayList;
import java.util.Scanner ;
public class doingIt {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ne yapmak istersiniz\n SEÇENEKLER : \n 1. Hesap Oluştur \n 2. Transfer \n 3. Para ekleme \n 4. maden alma (madeni hesap) \n 5. yatırım yap (yatırım hesabı / madeni hesap)");
        String ask = in.nextLine() ;
        switch (ask){
            case "1." , "Hesap Oluştur" , "Hesap oluştur" , "hesap oluştur" :
                ArrayList<Account> accounts = new ArrayList<>();
                System.out.println("Yeni hesap oluşturulsunmu ? [Y/h]");
                String cevap = in.nextLine();
                if (cevap.equals("H") || cevap.equals("h")) break;
                System.out.println("name : \n");
                String name = in.nextLine();
                Account acc ;
                System.out.println("Account type ? \n 1.Normal \n 2.Madeni \n 3. Yatırım ");
                String Type = in.nextLine();
                switch (Type){
                    case "Normal":
                        acc = new Account(name);
                        break;
                    case "Madeni":
                        acc = new madeni(name);
                        break;
                    case "Yatırım":
                        acc = new investment(name);
                        break;
                    default:
                        acc = new Account(name);
                }
                accounts.add(acc);
        }
    }
}