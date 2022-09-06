import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busstop;
    Passenger passenger;

    @Before
    public void setUp() {
        busstop = new BusStop("Leith Walk");
        passenger = new Passenger();
    }

    @Test
    public void canAddPassengers() {
        busstop.addPassenger(passenger);
        assertEquals(1, busstop.getPassengers());
    }

    @Test
    public void canRemovePassengers() {
        busstop.addPassenger(passenger);
        busstop.removePassenger();
        assertEquals(0, busstop.getPassengers());
    }
}
