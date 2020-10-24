package services;

import interfaces.Course;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //Constructor Injection
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }


    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    //Setter Injection
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Autowired
    private OfficeHours officeHours;
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30 + officeHours.getHours()));
    }

}
