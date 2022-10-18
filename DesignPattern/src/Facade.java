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

    
}
