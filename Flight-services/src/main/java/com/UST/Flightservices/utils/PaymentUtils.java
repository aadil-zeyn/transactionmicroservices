package com.UST.Flightservices.utils;

import com.UST.Flightservices.exception.InsufficientAmountException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PaymentUtils {

    private static Map<String,Double> paymentmap =new HashMap<>() ;
    static{
        paymentmap.put("acc1",20000.00);
        paymentmap.put("acc2",15000.00);
        paymentmap.put("acc3",56000.00);
        paymentmap.put("acc4",4000.00);
        paymentmap.put("acc5",25000.00);
        paymentmap.put("acc6",2100.00);
        paymentmap.put("acc7",10000.00);
        paymentmap.put("acc8",13000.00);

    }
    public static boolean validateCreditLimit(String accountNo, double fare) throws InsufficientAmountException  {
        if(fare>paymentmap.get(accountNo)){

            throw new InsufficientAmountException("input insufficient amount...........") ;

        }
        else
            return true;
    }
}
