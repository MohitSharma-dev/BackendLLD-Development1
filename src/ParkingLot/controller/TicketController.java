package ParkingLot.controller;

import ParkingLot.dto.IssueTicketRequestDTO;
import ParkingLot.dto.IssueTicketResponseDTO;
import ParkingLot.dto.ResponseStatus;
import ParkingLot.model.Ticket;
import ParkingLot.service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        try {

            Ticket ticket = ticketService.issueTicket(
                    request.getLicensePlate(),
                    request.getOwnerName(),
                    request.getVehicleType(),
                    request.getGateId(),
                    request.getParkingLotId()
            );

            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setTicketId(ticket.getId());
        } catch (Exception e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(e.getMessage());
        }
        return response;
//        response.setFloorNumber(ticket.getParkingSlot().get);
    }
}
