package lld.parking_log.repo;

import lld.parking_log.dto.Floor;
import lld.parking_log.dto.Parking;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingRepo {
     Map<Integer, Parking> parkingMap;

    public ParkingRepo() {
        parkingMap = new ConcurrentHashMap<>();
    }

    public  Map<Integer, Parking> getParkingMap() {
        return parkingMap;
    }

    public void addParkingMap(Integer ID) {
        Parking parking = new Parking(ID);
        parkingMap.put(ID, parking);
    }

    public void addFloor(Integer ID, Integer floorId) {
        Parking parking = parkingMap.get(ID);
        parking.getFloorList().add(floorId);
    }

}
