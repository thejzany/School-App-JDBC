# School-App-JDBC

A Java application designed for managing student and teacher details using JDBC (Java Database Connectivity). This project is structured following modern system design principles and incorporates concepts like Data Access Objects (DAOs), Data Transfer Objects (DTOs), Services, Controllers, and Configuration helpers.

## Introduction

The JDBC-Based Student and Teacher Management System is a versatile application that simplifies the process of managing student and teacher data. It provides CRUD (Create, Read, Update, Delete) operations for efficient data manipulation while ensuring robust data validation, error handling, and a well-structured architecture.

## Features

### Student and Teacher Operations

Perform Create, Read, Update, and Delete operations for both student and teacher data.

### Robust Error Handling

Comprehensive error handling to ensure data integrity and system stability.

### Layered Architecture

Separation of concerns using DAOs, DTOs, Services, Controllers, and Configuration helpers for a clean and maintainable codebase.

### Database Integration

Utilizes MySQL for efficient and reliable data storage.

### Configurable Settings

Easily configure the database connection and other application-wide settings via helper classes.

## System Design

The system follows a layered architecture similar to the Product Management System:

- **Data Access Objects (DAOs):** Handle database interaction, SQL queries, and database connections for both student and teacher data.

- **Data Transfer Objects (DTOs):** Simple Java objects for data transfer between layers, ensuring clean data encapsulation.

- **Services:** Contain business logic and interact with DAOs for database operations, such as CRUD operations and data validation.

- **Controllers:** Manage HTTP requests, validate input, and invoke services to process requests for both student and teacher management.

- **Configuration (Helper):** Manage database connection configuration and other application-wide settings.

## Technologies Used

- Java
- JDBC for database connectivity
- MySQL for database management
- Git for version control.
