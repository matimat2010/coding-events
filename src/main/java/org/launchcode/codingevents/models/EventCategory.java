package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventCategory {
@Id
@GeneratedValue
private int id;
private String name;

    public EventCategory(String name) {
      this.name = name;
    }

    public EventCategory(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}




//    An id field of type int.
//        A name field of type String.
//        A constructor.
//        The appropriate getters and setters.
//
//        EventCategory represents data that will be stored in our database, so you need to use the @Entity annotation!
