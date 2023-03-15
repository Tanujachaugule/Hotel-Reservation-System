package com.hotelreservationsystem;

public class HotelSystem implements Comparable<Hotel> {
    private String hotelName;
    private String hotelType;
    private int rates;
    private String rate;
    private String name;
    private int weekendRate;

    public HotelSystem(String hotelName, String hotelType, int rates) {
        this.hotelName = hotelName;
        this.hotelType = hotelType;
        this.rates = rates;
    }

    public HotelSystem() {

    }

    public String getHotelName() {

        return hotelName;
    }

    public void setHotelName(String hotelName) {

        this.hotelName = hotelName;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {

        this.hotelType = hotelType;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }
    public float getWeekendRate() {

        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {

        this.weekendRate = weekendRate;
    }
    public int getRatings() {
        
        return rates;
    }

    public void setRatings(int ratings) {
        this.rates = ratings;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", weekendRate=" + weekendRate +'}';
    }



    public void addHotel () {
        }


    @Override
    public int compareTo(Hotel o) {
        return 0;
    }
}

