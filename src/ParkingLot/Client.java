package ParkingLot;

import ParkingLot.controller.TicketController;
import ParkingLot.dto.IssueTicketRequestDTO;
import ParkingLot.dto.IssueTicketResponseDTO;
import ParkingLot.dto.ResponseStatus;
import ParkingLot.model.VehicleType;
import ParkingLot.repository.GateRepository;
import ParkingLot.repository.ParkingLotRepository;
import ParkingLot.repository.TicketRepository;
import ParkingLot.repository.VehicleRepository;
import ParkingLot.service.TicketService;

public class Client {
    public static void main(String[] args) {
//        Services, controllers, repos
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setParkingLotId(1);
        issueTicketRequestDTO.setGateId(1);
        issueTicketRequestDTO.setLicensePlate("DL 1VC");
        issueTicketRequestDTO.setOwnerName("Mohit");
        issueTicketRequestDTO.setVehicleType(VehicleType.TWO_WHEELER);

        IssueTicketResponseDTO response = ticketController.issueTicket(issueTicketRequestDTO);
        if(response.getResponseStatus() == ResponseStatus.FAILURE){
            System.out.println(response.getFailureMessage());
        } else if(response.getResponseStatus() == ResponseStatus.SUCCESS){
            System.out.println("Ticket successfully generated." + "Slot : " + response.getSlotNumber());
        }
    }
}

// HW  : re-do everything from scratch
// Add dummy data
// Test the issueTicket

// Implement generateBill

// controller -> service -> repos

// Generating the ticket

// Client : ticket
    // Controller : TicketController


// Generating the Bill
