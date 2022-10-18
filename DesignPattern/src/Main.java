public class Main {
    public static void main(String[] args) {
        Buyer b=new Buyer();
        b.CreateProductMenu();
        b.showMenu();
        Seller s=new Seller();
        s.CreateProductMenu();
        s.showMenu();
        System.out.println("Hello world!");
    }
}