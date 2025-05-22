package com.kavindu.hotelapplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Room_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Room_Type_ID")
    private int roomTypeID;

    @Column(name = "Type_Name",nullable = false)
    private String typeName;

    @Column(name = "Description",nullable = false)
    private String description;

    @NotNull
    @DecimalMin("10.00")
    @Column(name = "Base_Price", precision = 10, scale = 2)
    private BigDecimal base_Price;

    @OneToMany(mappedBy = "roomType")
    private Set<Room> rooms;
}
