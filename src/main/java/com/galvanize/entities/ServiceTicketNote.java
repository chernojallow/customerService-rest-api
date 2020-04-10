package com.galvanize.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "ServiceTicketNote")
public class ServiceTicketNote {

  @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

  @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name ="ticket_id", nullable = false)
    ServiceTicket serviceTicket;

    @Column(columnDefinition = "LONGTEXT")
    String note;
    @JsonFormat(pattern = "MM/dd/yyyy HH:mm")
    LocalDateTime created_at;
//    LocalDateTime createdAt = LocalDateTime.now();


    public  ServiceTicketNote(){};

    public ServiceTicketNote(Long id, ServiceTicket serviceTicket, String note, LocalDateTime created_at) {
        this.id = id;
        this.serviceTicket = serviceTicket;
        this.note = note;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ServiceTicket getServiceTicket() {
        return serviceTicket;
    }

    public void setServiceTicket(ServiceTicket serviceTicket) {
        this.serviceTicket = serviceTicket;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }


    @Override
    public String toString() {
        return "ServiceTicketNote{" +
                "id=" + id +
                ", serviceTicket=" + serviceTicket +
                ", note='" + note + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
