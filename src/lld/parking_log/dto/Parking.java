package lld.parking_log.dto;

import java.util.ArrayList;

public class Parking {
    Integer ID;
    ArrayList<Integer> floorList;

    public Parking(Integer ID) {
        this.ID = ID;
        this.floorList = new ArrayList<>();
    }

    public Integer getID() {
        return ID;
    }

    public ArrayList<Integer> getFloorList() {
        return floorList;
    }

    public void setFloorList(ArrayList<Integer> floorList) {
        this.floorList = floorList;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "ID=" + ID +
                ", floorList=" + floorList +
                '}';
    }
}
