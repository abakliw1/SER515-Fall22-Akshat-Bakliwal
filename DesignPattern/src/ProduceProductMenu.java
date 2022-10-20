import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProduceProductMenu implements ProductMenu{
    ClassProductList item=new ClassProductList();
    public ClassProductList showMenu() throws IOException {
        File f=new File("src/ProductInfo.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        String str;
        String[] items;
        while((str=br.readLine())!=null){
            items=str.split(":");
            if(items[0].equals("Produce"))
                item.add(items[1]);
        }
        return item;
    }
    public void showAddButton(){
        System.out.println("Add Button:");
    }
    public void showViewButton(){
        System.out.println("View Button:");
    }
    public void showRadioButton(){
        System.out.println("Radio Button:");
    }
    public void showLabels(){
        System.out.println("Labels:");
    }
    public void showComboBoxes(){
        System.out.println("Combo Boxes:");
    }
}
