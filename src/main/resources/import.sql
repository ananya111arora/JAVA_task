create table doctor
(
    name         varchar(255) not null,
    city         varchar(255) not null,
    email        varchar(255) not null,
    phone_number varchar(255) not null,
    speciality   varchar(255) not null
);
INSERT INTO doctor (name, city, email, phone_number, speciality) VALUES ('Dr. Smith', 'Delhi', 'smith@example.com', '1234567890', 'Orthopaedic');
INSERT INTO doctor (name, city, email, phone_number, speciality) VALUES ('Dr. Jane', 'Noida', 'jane@example.com', '0987654321', 'Gynecology');