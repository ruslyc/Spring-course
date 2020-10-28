package com.cybertek.demo.services;

import com.cybertek.demo.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 5;
    }
}
