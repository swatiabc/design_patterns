package lld.parking_log.repo;

import lld.parking_log.dto.Floor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FloorRepo {
     Map<Integer, Floor> floorMap;

    public FloorRepo() {
        floorMap = new ConcurrentHashMap<>();
    }

    public  Map<Integer, Floor> getFloorMap() {
        return floorMap;
    }

    public void addFloor(Integer ID, Integer parking) {
        Floor floor = new Floor(ID, parking);
        floorMap.put(ID, floor);
    }

    public  void addSlot(Integer ID, Integer parkingSlot) {
        Floor floor = floorMap.get(ID);
        floor.getParkingSlotList().add(parkingSlot);
    }
}
