import java.util.ArrayList;

public class ClassProductList extends ArrayList {

    Trading t = new Trading();
    public Reminder accept(NodeVisitor visitor){
        System.out.println("Visiting!!");
        ProductIterator it=new ProductIterator(this);
        while(it.hasNext()){
            visitor.visitProduct(this);
        }
        return null;
    }
}
