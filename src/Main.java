import com.cognizant.Adapter.AttendanceAdapter;
import com.cognizant.Adapter.AttendanceSystem;
import com.cognizant.Adapter.Biometric;
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
        Biometric biometric=new Biometric();
        AttendanceSystem attendanceSystem=new AttendanceAdapter(biometric);
        attendanceSystem.markattendance();

    }
}