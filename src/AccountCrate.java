import java.util.ArrayList;
import java.util.Scanner ;
import java.util.Random ;
public class AccountCrate {
    public static double randomAyar(double upper){
        Random random = new Random();
        int intRandom = random.nextInt(2345);
        return intRandom * upper ;
    }
    public static class AccountMaker{
        public static ArrayList<Account> accounts = new ArrayList<>();
        public ArrayList<Account> getListAc(){
            return accounts;
        }
        public void Worker() {
            Scanner in = new Scanner(System.in);
            System.out.println("Yeni hesap oluşturulsunmu ? [E/h]");
            String cevap = in.next();
            if (cevap.equalsIgnoreCase("e")) {
                System.out.println("name : \n");
                String name = in.next();
                Account acc;
                System.out.println("Account type ? \n 1.Normal \n 2.Madeni \n 3. Yatırım ");
                String Type = in.next();
                switch (Type) {
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
                        System.out.println("Hesabınızın türünü yanlış girdiğiniz için normal hesap oluşturuluyor");
                        acc = new Account(name);
                }
                acc.setIsim(acc.getIsim() +"#"+Type+randomAyar(224));
                System.out.println(acc);
                accounts.add(acc);
            }
        }
    }
}