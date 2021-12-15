package truckable;

import java.util.List;

public class Driver {
    private List<DriverVehicle> driverVehicles;

    public List<DriverVehicle> getDriverVehicles() {
        return driverVehicles;
    }
    public void addDriverVehicle(DriverVehicle driverVehicle) {
        this.driverVehicles.add(driverVehicle);
    }
}
