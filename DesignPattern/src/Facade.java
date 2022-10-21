import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class Facade {
    private int userType;
    private Product selectedProduct;
    protected int nProductCategory;
    protected ClassProductList theProductList=new ClassProductList();
    protected ClassProductList prod;
    private Person thePerson;
    ClassProductList list=new ClassProductList();
    public void start() throws IOException {
        Login l=new Login();
        login(l);
        AttachProductToUser();

    }
    public void login(Login l) throws IOException {
        l.login();
        userType=l.userType;
        thePerson=l.thePerson;
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
        ReminderVisitor rm=new ReminderVisitor();
        this.accept(rm);
        System.out.println("Reminder!!");
    }

    private void accept(ReminderVisitor rm) {
        rm.visitFacade(this);
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
//            System.out.println(ustopro[1]);
            theProductList.add(ustopro[1]);
        }

        System.out.println("Do you want meat(Type Meat) menu or want to produce menu(Type Produce)?");
        String opt=sc.next();
        this.prod= new ClassProductList();
        ProductIterator it; //Implemented Iterator
        ProductIterator it2;//Implemented
        String s,s1;
        switch (opt){
            case "Meat": this.prod=thePerson.CreateProductMenu("Meat");
                         it=new ProductIterator(prod);
                         it2=new ProductIterator(theProductList);
                         while(it.hasNext()){
//                             s= (String) it.next();
                             while(it2.hasNext()) {
                                    if(it.hasNext()==false)
                                        break;
                                    s1=(String) it2.next();
                                    s=(String) it.next();
                                 if (s1.equals(s)) {
                                     list.add(s);
                                 }
                             }
                         }
                            break;
            case "Produce":this.prod=thePerson.CreateProductMenu("Produce");
                            it=new ProductIterator(prod);
                            it2=new ProductIterator(theProductList);
                            while(it.hasNext()){

                                while(it2.hasNext()) {
                                    if(it.hasNext()==false)
                                        break;
                                    s= (String) it.next();
                                    s1=(String) it2.next();
                                    if (s1.equals(s)) {
                                        list.add(s);
                                    }
                                }
                            }
                            break;
        }
        System.out.println("\nThe Final List ordered is(Implemented Using Iterator): ");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("\nProduct attached to the User Successfully");
    }
    public Product SelectProduct(){
        Product p=new Product();
        return p;
    }
    public void productOperation(){
        System.out.println("Operations performed on the product Successfully");
    }

}
