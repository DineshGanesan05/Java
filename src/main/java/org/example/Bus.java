package org.example;

/**
 * Represents a bus with a number, AC availability, and capacity.
 */
public class Bus {
    private int busNumber;
    private boolean ac;
    private int capacity;

    /**
     * Constructs a Bus object.
     *
     * @param busNumber The bus number.
     * @param ac        Whether the bus has AC.
     * @param capacity  The capacity of the bus.
     */
    public Bus(int busNumber, boolean ac, int capacity) {
        this.busNumber = busNumber;
        this.ac = ac;
        this.capacity = capacity;
    }

    /**
     * Displays the bus information.
     */
    public void displayBusInfo() {
        System.out.println("Bus Number: " + busNumber + ", AC: " + ac + ", Capacity: " + capacity);
    }

    public int getBusNumber() {
        return busNumber;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}