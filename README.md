# 🧑‍💼 Employee Management System (Spring Boot + MySQL)

A simple backend application to manage employees using Java, Spring Boot, and MySQL.  
It performs basic CRUD operations such as **Add, View, Update, and Delete** employee data.

---

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Hibernate
- REST API
- Postman
- Maven
- Git

---

## 📂 Project Features

- ✅ Add new employee
- ✅ Get all employees
- ✅ Get employee by ID
- ✅ Update employee details
- ✅ Delete employee

---

## 🗃️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE employee;
```

In `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📦 API Endpoints

| Method | Endpoint | Description |
|--------|--------------------|---------------------------|
| POST | `/addEmployee` | Add a new employee |
| GET | | View all employees |
| GET | `/{id}` | View employee by ID |
| PUT | `/editEmployee/{id}` | Update employee by ID |
| DELETE | `/deleteEmployee/{id}` | Delete employee by ID |

---

## 🧪 Testing with Postman

1. Start Spring Boot application
2. Use Postman to send requests to:  
   `http://localhost:8080/employee`

Example JSON for POST/PUT:
```json
{
  "name": "Bhavani",
  "email": "bhavani@gmail.com",
  "phone": "9876543210",
  "jobTitle": "Java Developer",
  "salary": 35000
}
```

---

## 📁 Folder Structure

```
src/
 └── main/
     ├── java/com/bhavani/employee
     │ ├── controller
     │ ├── model
     │ ├── repository
     │ ├── service
     │ └── EmployeeManagementApplication.java
     └── resources/
         └── application.properties
```

---

## 🙋‍♀️ Author

**Bhavani Lakshmi**  
[LinkedIn](https://www.linkedin.com/in/bhavanilakshmi23)  
[GitHub](https://github.com/bhavanilakshmi2001)

---

## 📌 Notes

This is a beginner-friendly Java + Spring Boot project designed to learn backend development, REST APIs, database operations, and API testing.
