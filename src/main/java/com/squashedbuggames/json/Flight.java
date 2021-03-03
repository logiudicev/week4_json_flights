package com.squashedbuggames.json;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Flight {

    public Flight(List<Ticket> ticketList, Date date) {
        this.tickets = ticketList;
        this.departs = date;


    }

    //Top most
    //Departs-java.util.Date
    //Tickets-List of some type(passenger)

    // Setter to load tickets in
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    //Setter to set Departures by date
    public void setDeparts(Date departs) {
        this.departs = departs;
    }

    //initialize tickets from Ticket class
    private List<Ticket> tickets;

    //Getter from ticket class to get Tickets
    public List<Ticket> getTickets() {
        return tickets;
    }
    //Getter for Date
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getDeparts() {
        return departs;
    }

    private Date departs;

    //public HashMap<String, Integer> getTotal(){
        //List<Ticket>
    //}

}
