package ru.debugger4o4.generateservercodeusingopenapigenerator.controller;

import org.openapitools.api.CustomerApi;
import org.openapitools.model.Customer;
import org.openapitools.model.CustomerFullData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.debugger4o4.generateservercodeusingopenapigenerator.service.CustomerService;

/**
 * Клиентский контроллер.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController implements CustomerApi {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<CustomerFullData> addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
