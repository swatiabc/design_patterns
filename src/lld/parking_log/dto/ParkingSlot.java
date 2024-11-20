package lld.parking_log.dto;

import lld.parking_log.enums.VehicleType;

public class ParkingSlot {
    Integer ID;
    Integer floor;
    VehicleType vehicleType;
    Boolean empty;
    Integer vehicle;

    public ParkingSlot(Integer ID, Integer floor, VehicleType vehicleType) {
        this.ID = ID;
        this.floor = floor;
        this.vehicleType = vehicleType;
        this.empty = true;
        this.vehicle = null;
    }

    public Integer getID() {
        return ID;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public Integer getVehicle() {
        return vehicle;
    }

    public void setVehicle(Integer vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "ID=" + ID +
                ", floor=" + floor +
                ", vehicleType=" + vehicleType +
                ", empty=" + empty +
                ", vehicle=" + vehicle +
                '}';
    }
}
