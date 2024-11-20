package lld.parking_log.utils;

import lld.parking_log.dto.Floor;
import lld.parking_log.dto.Parking;
import lld.parking_log.dto.ParkingSlot;
import lld.parking_log.repo.FloorRepo;
import lld.parking_log.repo.ParkingRepo;
import lld.parking_log.repo.ParkingSlotRepo;

import java.util.ArrayList;
import java.util.Map;

public class GetSlot {
    ParkingRepo parkingRepo;
    FloorRepo floorRepo;
    ParkingSlotRepo parkingSlotRepo;

    public GetSlot(
            ParkingRepo parkingRepo,
            FloorRepo floorRepo,
            ParkingSlotRepo parkingSlotRepo
    ) {
        this.parkingRepo = parkingRepo;
        this.floorRepo = floorRepo;
        this.parkingSlotRepo = parkingSlotRepo;
    }

    public ParkingSlot execute() {
        Map<Integer, Parking> parkingMap = parkingRepo.getParkingMap();
        Map<Integer, Floor> floorMap = floorRepo.getFloorMap();
        Map<Integer, ParkingSlot> parkingSlotMap = parkingSlotRepo.getParkingSlotMap();

        ParkingSlot emptyParkingSlot=null;

        for(Parking parking: parkingMap.values()) {
            ArrayList<Integer> floorIds = parking.getFloorList();

            for(Integer floorId: floorIds) {
                Floor floor = floorMap.get(floorId);

                ArrayList<Integer> parkingSlotIds = floor.getParkingSlotList();

                for(Integer parkingSlotId: parkingSlotIds) {
                    ParkingSlot parkingSlot = parkingSlotMap.get(parkingSlotId);
                    if(parkingSlot.getEmpty()) {
                        emptyParkingSlot = parkingSlot;
                        break;
                    }
                }
            }
        }

        return emptyParkingSlot;
    }
}
