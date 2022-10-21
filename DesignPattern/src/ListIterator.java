import java.util.Iterator;

public interface ListIterator extends Iterator {
    public abstract boolean hasNext();

    @Override
    public abstract Object next();

    public abstract void MoveToHead();

    @Override
    public abstract void remove();

}
