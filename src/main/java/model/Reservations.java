package model;

import java.util.ArrayList;

public class Reservations {
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }
}
