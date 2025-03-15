package ru.debugger4o4.generateservercodeusingopenapigenerator.service;

import org.openapitools.model.Customer;
import org.openapitools.model.CustomerFullData;
import org.springframework.http.ResponseEntity;

public interface CustomerService {

    ResponseEntity<CustomerFullData> addCustomer(Customer customer);
}
