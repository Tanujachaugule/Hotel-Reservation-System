package com.hotelreservationsystem;

public class HotelSystem {
    private String hotelName;
    private  String hotelType;
    private int rates;

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

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelType='" + hotelType + '\'' +
                ", rates=" + rates +
                '}';
    }

    public void addHotel() {
    }
}
