package ParkingLot.repository;

import ParkingLot.model.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Integer , Ticket> tickets;
    private static int counter;
    public TicketRepository() {
        this.tickets = new TreeMap<>();
        counter = 0;
    }

    public Ticket save(Ticket ticket) {
        counter++;
        ticket.setId(counter);
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }
}
