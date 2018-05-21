/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.domain.message;

import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import org.hibernate.validator.constraints.Email;

import org.hibernate.validator.constraints.NotEmpty;



public class Message {
  
    @NotEmpty
    @Size(min = 3, message = "Name must be more than 3 symbols")
    private String name;
    
    @NotEmpty
    @Email
    private String email;
    
    @NotEmpty
    @Size(min = 5, message = "Subject must be more than {min} symbols")
    private String subject;
    
    @NotEmpty
    @Size(min = 15, message = "Message must be more than {min} symbols")
    private String message;
       
    @Min(value = 4, message = "2+2=?")
    @Max(value = 4, message = "10-6=?")     
    private int test;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

        public Message(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    
    public Message(String name, String email, String subject, String message, int test) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.test = test;
    }


    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Message{" + "name=" + name + ", email=" + email + ", subject=" + subject + ", message=" + message + ", test=" + test + '}';
    }

  
}
