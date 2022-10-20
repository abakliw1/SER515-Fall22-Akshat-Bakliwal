import java.io.IOException;

public abstract class Person {
    protected ProductMenu theProductMenu;
    public abstract void showMenu();
    public void showAddButton(){
        System.out.println("Add Button: ");
    }
    public void showViewButton(){
        System.out.println("View Button: ");
    }
    public void showRadioButton(){
        System.out.println("Radio Button: ");
    }
    public void showLabels(){
        System.out.println("Labels: ");
    }
    public abstract ClassProductList CreateProductMenu(String item) throws IOException;
}
