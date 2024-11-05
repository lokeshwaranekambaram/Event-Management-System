package com.system.eventmanagement.eventmanagementsystem.model;

import java.sql.Time;
import java.util.Date;

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
     public int getId() {
          return id;
     }
     public void setId(int id) {
          this.id = id;
     }
     public String getEventName() {
          return eventName;
     }
     public void setEventName(String eventName) {
          this.eventName = eventName;
     }
     public String getEventDescription() {
          return eventDescription;
     }
     public void setEventDescription(String eventDescription) {
          this.eventDescription = eventDescription;
     }
     public String getEventplace() {
          return eventplace;
     }
     public void setEventplace(String eventplace) {
          this.eventplace = eventplace;
     }
     public Time getEventTime() {
          return eventTime;
     }
     public void setEventTime(Time eventTime) {
          this.eventTime = eventTime;
     }
     public Date getEventDate() {
          return eventDate;
     }
     public void setEventDate(Date eventDate) {
          this.eventDate = eventDate;
     }
     public Events(int id, String eventName, String eventDescription, String eventplace, Time eventTime,
               Date eventDate) {
          this.id = id;
          this.eventName = eventName;
          this.eventDescription = eventDescription;
          this.eventplace = eventplace;
          this.eventTime = eventTime;
          this.eventDate = eventDate;
     }


}
