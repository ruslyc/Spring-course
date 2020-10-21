package services;

import interfaces.Course;
import interfaces.ExtraSessions;

public class Java implements Course {

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions =extraSessions ;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: "+ (20+extraSessions.getHours()));
    }

}
