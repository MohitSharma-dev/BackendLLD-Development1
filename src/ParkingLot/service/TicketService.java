package ParkingLot.service;

import ParkingLot.model.*;
import ParkingLot.repository.GateRepository;
import ParkingLot.repository.ParkingLotRepository;
import ParkingLot.repository.TicketRepository;
import ParkingLot.repository.VehicleRepository;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TicketRepository ticketRepository
    ) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
            String licensePlate,
            String ownerName,
            VehicleType vehicleType,
            int gateId,
            int parkingLotId
    ) {
//        think about the logic here
//      1. Corresponding to the gateId , we should first get the Gate Object
          Optional<Gate> gateOptional = gateRepository.findById(gateId);
          if(gateOptional.isEmpty()) {
              throw new RuntimeException("Gate Not Found.");
          }
          Gate gate = gateOptional.get();
//        Services don't directly talk to db
//        Talk via repos


//      2. Validate and store vehicle in the db => Vehicle Object
           Optional<Vehicle> vehicleOptional = vehicleRepository.findByLicensePlate(licensePlate);
            Vehicle vehicle = null;
           if(vehicleOptional.isEmpty()) {
//               we should save this vehicle in db
                vehicle = new Vehicle(licensePlate , ownerName , vehicleType);
                vehicle = vehicleRepository.save(vehicle);
           } else {
               vehicle = vehicleOptional.get();
           }
//      3. Assign the Slot : Assume that you have a strategy
//        we need parkingLot object
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findById(parkingLotId);
           ParkingLot parkingLot = null;
           if(parkingLotOptional.isEmpty()) {
               throw new RuntimeException("Parking Lot Not Found.");
           }
           parkingLot = parkingLotOptional.get();

           ParkingSlot parkingSlot = parkingLot
                   .getSlotAssignmentStrategy()
                   .assignSlot(parkingLot , vehicleType);
//      4.  return Ticket
        Ticket ticket = new Ticket();
        ticket.setEntryGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(parkingSlot);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime(new Date());

//        we need to save the ticket also
        return ticketRepository.save(ticket);
    }
}

// strategies
// repositories

// Models
// add any other field you want
// add constructors, getters and setters


// feature : multiple different ways : Strategy
// Assign Slot ?
// Fare Calculation : multiple ways ?


// issueTicket
// Vehicle Details + Gate => Slot

// Parking Lot : Vehicle details => source of income