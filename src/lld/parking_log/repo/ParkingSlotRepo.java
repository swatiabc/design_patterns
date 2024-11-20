package lld.parking_log.repo;

import lld.parking_log.dto.ParkingSlot;
import lld.parking_log.dto.Vehicle;
import lld.parking_log.enums.VehicleType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingSlotRepo {
     Map<Integer, ParkingSlot> parkingSlotMap;

    public ParkingSlotRepo() {
        parkingSlotMap = new ConcurrentHashMap<>();
    }

    public  Map<Integer, ParkingSlot> getParkingSlotMap() {
        return parkingSlotMap;
    }

    public  void addParkingSlotMap(Integer ID, Integer floor, VehicleType vehicleType) {
        ParkingSlot parkingSlot = new ParkingSlot(ID, floor, vehicleType);
        parkingSlotMap.put(ID, parkingSlot);
    }

    public  void addVehicle(Integer ID, Integer vehicle) {
        ParkingSlot parkingSlot = parkingSlotMap.get(ID);
        parkingSlot.setVehicle(vehicle);
        parkingSlot.setEmpty(false);
    }

    public  void removeVehicle(Integer ID) {
        ParkingSlot parkingSlot = parkingSlotMap.get(ID);
        parkingSlot.setVehicle(null);
        parkingSlot.setEmpty(true);
    }

}
