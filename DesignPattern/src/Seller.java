import java.io.IOException;

public class Seller extends Person {
    ClassProductList items=new ClassProductList();
    public void showMenu(){
        System.out.println("Menu: ");
    }
    public ClassProductList CreateProductMenu(String item) throws IOException {
        if(item=="Meat"){
            MeatProductMenu mpm = new MeatProductMenu();
            items = mpm.showMenu();
        }
        else if(item=="Produce"){
            ProduceProductMenu ppm=new ProduceProductMenu();
            items=ppm.showMenu();
        }
        return items;
    }
}
