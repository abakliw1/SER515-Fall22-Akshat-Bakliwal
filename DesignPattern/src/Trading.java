public class Trading {
    public Reminder accept(NodeVisitor visitor){
        System.out.println("Visiting!!");
        return visitor.visitTrading(this);
    }
}
