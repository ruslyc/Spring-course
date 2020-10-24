package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class Java implements Course {
ExtraSessions extraSessions;
    @Value("Batch10")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    public Java(String batch, String instructor, String[] days) {
        this.batch = batch;
        this.instructor = instructor;
        this.days = days;
    }


    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + extraSessions.getHours() ));
    }


}
