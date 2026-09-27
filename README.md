# Student Management System

A Java Spring Boot based *Student Management System* that provides REST APIs to perform CRUD (Create, Read, Update, Delete) operations on student records. The application uses *MySQL* for database management and *Spring Data JPA/Hibernate* for database interaction.

## 👨‍💻 Author

*Arjun Sharma*

Java Backend Developer | Spring Boot | MySQL

## 🚀 Features

- Add a new student
- View all students
- View student by ID
- Update student details
- Delete a student
- RESTful API development
- MySQL database integration
- Spring Data JPA
- Hibernate ORM
- Layered architecture using Controller, Service, Repository, and Entity

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA
- Git & GitHub

## 📁 Project Structure

```text
Student Management System
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.studentmanagement
│   │   │       │
│   │   │       ├── controller
│   │   │       │   └── StudentController.java
│   │   │       │
│   │   │       ├── entity
│   │   │       │   └── Student.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │   └── StudentRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │   └── StudentService.java
│   │   │       │
│   │   │       └── StudentManagementApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── .gitignore
├── pom.xml
└── README.md
