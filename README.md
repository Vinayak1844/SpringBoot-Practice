# Student Management System - Spring Boot

A backend REST API built using **Spring Boot** to manage student records.
The project demonstrates clean **layered architecture**, **DTO-based API design**, **request validation**, and **centralized exception handling**.

---

## 🚀 Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

---

## 📌 Features

* Create Student
* Get Student by ID
* Get All Students
* Update Student
* Delete Student
* DTO ↔ Entity Mapping
* Request Validation using `@Valid`
* Centralized Exception Handling using `@ControllerAdvice`
* Clean Layered Architecture (Controller → Service → Repository)

---

## 🏗️ Architecture

The application follows a **layered backend architecture** commonly used in enterprise Spring Boot applications.

Controller → Service → Repository → Database

### Controller Layer

Handles HTTP requests and exposes REST API endpoints.

### Service Layer

Contains business logic and application processing.

### Repository Layer

Communicates with the database using **Spring Data JPA**.

### DTO Layer

Separates internal entities from API request/response objects.

### Configuration Layer

Contains configuration classes such as CORS setup or application-level settings.

### Exception Handling

Global exception handling implemented using `@ControllerAdvice`.

---

## 📂 Project Structure

```
src/main/java/com/example/studentmanagement

controller      → REST API endpoints
service         → Business logic
repository      → Database interaction
entity          → JPA entities
dto             → Request / Response models
mapper          → DTO ↔ Entity mapping
exception       → Global exception handling
config          → Application configuration classes
```

---

## 📡 API Endpoints

Base URL

```
http://localhost:8080/students
```

### Create Student

POST `/students`

Request Body

```json
{
  "name": "Vinayak",
  "age": 22
}
```

### Get All Students

GET `/students`

### Get Student by ID

GET `/students/{id}`

### Update Student

PUT `/students/{id}`

### Delete Student

DELETE `/students/{id}`

---

## 🗄️ Database Configuration

Update `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Running the Application

Clone the repository

```
git clone https://github.com/Vinayak1844/SpringBoot-Practice
```

Navigate to the project directory

```
cd SpringBoot-Practice
```

Run the application

```
mvn spring-boot:run
```

Application starts at

```
http://localhost:8080
```

---

## 📈 Learning Outcomes

Through this project I practiced:

* Spring Boot REST API development
* Dependency Injection and Inversion of Control
* Layered backend architecture
* DTO-based API design
* Spring Data JPA integration with MySQL
* Global exception handling in REST APIs

---

## 🔧 Future Improvements

* JWT Authentication
* Pagination & Sorting
* One-to-Many Relationships
* Swagger API Documentation
* Docker Deployment

---

## 👨‍💻 Author

Vinayak Vishwakarma
Backend Developer | Java | Spring Boot

GitHub
https://github.com/Vinayak1844
