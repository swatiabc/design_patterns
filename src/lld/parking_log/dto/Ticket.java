package lld.parking_log.dto;

public class Ticket {
    Integer ID;
    Integer parking;
    Integer floor;
    Integer parkingSlot;
    Integer vehicle;
    Boolean active;

    public Ticket(Integer ID, Integer parking, Integer floor, Integer parkingSlot, Integer vehicle) {
        this.ID = ID;
        this.parking = parking;
        this.floor = floor;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
        this.active = true;
    }

    public Integer getID() {
        return ID;
    }

    public Integer getParking() {
        return parking;
    }

    public void setParking(Integer parking) {
        this.parking = parking;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Integer parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Integer getVehicle() {
        return vehicle;
    }

    public void setVehicle(Integer vehicle) {
        this.vehicle = vehicle;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ID=" + ID +
                ", parking=" + parking +
                ", floor=" + floor +
                ", parkingSlot=" + parkingSlot +
                ", vehicle=" + vehicle +
                ", active=" + active +
                '}';
    }
}
