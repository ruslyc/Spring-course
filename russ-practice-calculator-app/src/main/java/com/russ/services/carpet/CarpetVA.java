package com.russ.services.carpet;

import com.russ.enums.City;
import com.russ.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(City.MCLEAN, new BigDecimal("3.42"));
        sqPriceForCity.put(City.DC, new BigDecimal("3.62"));
        sqPriceForCity.put(City.FAIRFAX, new BigDecimal("4.42"));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;
        Optional<Map.Entry<City, BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();
        return collect.isPresent()? collect.get().getValue() : defaultValue;
    }
}
