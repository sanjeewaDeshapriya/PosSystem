package com.kavindu.hotelapplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Service_ID;

    @NotNull
    private String Service_name;

    @NotNull
    @DecimalMin("10.00")
    @Column(name = "Price", precision = 10, scale = 2)
    private BigDecimal price;

    @ManyToMany(mappedBy = "services")
    private Set<Booking> bookings = new HashSet<>();

}
