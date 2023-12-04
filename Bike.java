package Vehicle;

public class Bike extends Vehicle implements VehicleType,FuelType {
    @Override
    public void displayFuelType() {
        System.out.println("BFuel Type : "+this.getFtype());
    }

    @Override
    public void displayVehicleType() {
        System.out.println("BVehicle : "+this.getVtype());
    }
}
