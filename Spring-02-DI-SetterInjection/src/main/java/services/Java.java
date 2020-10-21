package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import lombok.Data;
@Data
public class Java implements Course {

    ExtraSessions extraSessions;
//    public ExtraSessions getExtraSessions() {
//        return extraSessions;
//    }
//
//    public void setExtraSessions(ExtraSessions extraSessions) {
//        this.extraSessions = extraSessions;
//    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: "+ (20+extraSessions.getHours()));
    }

}
