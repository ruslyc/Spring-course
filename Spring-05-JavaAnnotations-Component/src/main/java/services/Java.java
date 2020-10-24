package services;

import interfaces.Course;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20");
    }

    public void myInitMethod(){
        System.out.println("Executing my init  method");
    }

    public void myDestroyMethod(){
        System.out.println("Executing my destroy  method");
    }

}
