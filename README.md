# Password Manager – Spring Boot

A web-based password manager application built with **Spring Boot**, focused on
**security**, **encryption**, and **multi-factor authentication (MFA)**.

This project was created for educational purposes and as part of a personal
portfolio demonstrating secure application development in Java.

---

##  Features

- User authentication (login system)
- Master password hashing
- Encrypted password storage (AES)
- Multi-Factor Authentication (MFA)
- Secure password generator
- Web interface (Thymeleaf)
- Database integration (H2, easily switchable to PostgreSQL)
- Spring Security protection

---

##  Technologies Used

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven

---

##  Project Architecture

The application follows the **MVC (Model–View–Controller)** pattern:

- **Controller** – handles HTTP requests
- **Service** – business logic
- **Repository** – database access layer
- **Entity** – database models
- **Security** – authentication and authorization configuration

---

##  Security Overview

- Passwords are stored as cryptographic hashes
- Stored credentials are encrypted using AES
- MFA adds an extra security layer during login
- All sensitive endpoints are protected by Spring Security



