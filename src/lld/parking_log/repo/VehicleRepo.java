package lld.parking_log.repo;

import lld.parking_log.dto.Floor;
import lld.parking_log.dto.ParkingSlot;
import lld.parking_log.dto.Vehicle;
import lld.parking_log.enums.VehicleType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VehicleRepo {
     Map<Integer, Vehicle> vehicleMap;

    public VehicleRepo() {
        vehicleMap = new ConcurrentHashMap<>();
    }

    public  Map<Integer, Vehicle> getVehicleMap() {
        return vehicleMap;
    }

    public  void addVehicle(Integer ID, VehicleType vehicleType, String reg_no, String colour) {
        Vehicle vehicle = new Vehicle(ID, vehicleType, reg_no, colour);
        vehicleMap.put(ID, vehicle);
    }

    public  void addParking(Integer ID, Integer parkingSlot, Integer floor) {
        Vehicle vehicle = vehicleMap.get(ID);
        vehicle.setParkingSlot(parkingSlot);
        vehicle.setFloor(floor);
    }

    public  void removeParking(Integer ID) {
        Vehicle vehicle = vehicleMap.get(ID);
        vehicle.setParkingSlot(null);
        vehicle.setFloor(null);
    }

}
