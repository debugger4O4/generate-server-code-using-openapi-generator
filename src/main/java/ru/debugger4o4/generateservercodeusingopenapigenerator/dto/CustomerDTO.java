package ru.debugger4o4.generateservercodeusingopenapigenerator.dto;

/**
 * Клиент. Класс для обмена данными.
 */
public class CustomerDTO {
    private Long customerId;
    private String firstName;
    private String lastName;

    public CustomerDTO() {}

    public CustomerDTO(Long customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
