package com.UST.Flightservices.service;

import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAchnowledgement;
import com.UST.Flightservices.entity.Passangerinfo;
import com.UST.Flightservices.entity.Paymentinfo;
import com.UST.Flightservices.exception.InsufficientAmountException;
import com.UST.Flightservices.repo.Passangerrepo;
import com.UST.Flightservices.repo.Paymentrepo;
import com.UST.Flightservices.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private Passangerrepo passangerrepo;
    @Autowired
    private Paymentrepo paymentrepo;
    @Transactional
    public FlightBookingAchnowledgement bookingAcknowledgement(BookingRequest request) throws InsufficientAmountException {
        Passangerinfo passangerinfo =request.getPassangerinfo();
        passangerinfo=passangerrepo.save(passangerinfo);
        Paymentinfo paymentinfo=request.getPaymentinfo();

        PaymentUtils.validateCreditLimit(paymentinfo.getAccountNo(),passangerinfo.getFare());
        paymentinfo.setPassengerId(passangerinfo.getPID());
        paymentinfo.setAmount(passangerinfo.getFare());
        paymentrepo.save(paymentinfo);
        return new FlightBookingAchnowledgement("success",passangerinfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],passangerinfo);
    }
}
