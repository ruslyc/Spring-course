package com.russ.interfaces.carpetPrices;

import com.russ.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getSqFtPrice(City city);
}
