import com.cognizant.singleton.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton s1=new Singleton();
        Singleton s2=new Singleton();
        s1.message();
        s2.message();
    }
}