package com.squashedbuggames.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(FlightController.class)
public class SingleFlightTest {
    @Autowired
    MockMvc mvc;

    @Test
    public void testSingleFlight() throws Exception {
        this.mvc.perform(
                get("/flights/flight"))
                        //.accept(MediaType.APPLICATION_JSON)
                        //.contentType(MediaType.APPLICATION_JSON)
                        //.param("firstName", "YYYY-MM-DD"))

                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.tickets[0].price", is(200)));
    }
    /*
    @Test
    public void testMultiFlightObj() throws Exception {
        ObjectMapper newObj = new ObjectMapper();

        HashMap<String, Object> data = new HashMap<>();
        Ticket ticketOne = new Ticket(new Passenger("Bob", "Steve"));
        Ticket ticketTwo = new Ticket(new Passenger("Bob", "Steve"));
    }
*/
}