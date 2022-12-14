import java.util.Iterator;
import java.util.function.Consumer;

public class OfferingIterator implements ListIterator {
    int index;
    private OfferingList list=new OfferingList();
    public boolean hasNext(){
        if(index<list.size())
            return true;
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext())
            return list.get(index++);
        return null;
    }

    public void remove() {
        System.out.println("Removed!!");
    }

    public void MoveToHead(){
        System.out.println("Moved!!");
    }

}
