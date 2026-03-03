# Student Management System (In Progress)

A backend REST API built using Spring Boot to manage student records using a clean layered architecture, DTO mapping, validation, and centralized exception handling.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 🏗️ Architecture

This project follows a layered architecture:

Controller → Service → Repository → Database

- **Controller Layer** – Handles HTTP requests and responses  
- **Service Layer** – Contains business logic  
- **Repository Layer** – Interacts with MySQL using Spring Data JPA  
- **DTO Layer** – Handles request and response data transfer  
- **Global Exception Handling** – Implemented using `@ControllerAdvice`

---

## 📌 Features Implemented

- Create Student
- Get Student by ID
- Get All Students
- Update Student
- Delete Student
- DTO ↔ Entity Mapping
- Request Validation using `@Valid`
- Centralized Exception Handling
- Proper RESTful API Design

---

## 📂 Project Structure

```
src/main/java/com/example/studentmanagement
│
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── mapper
```

---

## 📡 API Endpoints

### ➤ Create Student  
**POST** `/students`

```json
{
  "name": "Vinayak",
  "age": 22
}
```

---

### ➤ Get All Students  
**GET** `/students`

---

### ➤ Get Student by ID  
**GET** `/students/{id}`

---

### ➤ Update Student  
**PUT** `/students/{id}`

---

### ➤ Delete Student  
**DELETE** `/students/{id}`

---

## 🗄️ Database Configuration

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the application:

```
mvn spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

---

## 📈 Learning Outcomes

- Implemented Dependency Injection and Inversion of Control
- Built layered backend architecture
- Applied DTO mapping for clean API design
- Integrated MySQL using Spring Data JPA
- Implemented centralized exception handling

---

## 🛠️ Upcoming Improvements

- JWT Authentication
- Pagination & Sorting
- One-to-Many Relationships
- Swagger API Documentation
- Deployment

---

## 👨‍💻 Author

Vinayak Vishwakarma  
Backend Developer | Java | Spring Boot
