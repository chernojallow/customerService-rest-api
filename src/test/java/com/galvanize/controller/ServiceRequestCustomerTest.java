package com.galvanize.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.dto.ServiceRequest;
import com.galvanize.entities.Customer;
import com.galvanize.entities.ServiceTicket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;



import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class ServiceRequestCustomerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    CustomerService service;
    ObjectMapper mapper = new ObjectMapper();


    private Customer customer;
    private ServiceTicket serviceTicket;

    String baseURL = "/api/service";



    private static final String PARAGRAPH = "Lorem ipsum dolor sit amet, consectetur " +
            "adipiscing elit. Minime id quidem, inquam, alienum, multumque ad ea, quae " +
            "quaerimus, explicatio tua ista profecerit. Duo Reges: constructio interrete. " +
            "Inde igitur, inquit, ordiendum est. Sic consequentibus vestris sublatis prima " +
            "tolluntur. Quae diligentissime contra Aristonem dicuntur a Chryippo. Cur igitur, " +
            "inquam, res tam dissimiles eodem nomine appellas? Hoc Hieronymus summum bonum esse" +
            " dixit.";


    @BeforeEach
    void setUp(){
        //Create a test customer
        customer = new Customer("test", "customer", "123 any street", "my city", "US", "12345", "469-478-8095");
        customerRepository.save(customer);
        assertNotNull(customer.getId());

        // Create a service ticket;

        serviceTicket = service.CreateServiceTicket(customer.getPhoneNumber(), "You can't five minutes", PARAGRAPH);
        assertNotNull(serviceTicket.getId());
    }

    @Test
    void CreateAndGetCustomer() throws  Exception{
        customer = new Customer("test", "customer", "123 any street", "my city", "US", "12345", "469-478-8095");

        String map = mapper.writeValueAsString(customer);

        mockMvc.perform(post(baseURL+ "/customer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(map))
                .andExpect(status().isOk())
                .andDo(print());

    }

}
