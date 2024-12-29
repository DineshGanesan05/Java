package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main application class for bus booking system.
 */
public class App {
    public static void main(String[] args) {
        List<Bus> buses = new ArrayList<>();
        List<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 1));
        buses.add(new Bus(3, true, 1));

        try (Scanner scanner = new Scanner(System.in)) {
            displayAllBuses(buses);

            int userOpt;
            do {
                System.out.println("Enter 1 to Book and 2 to Exit:");
                userOpt = scanner.nextInt();

                if (userOpt == 1) {
                    Booking booking = new Booking();
                    if (booking.isAvailable(bookings, buses)) {
                        bookings.add(booking);
                        System.out.println("Your booking is confirmed.");
                    } else {
                        System.out.println("Sorry. Bus is full. Try another bus or date.");
                    }
                } else if (userOpt != 2) {
                    System.out.println("Invalid option. Please try again.");
                }
            } while (userOpt != 2);

            System.out.println("Exiting...");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * Displays information for all buses.
     *
     * @param buses List of buses to display.
     */
    private static void displayAllBuses(List<Bus> buses) {
        for (Bus bus : buses) {
            bus.displayBusInfo();
        }
    }
}