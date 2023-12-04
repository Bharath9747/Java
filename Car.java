package Vehicle;

public class Car extends Vehicle implements VehicleType,FuelType{
    @Override
    public void displayFuelType() {
        System.out.println("CFuel Type : "+this.getVtype());
    }

    @Override
    public void displayVehicleType() {
        System.out.println("CVehicle : "+this.getFtype());
    }
}
