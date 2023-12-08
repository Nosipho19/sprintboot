package com.example.demo.Models;

import lombok.AllArgsConstructor;
import lombok.builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;


import javax.persistence. *;

@builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees")

public class Employee{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

@Column (name= "first_name")
    private String firstName;

@Column (name = "last_name")
    private String lastName;

@Column (name= "email")
    private String email;

CreationTimestamp
    @Column (updatable = false)
    Timestamp dataCreated;

@UpdateTimestamp
    Timestamp lastModified;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}