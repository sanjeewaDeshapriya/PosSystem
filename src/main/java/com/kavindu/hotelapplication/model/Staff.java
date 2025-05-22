package com.kavindu.hotelapplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Staff_ID")
    private Integer staffId;

    @Column(name = "Name",
            nullable = false,
            length = 100)
    private String name;

    @Column(name = "Role",
            nullable = false,
            length = 50)
    private String role;

    @Column(name = "Phone",
            nullable = false,
            length = 15)
    private String phone;

    @Column(name = "Email",
            nullable = false,
            length = 100)
    private String email;


    @ManyToOne
    @JoinColumn(name = "Service_ID")
    private Service service;

}
