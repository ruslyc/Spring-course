package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

//    @Autowired
//    @Qualifier("mockInterviewHours")
    private ExtraSessions extraSessions;

    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30 + extraSessions.getHours()));
    }

}
