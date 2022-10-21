public class ReminderVisitor extends NodeVisitor{
    private Reminder m_Reminder=new Reminder();
    public Reminder visitProduct(ClassProductList product){
        System.out.println("Product Visited!!");
        product.t.accept(this);
        return null;
    }
    public Reminder visitTrading(Trading trading){
        System.out.println("Trading Visited!!");
        return null;
    }
    public void visitFacade(Facade facade){
        ProductIterator it=new ProductIterator(facade.theProductList);
        while(it.hasNext()){
            System.out.println(it.next());
        }
        facade.theProductList.accept(this);
        System.out.println("Facade Visited!!");
    }
}
