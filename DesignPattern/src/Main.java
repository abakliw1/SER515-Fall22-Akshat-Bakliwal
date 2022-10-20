import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Buyer b=new Buyer();
        b.CreateProductMenu();
        b.showMenu();
        Seller s=new Seller();
        s.CreateProductMenu();
        s.showMenu();
        Facade f=new Facade();
        System.out.println(f.login());
        System.out.println("Hello world!");
    }
}