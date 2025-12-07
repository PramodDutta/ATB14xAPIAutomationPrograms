package com.thetestingacademy.ex_07_PayloadManagement.POJO.manualWay.resposne;

import com.thetestingacademy.ex_07_PayloadManagement.POJO.manualWay.request.Booking;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookingResponse {

    private Integer bookingid;
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }


}
