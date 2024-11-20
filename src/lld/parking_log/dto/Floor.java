package lld.parking_log.dto;

import java.util.ArrayList;

public class Floor {
    Integer ID;
    Integer parking;
    ArrayList<Integer> parkingSlotList;

    public Floor(Integer ID, Integer parking) {
        this.ID = ID;
        this.parking = parking;
        this.parkingSlotList = new ArrayList<>();
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

    public ArrayList<Integer> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(ArrayList<Integer> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "ID=" + ID +
                ", parking=" + parking +
                ", parkingSlotList=" + parkingSlotList +
                '}';
    }
}
