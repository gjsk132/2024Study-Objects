package Chap01;

public class TicketSeller {
    private TicketOffice ticketOffice;

    private TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }
}
