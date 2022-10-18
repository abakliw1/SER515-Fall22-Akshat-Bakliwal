public class OfferingIterator {
    public boolean hasNext(){
        return true;
    }
    public Offering Next(){
        Offering o=new Offering();
        return o;
    }
    public void MoveToHead(){
        System.out.println("Moved!!");
    }
    public void Remove(){
        System.out.println("Removed!!");
    }
}
