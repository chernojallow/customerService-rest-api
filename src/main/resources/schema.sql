DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
    id           INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    address   VARCHAR(50) NOT NULL,
    phone_number    VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);
DROP TABLE IF EXISTS service_ticket;
CREATE TABLE service_ticket (
    id           INTEGER NOT NULL AUTO_INCREMENT,
    customer_id  INTEGER NOT NULL,
    description VARCHAR(20) NOT NULL,
    technician   VARCHAR(50) NOT NULL,
    status    VARCHAR(50) NOT NULL,
    request_date TIMESTAMP,
    appointment_date: TIMESTAMP
    PRIMARY KEY (id)
);
DROP TABLE IF EXISTS service_ticket_note;
CREATE TABLE service_ticket_note (
    id  INTEGER NOT NULL AUTO_INCREMENT,
    service_ticket_id  INTEGER NOT NULL,
    note VARCHAR(20) NOT NULL,
    created_at: TIMESTAMP,
    PRIMARY KEY (id)
);