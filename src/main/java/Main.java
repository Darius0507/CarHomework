import org.example.Vehicle;

public class Main {
    static void main() {


        //Car car = new Car();

        //Car car = new Dacia(27, "oiqe0934hkkadsn");

        Car car = new Logan(27, "oiqe0934hkkadsn");

        car.start();

        car.shiftGear(1);

        car.drive(0.01); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

        float availableFuel = car.getAviableFuel();

        float fuelConsumedPer100Km = car.getAverageFuelCons();


        Vehicle vehicle = new VWGolf(30, "1987ddkshik289");
        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car car1 = (Car) vehicle;

        float availableFuel1 = car.getAviableFuel();

        float fuelConsumedPer100Km1 = car.getAverageFuelCons();

    }

}