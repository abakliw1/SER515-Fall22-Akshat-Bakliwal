import java.util.ArrayList;

public class ClassProductList extends ArrayList {
    public void accept(NodeVisitor visitor){
        System.out.println("Visiting!!");
    }
}
