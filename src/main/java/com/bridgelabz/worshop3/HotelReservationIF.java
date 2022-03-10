package com.bridgelabz.worshop3;

import java.time.LocalDate;
import java.util.ArrayList;

public interface HotelReservationIF
{
    public void addHotel(String hotelName,int rating, double weekDayRate,double weekendRate);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
    public String getCheapestHotel(LocalDate startDate, LocalDate endDate);
    public String getBestRatedHotel(LocalDate startDate, LocalDate endDate);

}

