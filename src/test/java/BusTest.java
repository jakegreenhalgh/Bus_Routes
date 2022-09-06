import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Passenger passenger;
    BusStop busstop;
    
    @Before
    public void setUp() {
        bus = new Bus("Ocean Terminal", 3);
        passenger = new Passenger();
        busstop = new BusStop("Leith Walk");
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void cantAddIfOverCapacity() {
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(3, bus.getPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(0, bus.getPassengers());

    }

    @Test
    public void canPickUpPassenger() {
        busstop.addPassenger(passenger);
        bus.pickUp(busstop);
        assertEquals(0, busstop.getPassengers());
        assertEquals(1, bus.getPassengers());
    }
}
