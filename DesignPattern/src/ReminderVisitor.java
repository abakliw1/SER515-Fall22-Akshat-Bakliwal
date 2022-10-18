public class ReminderVisitor extends NodeVisitor{
    private Reminder m_Reminder=new Reminder();
    public void visitProduct(Product product){
        System.out.println("Product Visited!!");
    }
    public void visitTrading(Trading trading){
        System.out.println("Trading Visited!!");
    }
    public void visitFacade(Facade facade){
        System.out.println("Facade Visited!!");
    }
}
