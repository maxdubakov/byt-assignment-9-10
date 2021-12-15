package truckable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trip {
    private int idTrip;
    private String tripName;
    private Date dateFrom; //dateFromTrip(?)
    private Date dateTo;
    private double duration;
    private final List<Route> routes;
    private DriverVehicle driverVehicle;

    public Trip(int idTrip, String tripName, Date dateFrom, Date dateTo, double duration, DriverVehicle driverVehicle){
        this.idTrip = idTrip;
        this.tripName = tripName;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.duration = duration;
        this.routes = new ArrayList<>();
        this.driverVehicle = driverVehicle;
    }

    public String changeTripPlan(){
        return "Your plan has been changed";
    }

    public void constructTrip(){}

    public int getIdTrip() {
        return idTrip;
    }

    public void setIdTrip(int idTrip) {
        this.idTrip = idTrip;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public DriverVehicle getDriverVehicle() {
        return driverVehicle;
    }

    public void setDriverVehicle(DriverVehicle driverVehicle) {
        this.driverVehicle = driverVehicle;
    }
}
