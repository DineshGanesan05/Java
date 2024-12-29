package org.example;

import java.util.List;
import java.util.Scanner;

/**
 * Represents a booking with a bus number and date.
 */
public class Booking {
    private int busNumber;
    private String date;

    /**
     * Constructs a Booking object by prompting the user for input.
     */
    public Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bus number:");
        this.busNumber = scanner.nextInt();
        System.out.println("Enter date (dd-mm-yyyy):");
        this.date = scanner.next();
    }

    /**
     * Checks if a booking is available for the given bus and date.
     *
     * @param bookings List of existing bookings.
     * @param buses    List of buses.
     * @return True if the booking is available, false otherwise.
     */
    public boolean isAvailable(List<Booking> bookings, List<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNumber() == this.busNumber) {
                capacity = bus.getCapacity();
            }
        }

        int bookedCount = 0;
        for (Booking booking : bookings) {
            if (booking.busNumber == this.busNumber && booking.date.equals(this.date)) {
                bookedCount++;
            }
        }

        return bookedCount < capacity;
    }
}