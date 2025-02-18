package ParkingLOT.model;

import java.util.Date;

public class Ticket {
    int ticketId;
    Gate entryGate;
    Date entryDateTime;
    Gate exitGate;
    Date exitDateTime;
    Vehicle vehicle;
    User user;
}
