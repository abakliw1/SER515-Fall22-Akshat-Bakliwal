import java.io.*;
import java.util.Scanner;

public class Facade {
    private int userType;
    private Product selectedProduct;
    private int nProductCategory;
    private ClassProductList theProductList=new ClassProductList();
    private Person thePerson;
    public boolean login() throws IOException {
        File b=new File("src/BuyerInfo.txt");
        File s=new File("src/SellerInfo.txt");
        BufferedReader brb=new BufferedReader(new FileReader(b));
        BufferedReader brs=new BufferedReader(new FileReader(s));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter whether buyer(enter 0) or seller(enter 1): ");
        userType=sc.nextInt();
        System.out.println("Enter Username: ");
        String username=sc.next();
        System.out.println("Enter Password: ");
        String password=sc.next();
        String st;
        String[] creds;
        if(userType==0){
            while((st=brb.readLine())!=null){
                creds=st.split(":");
                if(username.equals(creds[0])&&password.equals(creds[1])) {
                    thePerson=new Buyer(); //Implementation of Factory and Bridge
                    return true;
                }
            }
            return false;
        }
        else {
            while((st=brs.readLine())!=null){
                creds=st.split(":");
                if(username.equals(creds[0])&&password.equals(creds[1])) {
                    thePerson=new Seller(); //Implementation of Factory and Bridge
                    return true;
                }
            }
            return false;
        }
    }
    public void addTrading(){
        System.out.println("Trading added");
    }
    public void viewTrading(){
        System.out.println("Trades Viewing");
    }
    public void decideBidding(){
        System.out.println("Bidding Decided");
    }
    public void discussBidding(){
        System.out.println("Discussing Bidding");
    }
    public void submitBidding(){
        System.out.println("Bidding Submitted");
    }
    public void remind(){
        System.out.println("Reminder!!");
    }
    public void createUser(UserInfoItem userInfoItem){
        System.out.println("User Created Successfully");
    }
    public void createProductList(){
        System.out.println("Product List Created Successfully");
    }
    public void AttachProductToUser() throws IOException {
        Scanner sc=new Scanner(System.in);
        File up=new File("src/UserProduct.txt");
        BufferedReader br=new BufferedReader(new FileReader(up));
        String st;
        String[] ustopro;
        while((st=br.readLine())!=null){
            ustopro=st.split(":");
            theProductList.add(ustopro[1]);
        }
        System.out.println("Do you want meat(Type Meat) menu or want to produce menu(Type Produce)?");
        String opt=sc.next();
        ClassProductList prod=new ClassProductList();
        switch (opt){
            case "Meat": prod=thePerson.CreateProductMenu("Meat");
            case "Produce":prod=thePerson.CreateProductMenu("Produce");
        }
        System.out.println("Product attached to the User Successfully");
    }
    public Product SelectProduct(){
        Product p=new Product();
        return p;
    }
    public void productOperation(){
        System.out.println("Operations performed on the product Successfully");
    }

}
