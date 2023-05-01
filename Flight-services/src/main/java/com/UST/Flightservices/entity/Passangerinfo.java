package com.UST.Flightservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="passenger_table")
public class Passangerinfo {
    @Id
    @GeneratedValue
    private Long pID;
    private String name;
    private String email;
    private String destination;
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;


}
