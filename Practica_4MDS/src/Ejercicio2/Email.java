/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Date;

/**
 *
 * @author elias
 */
public class Email {
    private String from;
    private String subject;
    private Date date;
    private Priority priority;
    private String text;

    public Email(String from, String subject, Date date, Priority priority, String text) {
        this.from = from;
        this.subject = subject;
        this.date = date;
        this.priority = priority;
        this.text = text;
    }
    
    
    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString(){
        String str="";
        str+="FROM: "+from+"\n";
        str+="TO: "+subject+"\n";
        str+="DATE: "+date+"\n";
        str+="PRIORITY: "+priority.getPrioridad()+"\n";
        str+="TEXT: "+text+"\n";
        return str;
    }
    
}
