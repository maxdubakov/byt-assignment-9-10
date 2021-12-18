package truckable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RouteTest {
    private String routeName, startPoint, endPoint;
    private double duration;

    @Before
    public void before() {
        routeName = "Route1";
        startPoint = "Warsaw";
        endPoint = "Krakow";
        duration = 12;
    }

    @Test
    public void constructorTest() {
        Route route = new Route(routeName, duration, startPoint, endPoint);

        assertNotNull(route);
    }

    @Test
    public void gettersTest() {
        Route route = new Route(routeName, duration, startPoint, endPoint);

        assertEquals(routeName, route.getRouteName());
        assertEquals(duration, route.getDuration(), 0);
        assertEquals(startPoint, route.getStartPoint());
        assertEquals(endPoint, route.getEndPoint());
    }

    @Test
    public void settersTest() {
        Route route = new Route(routeName, duration, startPoint, endPoint);

        assertEquals(routeName, route.getRouteName());
        assertEquals(duration, route.getDuration(), 0);
        assertEquals(startPoint, route.getStartPoint());
        assertEquals(endPoint, route.getEndPoint());

        String newRouteName = "Route2";
        String newStartPoint = "Wroclaw";
        String newEndPoint = "Warsaw";
        int newDuration = 11;

        route.setRouteName(newRouteName);
        route.setStartPoint(newStartPoint);
        route.setEndPoint(newEndPoint);
        route.setDuration(newDuration);

        assertEquals(newRouteName, route.getRouteName());
        assertEquals(newDuration, route.getDuration(), 0);
        assertEquals(newStartPoint, route.getStartPoint());
        assertEquals(newEndPoint, route.getEndPoint());
    }
}
