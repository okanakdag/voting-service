package com.okanakdag.votingservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private LocalDateTime deadline;

    private LocalDateTime createdAt;
}