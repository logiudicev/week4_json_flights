package com.squashedbuggames.json;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class FlightController {

    @GetMapping("/flights/flight")
    public Flight getFlight(){
        Passenger newPassenger = new Passenger("Dwayne", "Johnson");
        Ticket newTicket = new Ticket(newPassenger, 200);
        List<Ticket> ticketList = List.of(newTicket);
        Flight newFlight = new Flight(ticketList, new Date());
        return newFlight;
    }
    @JsonFormat
    @GetMapping("/flights")
    public List<Flight> getFlights(){
        //first flight
        Passenger newPassenger = new Passenger("Dude", null);
        Ticket newTicket = new Ticket(newPassenger, 200);
        List<Ticket> ticketList = List.of(newTicket);
        List <Flight> flightsList = new ArrayList<Flight>();
        Flight newFlight = new Flight(ticketList, new Date());
        flightsList.add(newFlight);

        //second flight
        Passenger newPassenger2 = new Passenger("George", "Jennings");
        Ticket newTicket2 = new Ticket(newPassenger2, 100000);
        List<Ticket> ticketList2 = List.of(newTicket2);
        //List <Flight> flightsList = new ArrayList<Flight>();
        Flight newFlight2 = new Flight(ticketList2, new Date());
        flightsList.add(newFlight2);
        return flightsList;
    }
    @GetMapping("/flights/set")
    public List<Flight> setFlights(Flight newFlight){




        //Flight newFlight = new Flight(ticketList, new Date());
        setFlights(newFlight);

        return setFlights(newFlight);
    }
    /*
    @PostMapping("/flights/tickets/total")
    public HashMap<String, Integer> getTicketTotal(@RequestBody Flight flight){
        List<Ticket> tickets = flight.getTickets();
        HashMap<String, Integer> result = new HashMap<>();
        int total = 0;

        for (Ticket ticket: tickets){
            total += ticket.getPrice();
        };

        result.put("result", total);

        return result;


    }
    //@PostMapping("/flights/tickets/total")
    //public HashMap<String, Integer> getTicketTotals(@RequestBody Flight flight){
        //System.out.println(flight.toString());
        //return flight.getTotal();
    //}
*/
}

