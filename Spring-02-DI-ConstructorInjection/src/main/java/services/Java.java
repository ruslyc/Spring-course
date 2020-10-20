package services;

import interfaces.Course;

public class Java implements Course {

    OfficeHours officeHours;

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20" + officeHours.getHours());
    }

}
