package com.galvanize.entities;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity (name = "ServiceTicket")

public class ServiceTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="customer_id", nullable = false)
    private Customer customer;
    private String problem;
    private String technician;
    private String status;
    @JsonFormat(pattern = "MM/dd/yyyy HH:mm")
    LocalDateTime request_date;
    LocalDateTime appointment_date;


    public ServiceTicket(){};


    public ServiceTicket(Long id, Customer customer, String problem, String technician, String status,
                         LocalDateTime request_date, LocalDateTime appointment_date) {
        this.id = id;
        this.customer = customer;
        this.problem = problem;
        this.technician = technician;
        this.status = status;
        this.request_date = request_date;
        this.appointment_date = appointment_date;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getRequest_date() {
        return request_date;
    }

    public void setRequest_date(LocalDateTime request_date) {
        this.request_date = request_date;
    }

    public LocalDateTime getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(LocalDateTime appointment_date) {
        this.appointment_date = appointment_date;
    }


    @Override
    public String toString() {
        return "ServiceTicket{" +
                "id=" + id +
                ", customer=" + customer +
                ", problem='" + problem + '\'' +
                ", technician='" + technician + '\'' +
                ", status='" + status + '\'' +
                ", request_date=" + request_date +
                ", appointment_date=" + appointment_date +
                '}';
    }
}

