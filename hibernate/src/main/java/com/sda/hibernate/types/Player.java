package com.sda.hibernate.types;

// entity requirements

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

// entity and table mapping
@Entity(name = "Player")
@Table(name = "player")
public class Player {

    // id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // string
    private String username;

    // temporal
    @Column(name = "registration_date")
    private LocalDate registrationDate;

    // primitive
    private int age;

    // enum
    @Enumerated(EnumType.STRING)
    private Status status;

    // embedded
    @Embedded
    private Address address;

    // mandatory

    public Player() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Player{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", registrationDate=" + registrationDate +
            ", age=" + age +
            ", status=" + status +
            ", address=" + address +
            '}';
    }
}
