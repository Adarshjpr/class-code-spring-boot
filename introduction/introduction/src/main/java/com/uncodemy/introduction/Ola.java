package com.uncodemy.introduction;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cab.booking", havingValue ="Ola")

public class Ola  implements Cab {

    @Override
    public void book(){
        String booking ="ola cab Booked";
        System.out.println("Booking Status " +  booking);
    }


}
