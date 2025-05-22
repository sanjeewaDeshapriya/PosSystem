package com.kavindu.hotelapplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Feedback_ID")
    private Integer feedbackId;

    @NotNull
    @Column(name = "Feedback_Type", nullable = false, length = 50)
    private String feedbackType;

    @NotNull
    @Min(1)
    @Max(5)
    @Column(name = "Rating", nullable = false)
    private Integer rating;

    @Column(name = "Comments",nullable = false)
    private String comments;

    @NotNull
    @Column(name = "Submitted_Date", nullable = false)
    private LocalDate submittedDate;

    @ManyToOne
    @JoinColumn(name = "Booking_ID", nullable = false)
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "Customer_ID", nullable = false)
    private Customer customer;}
