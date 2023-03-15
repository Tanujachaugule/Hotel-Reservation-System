package com.hotelreservationsystem;


import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    Scanner scanner = new Scanner(System.in);

    public Hotel(String hotelName, String hotelType, int rates) {
    }

    public static void main (String[] args) {
        System.out.println("Welcome to Hotel");
        HotelSystem hotelsystem = new HotelSystem();
        hotelsystem.addHotel();
    }
    ArrayList<Hotel> hotelList = new ArrayList();

    public void addHotel(){
        System.out.println("Enter Hotel Name");
        String hotelName = scanner.next();
        System.out.println("Enter Hotel Type");
        String hotelType = scanner.next();
        System.out.println("Enter Hotel Rates");
        int rates = scanner.nextInt();

        Hotel hotel;
        hotel = new Hotel(hotelName, hotelType, rates);
        hotelList.add(hotel);
        System.out.println(hotelList);
    }
}