package project;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
   private String name;
   private String location;
   private List<Reservation> reservations = new ArrayList<>();

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}
