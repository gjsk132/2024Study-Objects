package Chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();
    
    public TicketOffice(Long amount, Ticket ... tickets){ // 가변 인수
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets)); // addAll?
    }

    public Ticket getTicket(){
        return tickets.remove(0);
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amLong){
        this.amount += amount;
    }

    public void sellTicketTo(Audience audience){
        plusAmount(audience.buy(getTicket()));
    }
}
