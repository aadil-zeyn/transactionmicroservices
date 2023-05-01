package com.UST.Flightservices.dto;


import com.UST.Flightservices.entity.Passangerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAchnowledgement {
    private String Status;
    private double amount;
    private String pnrno;
    private Passangerinfo passangerinfo;
}
