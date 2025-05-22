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
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Room_ID")
    private Integer roomId;

    @Column(name = "Room_Number", nullable = false, unique = true, length = 10)
    private String roomNumber;

    @Column(name = "Status", nullable = false, length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "Room_Type_ID", nullable = false)
    private Room_Type roomType;

}
