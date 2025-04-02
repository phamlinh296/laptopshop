# Laptop Shop - E-Commerce Web App

## Project Overview

Laptop Shop is an e-commerce web application designed for online shopping of laptops. It includes features for managing products, user authentication, shopping cart, and order processing. This project was built using Java and Spring Boot, with a focus on backend development and security.

## Tech Stack

- **Backend**: Java, Spring Boot, Spring Security, Spring Data JPA, MySQL
- **Frontend**: JSP, JSTL, HTML, CSS, JavaScript
- **Tools**: Docker, Postman, Git, Maven

## Features

### 1. User Management
- Role-based access control (User/Admin roles)
- User authentication and registration with email verification
- Session management using Spring Session JDBC

### 2. Product Management
- CRUD operations for products
- Advanced search (filter by price, brand, and name)
- Image upload for products

### 3. Shopping Cart & Order Processing
- Add/remove/update items in the cart
- Checkout process and order placement
- Order management (Admin can view and update order status)

### 4. Security
- Role-based access control to restrict admin functionality
- JWT authentication and password hashing

### 5. Deployment
- Docker for containerized deployment
- Spring Session JDBC for session persistence

## Getting Started

1. Clone the repository:
   ```
   git clone https://github.com/phamlinh296/laptopshop.git
   ```

2. Set up MySQL and configure the `application.properties` file.

3. Build and run the application using Maven:
   ```
   mvn clean install
   mvn spring-boot:run
   ```

4. Access the app on `http://localhost:8080`.

## Future Enhancements
- Integration with third-party payment gateways (e.g., VNPAY).
- Redis caching to improve performance.

## GitHub Repository

[https://github.com/phamlinh296/laptopshop](https://github.com/phamlinh296/laptopshop)
