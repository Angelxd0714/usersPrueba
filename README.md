# Users Microservice

A Spring Boot-based microservice for user management with RESTful API endpoints.

## 🚀 Features

- Create, read, update, and delete users
- RESTful API with proper HTTP methods
- Data validation
- OpenAPI documentation
- Docker support
- Maven build system

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- Docker (optional, for containerization)
- h2 (or adjust the database configuration as needed)

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Angelxd0714/usersPrueba.git
   cd usersPrueba
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## 🐳 Docker Support

Build the Docker image:
```bash
docker build -t users-microservice .
```

Run the container:
```bash
docker-compose up -d
```

The application will be available at `http://localhost:8080`

## 📚 API Documentation

Once the application is running, you can access the OpenAPI documentation at:
- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs

## 🏗️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/pruebatecnica/users/
│   │       ├── config/       # Configuration classes
│   │       ├── controller/   # REST controllers
│   │       ├── dto/          # Data Transfer Objects
│   │       ├── model/        # JPA entities
│   │       ├── repository/   # Data access layer
│   │       ├── service/      # Business logic
│   │       └── UsersApplication.java
│   └── resources/
│       ├── application.yml   # Application configuration
│       └── ...
└── test/                     # Test files
```

## 📝 API Endpoints

### Users
- `GET /api/users` - Get all users
- `GET /api/users/{id}` - Get user by ID
- `POST /api/users` - Create a new user
- `PUT /api/users/{id}` - Update an existing user
- `DELETE /api/users/{id}` - Delete a user

## 🧪 Testing

Run tests:
```bash
mvn test
```

## 📄 License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## ✉️ Contact

For support, please contact support@example.com
