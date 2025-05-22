package com.kavindu.hotelapplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Booking_ID")
    private Integer bookingId;

    @NotNull
    @Column(name = "Booking_Date", nullable = false)
    private LocalDate bookingDate;

    @NotNull
    @Column(name = "Check_in_Date", nullable = false)
    private LocalDate checkInDate;

    @NotNull
    @Column(name = "Check_out_Date", nullable = false)
    private LocalDate checkOutDate;

    @ManyToOne
    @JoinColumn(name = "Room_ID", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "Customer_ID", nullable = false)
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "Service_Booking",
            joinColumns = @JoinColumn(name = "Booking_ID"),
            inverseJoinColumns = @JoinColumn(name = "Service_ID")
    )
    private Set<Service> services = new HashSet<>();

}
