import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    int userType;
    Person thePerson;

    public void login() throws IOException {
        File b = new File("src/BuyerInfo.txt");
        File s = new File("src/SellerInfo.txt");
        BufferedReader brb = new BufferedReader(new FileReader(b));
        BufferedReader brs = new BufferedReader(new FileReader(s));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter whether buyer(enter 0) or seller(enter 1): ");
        userType = sc.nextInt();
        System.out.println("Enter Username: ");
        String username = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();
        String st;
        String[] creds;

        if (userType == 0) {
            while ((st = brb.readLine()) != null) {
                creds = st.split(":");
                if (username.equals(creds[0]) && password.equals(creds[1])) {
                    thePerson = new Buyer(); //Implementation of Factory and Bridge
                }
            }
        } else {
            while ((st = brs.readLine()) != null) {
                creds = st.split(":");
                if (username.equals(creds[0]) && password.equals(creds[1])) {
                    thePerson = new Seller(); //Implementation of Factory and Bridge
                }
            }
        }
    }
}
