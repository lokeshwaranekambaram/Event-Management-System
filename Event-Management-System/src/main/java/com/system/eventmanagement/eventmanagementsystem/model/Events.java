package com.system.eventmanagement.eventmanagementsystem.model;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Events {
     @Id
     private int id;
     private String eventName;
     private String eventDescription;
     private String eventplace;
     private Time eventTime;
     private Date eventDate;


}
