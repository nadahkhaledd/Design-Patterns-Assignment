import implementation.Assemble;
import implementation.Make;
import model.Bike;
import model.Car;
import model.Vehicle;


/*
 * allows to separate the abstraction from the implementation.
*/
public class Main {
    public static void main(String[] args) {

        Vehicle vw = new Car(new Make(), new Assemble());
        vw.manufacture();

        Vehicle bmx = new Bike(new Make(), new Assemble());
        bmx.manufacture();

    }
}
