import java.util.Scanner;

public class AccountCrate {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("isminiz ne");
    java.lang.String name = in.next();
        System.out.println("Account type");
    String type = in.next();
    Account Acc ;
        switch (type) {
            case "Normal":
                Acc = new Account(name);
                break;
            case "yatırım":
                Acc = new investment(name);
                break;
            case "maden":
                Acc = new madeni(name);
                break;

        }
    }
}
