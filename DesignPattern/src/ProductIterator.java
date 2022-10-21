import java.util.Iterator;

public class ProductIterator implements ListIterator{
    private int index;
    private ClassProductList list=new ClassProductList();
    ProductIterator(ClassProductList list){
        this.list=list;
    }
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

    @Override
    public void remove() {
        System.out.println("Removed!!");
    }

    @Override
    public void MoveToHead() {
        System.out.println("Moved Header!!");
    }
}
