package lld.parking_log.service;

import lld.parking_log.dto.Floor;
import lld.parking_log.dto.Parking;
import lld.parking_log.dto.ParkingSlot;
import lld.parking_log.dto.Ticket;
import lld.parking_log.enums.VehicleType;
import lld.parking_log.repo.*;
import lld.parking_log.utils.GetSlot;


public class ParkingLotService {
    ParkingRepo parkingRepo;
    FloorRepo floorRepo;
    ParkingSlotRepo parkingSlotRepo;
    VehicleRepo vehicleRepo;
    GetSlot getSlot;
    TicketRepo ticketRepo;

    public ParkingLotService(ParkingRepo parkingRepo,
                             FloorRepo floorRepo,
                             ParkingSlotRepo parkingSlotRepo,
                             VehicleRepo vehicleRepo,
                             TicketRepo ticketRepo) {
        this.parkingRepo = parkingRepo;
        this.floorRepo = floorRepo;
        this.parkingSlotRepo = parkingSlotRepo;
        this.vehicleRepo = vehicleRepo;
        this.getSlot = new GetSlot(parkingRepo, floorRepo, parkingSlotRepo);
        this.ticketRepo = ticketRepo;
    }

    public void create_parking_lot(Integer parking_lot_id, Integer number_of_floors, Integer no_of_slots_per_floor) {
        parkingRepo.addParkingMap(parking_lot_id);
        for (int i=1;i<=number_of_floors;i++) {
            floorRepo.addFloor(i, parking_lot_id);
            parkingRepo.addFloor(parking_lot_id, i);

            for(int j=1;j<=no_of_slots_per_floor;j++) {
                VehicleType vehicleType = VehicleType.CAR;
                if(j==1) {vehicleType = VehicleType.BIKE;}
                if (j<3) {vehicleType = VehicleType.TRUCK;}
                parkingSlotRepo.addParkingSlotMap(j, i, vehicleType);

                floorRepo.addSlot(i, j);
            }
        }
    }

    public Integer park_vehicle(Integer vehicleID, VehicleType vehicleType, String reg_no, String colour) {
        vehicleRepo.addVehicle(vehicleID, vehicleType, reg_no, colour);
        ParkingSlot parkingSlot = getSlot.execute();
        Integer floorId =  parkingSlot.getFloor();
        Floor floor = floorRepo.getFloorMap().get(floorId);
        Integer parkingId = floor.getParking();
        vehicleRepo.addParking(vehicleID, parkingSlot.getID(), parkingSlot.getFloor());
        parkingSlotRepo.addVehicle(parkingSlot.getID(), vehicleID);
        return ticketRepo.addTicket(parkingId, floorId, parkingSlot.getID(), vehicleID);
    }

    public void unpark_vehicle(Integer ticketId) {
        Ticket ticket = ticketRepo.getTicketMap().get(ticketId);
        Integer parkingId = ticket.getParking();
        ticketRepo.removeTicket(ticketId);
        vehicleRepo.removeParking(parkingId);
        parkingSlotRepo.removeVehicle(ticket.getParkingSlot());
    }
}
