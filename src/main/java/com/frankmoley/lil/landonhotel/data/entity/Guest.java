package com.frankmoley.lil.landonhotel.data.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Entity
@Table (name = "guests")
@Data
@ToString

public class Guest {
    @Id
    @Column(name="guest_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_address")
    private String emailAddres;
    @Column(name = "address")
    private String addres;
    @Column(name = "country")
    private String country;
    @Column(name = "state")
    private String state;
    @Column(name = "phone_number")
    private String phoneNumber;

}
