import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Passenger>();
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.getPassengers() < this.capacity) {
            this.passengers.add(passenger);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busstop) {
        Passenger passenger = busstop.removePassenger();
        this.passengers.add(passenger);
    }
}
