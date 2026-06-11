import com.cognizant.Builder.Student;
import com.cognizant.Builder.StudentBuilder;
import com.cognizant.DependencyInjection.Laptop;
import com.cognizant.DependencyInjection.Students;
import com.cognizant.factorymethod.Carfactory;
import com.cognizant.factorymethod.Vehicle;
import com.cognizant.factorymethod.Vehiclefactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Laptop lap=new Laptop();
//   constructor injection     Students s1=new Sudents(lap);
        Students s=new Students(); //setter injection
        s.setter(lap);
        s.study();

    }
}