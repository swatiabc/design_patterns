package lld.parking_log.repo;

import lld.parking_log.dto.Ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketRepo {
     Map<Integer, Ticket> ticketMap;
     static Integer pk=0;

    public TicketRepo() {
        ticketMap = new ConcurrentHashMap<>();
    }

    public  Map<Integer, Ticket> getTicketMap() {
        return ticketMap;
    }

    public Integer addTicket(Integer parking, Integer floor, Integer parkingSlot, Integer vehicle) {
        pk += 1;
        Integer ID = pk;
        Ticket ticket = new Ticket(ID, parking, floor, parkingSlot, vehicle);
        ticketMap.put(ID, ticket);
        System.out.println("add ticket "+ ID+" : "+pk);
        return ID;
    }

    public  void removeTicket(Integer ID) {
        Ticket ticket = ticketMap.get(ID);
        ticket.setActive(false);
    }

}
