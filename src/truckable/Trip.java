package truckable;

import truckable.util.Helper;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Trip {
    private static final int ID;

    private final int idTrip;
    private String tripName;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double duration;
    private final Map<Integer, Route> routes;
    private DriverVehicle driverVehicle;
    private Company company;

    static {
        ID = 1;
    }

    public Trip(String tripName, LocalDate dateFrom, LocalDate dateTo, double duration, DriverVehicle driverVehicle, Company company) {
        this.idTrip = Helper.getUniqueID(ID);
        this.tripName = tripName;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.duration = duration;
        this.routes = new HashMap<>();
        this.driverVehicle = driverVehicle;
        this.company = company;
    }

    public String changeTripPlan() {
        return "Your plan has been changed";
    }

    public void constructTrip() {
    }

    public void addRoute(Integer id, Route route) {
        this.routes.put(id, route);
    }

    public void deleteRoute(Integer id) {
        this.routes.remove(id);
    }

    /**
     * GETTERS
     */
    public int getIdTrip() {
        return idTrip;
    }

    public String getTripName() {
        return tripName;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public double getDuration() {
        return duration;
    }

    public Map<Integer, Route> getRoutes() {
        return routes;
    }

    public DriverVehicle getDriverVehicle() {
        return driverVehicle;
    }

    public Company getCompany() {
        return company;
    }

    /**
     * SETTERS
     */
    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setDriverVehicle(DriverVehicle driverVehicle) {
        this.driverVehicle = driverVehicle;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
