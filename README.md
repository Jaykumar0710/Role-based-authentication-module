# Role-Based Authentication System using Spring Boot & Spring Security

## Overview
This project demonstrates a **Role-Based Authentication System** built using **Spring Boot** and **Spring Security**. The system allows different user roles such as **Admin**, **Instructor**, and **Student** to access different sections of the application based on their roles.

### Key Features:
- Role-based access control (RBAC) for different users (Admin, Instructor, Student)
- Secure login and registration using Spring Security
- RESTful API endpoints for handling user authentication
- Thymeleaf for dynamic page rendering based on user roles
- Integration with a MySQL database for storing user data and roles

## User Roles:
1. **Admin**:
   - Full control over the system.
   - Can manage users, review submissions, and handle system configurations.
2. **Instructor**:
   - Can manage courses, submit reports, and evaluate students.
3. **Student**:
   - Can access course materials, submit assignments, and review feedback.

---

## Technologies Used:
- **Spring Boot** - Framework for building Java web applications.
- **Spring Security** - Security framework for authentication and authorization.
- **Thymeleaf** - Template engine for rendering dynamic content.
- **MySQL** - Relational database for user and role data storage.
- **Maven** - Dependency management and build tool.

---

## Prerequisites:
Ensure you have the following installed before starting the project:
- **Java 17+**
- **Maven 3.8+**
- **MySQL 8+**

---

## Setup Instructions:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Jaykumar0710/Role-based-authentication-module.git
   cd role-based-auth-system
   
2. **Application.properties**:
- spring.datasource.url=jdbc:mysql://localhost:3306/role_based_auth
- spring.datasource.username=your_username
- spring.datasource.password=your_password

