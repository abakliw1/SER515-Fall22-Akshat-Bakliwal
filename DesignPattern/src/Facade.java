public class Facade {
    private int userType;
    private Product selectedProduct;
    private int nProductCategory;
    private ClassProductionList theProductList;
    private Person thePerson;
    public boolean login(){
        System.out.println("Logged in!!");
        return true;
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
    public void AttachProductToUser(){
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
