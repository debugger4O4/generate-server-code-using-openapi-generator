package ru.debugger4o4.generateservercodeusingopenapigenerator.service.impl;

import org.openapitools.model.Customer;
import org.openapitools.model.CustomerFullData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.debugger4o4.generateservercodeusingopenapigenerator.dto.CustomerDTO;
import ru.debugger4o4.generateservercodeusingopenapigenerator.service.CustomerService;

import java.util.HashMap;
import java.util.Map;

/**
 * Клиентский сервис.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final Map<Long, CustomerDTO> customers = new HashMap<>();
    private Long index = 0L;


    public ResponseEntity<CustomerFullData> addCustomer(Customer apiCustomer) {
        CustomerDTO customer = new CustomerDTO();
        customer.setCustomerId(index);
        customer.setFirstName(apiCustomer.getFirstName());
        customer.setLastName(apiCustomer.getLastName());
        customers.put(++index, customer);
        return ResponseEntity.ok(dtoToApi(customer));
    }

    private CustomerFullData dtoToApi(CustomerDTO customerDTO) {
        CustomerFullData cfd = new CustomerFullData();
        cfd.setCustomerId(customerDTO.getCustomerId());
        cfd.setFirstName(customerDTO.getFirstName());
        cfd.setLastName(customerDTO.getLastName());
        return cfd;
    }
}
