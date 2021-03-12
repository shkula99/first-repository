package com.example.demo.model;
import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Location implements Serializable{

    
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
