package lld.parking_log.dto;

import lld.parking_log.enums.VehicleType;

public class Vehicle {
    Integer ID;
    Integer parkingSlot;
    Integer floor;
    VehicleType vehicleType;
    String reg_no;
    String colour;

    public Vehicle(Integer ID, VehicleType vehicleType, String reg_no, String colour) {
        this.parkingSlot = null;
        this.floor = null;
        this.vehicleType = vehicleType;
        this.reg_no = reg_no;
        this.colour = colour;
    }

    public Integer getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Integer parkingSlot) {
        this.parkingSlot = parkingSlot;
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

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID=" + ID +
                ", parkingSlot=" + parkingSlot +
                ", floor=" + floor +
                ", vehicleType=" + vehicleType +
                ", reg_no='" + reg_no + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
