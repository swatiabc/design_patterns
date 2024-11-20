package lld.parking_log;

import lld.parking_log.enums.VehicleType;
import lld.parking_log.repo.*;
import lld.parking_log.service.ParkingLotService;

public class Client {
    public static void main(String[] args) {
        ParkingRepo parkingRepo = new ParkingRepo();
        FloorRepo floorRepo = new FloorRepo();
        ParkingSlotRepo parkingSlotRepo = new ParkingSlotRepo();
        TicketRepo ticketRepo = new TicketRepo();
        VehicleRepo vehicleRepo = new VehicleRepo();

        ParkingLotService parkingLotService = new ParkingLotService(parkingRepo,
                floorRepo,
                parkingSlotRepo,
                vehicleRepo,
                ticketRepo);
        parkingLotService.create_parking_lot(1, 4, 3);

        System.out.println(parkingRepo.getParkingMap());
        System.out.println(floorRepo.getFloorMap());
        System.out.println(parkingSlotRepo.getParkingSlotMap());

        Integer ticketId = parkingLotService.park_vehicle(1, VehicleType.CAR, "1234", "red");
        System.out.println(ticketId);

        Integer ticketId2 = parkingLotService.park_vehicle(2, VehicleType.CAR, "1234", "red");
        System.out.println(ticketId2);

        System.out.println(parkingRepo.getParkingMap());
        System.out.println(floorRepo.getFloorMap());
        System.out.println(parkingSlotRepo.getParkingSlotMap());
        System.out.println(ticketRepo.getTicketMap());

        parkingLotService.unpark_vehicle(1);
        System.out.println(ticketRepo.getTicketMap());



    }
}
