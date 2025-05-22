package com.kavindu.hotelapplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer_Phone {

    @EmbeddedId
    private CustomerPhoneId id;

    @ManyToOne
    @MapsId("customerId")
    @JoinColumn(name = "Customer_ID")
    private Customer customer;

}
