package com.cybertek.demo.services;

import com.cybertek.demo.interfaces.Course;
import com.cybertek.demo.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSessions extraSessions;
    @Value("${instructor}")
    private String instructorName;

    @Autowired
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {

    }
}
