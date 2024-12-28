package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(8);
        int userOption = 1;
        Scanner scanner = new Scanner(System.in);

        while (userOption == 1) {
            System.out.println("Please enter 1 for booking 2 for exit");
            userOption = scanner.nextInt();
            if (userOption == 1) {
                System.out.println("Booking...");
            }
        }
    }
}