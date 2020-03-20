package com.galvanize.entities;


import java.sql.Timestamp;

public class ServiceTicket {
    int id;
    int customer_id;
    String technician;
    String status;
    Timestamp request_date;
    Timestamp appointment_date;


    public ServiceTicket(){};


    public ServiceTicket(int id, int customer_id, String technician, String status, Timestamp request_date, Timestamp appointment_date) {
        this.id = id;
        this.customer_id = customer_id;
        this.technician = technician;
        this.status = status;
        this.request_date = request_date;
        this.appointment_date = appointment_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    public Timestamp getRequest_date() {
        return request_date;
    }

    public void setRequest_date(Timestamp request_date) {
        this.request_date = request_date;
    }

    public Timestamp getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Timestamp appointment_date) {
        this.appointment_date = appointment_date;
    }


    @Override
    public String toString() {
        return "ServiceTicket{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", technician='" + technician + '\'' +
                ", status='" + status + '\'' +
                ", request_date=" + request_date +
                ", appointment_date=" + appointment_date +
                '}';
    }
}
