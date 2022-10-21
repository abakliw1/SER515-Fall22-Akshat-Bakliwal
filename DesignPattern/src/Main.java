import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Facade f = new Facade();
        f.start();
//        System.out.println(f.login());
        f.AttachProductToUser();
        System.out.println("Hello world!");
    }
}