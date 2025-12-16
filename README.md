# Password Manager – Spring Boot

Webowa aplikacja do bezpiecznego przechowywania haseł z wykorzystaniem
szyfrowania oraz wieloskładnikowego uwierzytelniania (MFA).

Projekt został stworzony w celach edukacyjnych oraz jako element portfolio
(Java / Spring Boot / Security).

---

## Funkcjonalności

- Rejestracja i logowanie użytkownika
- Hasło główne (hashowane)
- Szyfrowanie haseł (AES)
- Multi-Factor Authentication (MFA)
- Generator bezpiecznych haseł
- Webowy interfejs (Thymeleaf)
- Baza danych (H2 – łatwa zmiana na PostgreSQL)
- Spring Security

---

## 🛠️ Technologie

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven

---

## Architektura
- **Controller** – obsługa żądań HTTP
- **Service** – logika biznesowa
- **Repository** – komunikacja z bazą danych
- **Entity** – mapowanie danych
- **Security** – konfiguracja uwierzytelniania

---

## Bezpieczeństwo

- Hashowanie haseł użytkowników
- Szyfrowanie zapisanych haseł (AES)
- MFA (kod jednorazowy)
- Ochrona endpointów przez Spring Security


