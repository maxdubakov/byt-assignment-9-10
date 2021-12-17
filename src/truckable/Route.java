package truckable;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private String routeName;
    private double duration;
    private String startPoint;
    private String endPoint;
    private final List<Trip> trips;

    public Route(String routeName, double duration, String startPoint, String endPoint) {
        this.routeName = routeName;
        this.duration = duration;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        trips = new ArrayList<>();
    }

    public void addTrip(Trip trip) { }

    public void deleteTrip(Trip trip) { }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

}
