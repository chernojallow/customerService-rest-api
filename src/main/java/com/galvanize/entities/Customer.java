package com.galvanize.entities;

import javax.persistence.*;

@Entity(name = "customers")
public class Customer {

    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
     @Column(name= "first_name")
    String first;
     @Column (name = "Last_name")
     String last;
     @Column(length = 50)
    String address;
     @Column(length = 25)
     String city;
     @Column(length = 2)
     String state;
     @Column (length = 5)
     String zipcode;
     @Column(unique = true)
    String phoneNumber;
     @Column (name = "description")
    String description;


    public Customer() {
    }



    public Customer ( String first, String last, String address,
                     String city, String state, String zipcode, String phoneNumber) {

        this.id = id;
        this.first = first;
        this.last = last;
        this.address = address;
        this.city = city;
        this.state = state;
        this. zipcode = zipcode;
        this.phoneNumber = phoneNumber;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", phoneNumber=" + phoneNumber +
                ", description='" + description + '\'' +
                '}';
    }


}
