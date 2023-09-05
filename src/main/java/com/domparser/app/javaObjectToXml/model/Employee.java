package com.domparser.app.javaObjectToXml.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Employee {

    int id;
    String Firstname;
    String Lastname;
    //hide the field using @XmlTransient
    @XmlTransient
    int Salary;

    ArrayList<String>list;


    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        Salary = salary;

    }
}
