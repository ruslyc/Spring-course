package com.russ.services.floor;

import com.russ.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LivingRoom implements Floor {

    BigDecimal width = new BigDecimal("5");

    BigDecimal length =  new BigDecimal("10");

    @Override
    public BigDecimal getArea() {
        return width.multiply(length);
    }
}
