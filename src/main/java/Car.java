import org.example.Vehicle;

public abstract class Car implements Vehicle {

    private final int fuelTankSize;
    private final String fuelType;
    private final int gears;
    private final double consumptionPer100km;
    private final String chassisNumber;

    private int aviableFuel;
    private int tireSize;

    private boolean isStart;
    private int currentGear;
    private float totalKm;
    private int totalFuelUsed;


    public Car(int aviableFuel, String chassisNumber, int fuelTankSize, String fuelType, int gears, float consumptionPer100km) {
        this.aviableFuel = aviableFuel;
        this.chassisNumber = chassisNumber;
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100km = consumptionPer100km;
    }

    @Override
    public void start() {
        this.isStart = true;
        this.currentGear = 0;
        this.totalKm = 0;
        this.totalFuelUsed = 0;

    }

    @Override
    public void stop() {
        this.isStart = false;
        this.currentGear = 0;
    }

    @Override
    public void drive(double km) {

        if (!isStart) {
            System.out.println("You need to start the engine!");
        }

        double fuelNeeded = (consumptionPer100km / 100) + km;
        aviableFuel -= fuelNeeded;
        totalFuelUsed += fuelNeeded;
        totalKm += km;

    }

    public void shiftGear(int gear) {
        if (isStart && gear <= gears) {
            this.currentGear = gear;
        }

    }

    public int getAviableFuel() {
        return aviableFuel;
    }

    public float getAverageFuelCons() {
        if (totalKm == 0) {
            return 0;
        } else {
            return (totalFuelUsed / totalKm) * 100;
        }
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

}
