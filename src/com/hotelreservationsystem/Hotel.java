package com.hotelreservationsystem;


import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    public Object rate;
    Scanner scanner = new Scanner(System.in);

    public Hotel(String hotelName, String hotelType, int rates) {
    }

    public Hotel() {

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

    public String getName() {
        return null;
    }

    public float getRate() {
        return 0;
    }

    public void setRate(float rate) {
    }

    public void setName(String name) {
    }

    public int compareTo(Hotel h2) {
        return 0;
    }
}