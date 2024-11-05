package model;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationId;
    private Boat boat;
    private User user;
    private String customerRoomNumber;
    private LocalDateTime startDateAndTime;
    private LocalDateTime endDateAndTime;
    private double totalPrice;

    public Reservation(int reservationId, Boat boat, User user,
                       String customerRoomNumber,
                       LocalDateTime startDateAndTime,
                       LocalDateTime endDateAndTime, double totalPrice) {
        this.reservationId = reservationId;
        this.boat = boat;
        this.user = user;
        this.customerRoomNumber = customerRoomNumber;
        this.startDateAndTime = startDateAndTime;
        this.endDateAndTime = endDateAndTime;
        this.totalPrice = totalPrice;
    }

    public int getReservationId() {
        return reservationId;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public String getCustomerRoomNumber() {
        return customerRoomNumber;
    }

    public void setCustomerRoomNumber(String customerRoomNumber) {
        this.customerRoomNumber = customerRoomNumber;
    }

    public LocalDateTime getStartDateAndTime() {
        return startDateAndTime;
    }

    public void setStartDateAndTime(LocalDateTime startDateAndTime) {
        this.startDateAndTime = startDateAndTime;
    }

    public LocalDateTime getEndDateAndTime() {
        return endDateAndTime;
    }

    public void setEndDateAndTime(LocalDateTime endDateAndTime) {
        this.endDateAndTime = endDateAndTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


}
