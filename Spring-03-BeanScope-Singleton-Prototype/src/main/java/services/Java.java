package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20");
    }

}
