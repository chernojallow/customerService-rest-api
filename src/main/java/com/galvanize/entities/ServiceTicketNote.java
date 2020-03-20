package com.galvanize.entities;

import java.sql.Timestamp;

public class ServiceTicketNote {

    int id;
    int serviceTicket_id;
    String note;
    Timestamp created_at;

    public  ServiceTicketNote(){};

    public ServiceTicketNote(int id, int serviceTicket_id, String note, Timestamp created_at) {
        this.id = id;
        this.serviceTicket_id = serviceTicket_id;
        this.note = note;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceTicket_id() {
        return serviceTicket_id;
    }

    public void setServiceTicket_id(int serviceTicket_id) {
        this.serviceTicket_id = serviceTicket_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }


    @Override
    public String toString() {
        return "ServiceTicketNote{" +
                "id=" + id +
                ", serviceTicket_id=" + serviceTicket_id +
                ", note='" + note + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
