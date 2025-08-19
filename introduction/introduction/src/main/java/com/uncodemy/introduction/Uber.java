package com.uncodemy.introduction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cab.booking", havingValue="Uber")
public class Uber implements Cab  {

    @Override
    public void book(){
        String booking =" Uber Booked";
        System.out.println("Booking Status " +  booking);
    }

}
