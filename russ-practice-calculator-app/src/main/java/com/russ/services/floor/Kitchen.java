package com.russ.services.floor;

import com.russ.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Kitchen implements Floor {

    BigDecimal radius = new BigDecimal("7");

    @Override
    public BigDecimal getArea() {
       return radius.pow(2).multiply(new BigDecimal(Math.PI));
    }
}
