# RENTFLEX---PUBLIC

<div align="center">

### *Empowering Seamless Rentals, Accelerating Growth Everywhere*

![Last Commit](https://img.shields.io/github/last-commit/surajktdev/RentFlex---Public?style=for-the-badge&color=blue)
![Java](https://img.shields.io/badge/java-99.7%25-orange?style=for-the-badge&logo=java)
![Languages](https://img.shields.io/github/languages/count/surajktdev/RentFlex---Public?style=for-the-badge&color=blue)
![Stars](https://img.shields.io/github/stars/surajktdev/RentFlex---Public?style=for-the-badge&color=yellow)
![Forks](https://img.shields.io/github/forks/surajktdev/RentFlex---Public?style=for-the-badge&color=blue)

### Built with the tools and technologies:

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Kubernetes](https://img.shields.io/badge/Kubernetes-326CE5?style=for-the-badge&logo=kubernetes&logoColor=white)
![Kafka](https://img.shields.io/badge/Apache_Kafka-231F20?style=for-the-badge&logo=apache-kafka&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?style=for-the-badge&logo=rabbitmq&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)

</div>

---

## 🌟 Overview

**RentFlex---Public** is a scalable, microservices-based rental marketplace platform that enables vendors to list items and users to browse, book, and manage rentals efficiently. Built with Spring Boot, Docker, Kubernetes, Kafka, and RabbitMQ, it offers a robust environment for enterprise-grade operations.

---

## 🎯 Why RentFlex?

This project streamlines the development of multi-vendor rental systems by providing a modular, secure, and highly available architecture. The core features include:

<table>
<tr>
<td width="50%">

### 🔧 **Microservices Architecture**
Modular services for booking, vendor, user, inventory, payments, and notifications ensure scalability and maintainability.

### 🚀 **Containerized Deployment**
Built with Docker and orchestrated with Kubernetes for seamless deployment and scaling.

### 🔒 **Secure & Reliable**
Implements secure authentication, data persistence, and enterprise-grade security configurations.

</td>
<td width="50%">

### 📚 **Comprehensive API Documentation**
Simplifies integration with Swagger and API Gateway for unified API management.

### ⚡ **Real-Time Messaging**
Utilizes Kafka and RabbitMQ for efficient, event-driven communication across services.

### 🌐 **Developer-Friendly**
Supports RESTful APIs, CORS, and environment-specific configurations for smooth development and testing.

</td>
</tr>
</table>

---

## ❓ Problem Statement

People often want to **rent items (tools, vehicles, furniture, gadgets, etc.)** instead of buying, but there is **no good scalable platform** that allows vendors to list and manage rentals efficiently.

---

## 💡 Solution Overview

**RentFlex** provides a multi-vendor rental marketplace where:

<div align="center">

```
┌─────────────────────────────────────────────────────────────────┐
│                                                                 │
│  ✅  Vendors can list items with availability, pricing, terms  │
│                                                                 │
│  ✅  Customers can search, book, and manage rentals            │
│                                                                 │
│  ✅  Secure payments & booking management                      │
│                                                                 │
│  ✅  Scalable microservices architecture                       │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘
```

</div>

---

## ✨ Key Features

<table>
<tr>
<td align="center" width="33%">
<img src="https://img.icons8.com/fluency/96/000000/shop.png" width="60"/><br/>
<b>Multi-Vendor Support</b><br/>
Vendor registration & inventory management
</td>
<td align="center" width="33%">
<img src="https://img.icons8.com/fluency/96/000000/calendar.png" width="60"/><br/>
<b>Smart Booking System</b><br/>
Complete booking & scheduling with availability calendar
</td>
<td align="center" width="33%">
<img src="https://img.icons8.com/fluency/96/000000/security-checked.png" width="60"/><br/>
<b>Secure Authentication</b><br/>
OAuth2 / JWT implementation
</td>
</tr>
<tr>
<td align="center" width="33%">
<img src="https://img.icons8.com/fluency/96/000000/invoice.png" width="60"/><br/>
<b>Order Management</b><br/>
Invoice generation and order tracking
</td>
<td align="center" width="33%">
<img src="https://img.icons8.com/fluency/96/000000/bell.png" width="60"/><br/>
<b>Notifications</b><br/>
Email/SMS/push notifications (future scope)
</td>
<td align="center" width="33%">
<img src="https://img.icons8.com/fluency/96/000000/admin-settings-male.png" width="60"/><br/>
<b>Admin Dashboard</b><br/>
Monitor vendors and users
</td>
</tr>
</table>

---

## 🏗️ System Architecture

```mermaid
graph TB
    subgraph Client["🌐 CLIENT LAYER"]
        User["👤 Users<br/><br/>Browse & Book Items"]
        Vendor["🏪 Vendors<br/><br/>Manage Inventory"]
        Admin["👨‍💼 Admin<br/><br/>Platform Management"]
    end

    subgraph Gateway["🚪 API GATEWAY LAYER"]
        APIGateway["🌉 API Gateway<br/>━━━━━━━━━━<br/>Spring Cloud Gateway<br/>Port: 8080<br/><br/>✓ Request Routing<br/>✓ Load Balancing<br/>✓ Authentication"]
        Eureka["📡 Service Registry<br/>━━━━━━━━━━<br/>Netflix Eureka<br/>Port: 8761<br/><br/>✓ Service Discovery<br/>✓ Health Monitoring"]
    end

    subgraph Services["⚙️ MICROSERVICES LAYER"]
        direction TB
        Row1["
        ┌─────────────────┐  ┌─────────────────┐  ┌─────────────────┐
        │ 👤 User Service │  │ 🏪 Vendor       │  │ 📦 Inventory    │
        │                 │  │    Service      │  │    Service      │
        │ Port: 8081      │  │ Port: 8082      │  │ Port: 8083      │
        │                 │  │                 │  │                 │
        │ • Registration  │  │ • Onboarding    │  │ • Item Listing  │
        │ • Authentication│  │ • Profile Mgmt  │  │ • Categories    │
        │ • Profile       │  │ • Ratings       │  │ • Availability  │
        └─────────────────┘  └─────────────────┘  └─────────────────┘
        "]
        
        Row2["
        ┌─────────────────┐  ┌─────────────────┐  ┌─────────────────┐
        │ 📅 Booking      │  │ 💳 Payment      │  │ 📧 Notification │
        │    Service      │  │    Service      │  │    Service      │
        │ Port: 8084      │  │ Port: 8085      │  │ Port: 8086      │
        │                 │  │                 │  │                 │
        │ • Reservations  │  │ • Payments      │  │ • Email/SMS     │
        │ • Scheduling    │  │ • Invoices      │  │ • Push Alerts   │
        │ • Cancellations │  │ • Refunds       │  │ • Templates     │
        └─────────────────┘  └─────────────────┘  └─────────────────┘
        "]
        
        AdminService["
        ┌──────────────────────────┐
        │  👨‍💼 Admin Service         │
        │  Port: 8087              │
        │                          │
        │  • User Management       │
        │  • Vendor Oversight      │
        │  • Platform Monitoring   │
        │  • Reports & Analytics   │
        └──────────────────────────┘
        "]
    end

    subgraph Messaging["📨 MESSAGING LAYER"]
        Kafka["📨 Apache Kafka<br/>━━━━━━━━━━<br/>Event Streaming<br/><br/>✓ Booking Events<br/>✓ Inventory Updates<br/>✓ Activity Logs"]
        RabbitMQ["🐰 RabbitMQ<br/>━━━━━━━━━━<br/>Message Queue<br/><br/>✓ Payment Processing<br/>✓ Email Notifications<br/>✓ SMS Alerts"]
    end

    subgraph Data["💾 DATA PERSISTENCE LAYER"]
        DB1["🗄️ User DB<br/>MySQL"]
        DB2["🗄️ Vendor DB<br/>MySQL"]
        DB3["🗄️ Inventory DB<br/>MySQL"]
        DB4["🗄️ Booking DB<br/>MySQL"]
        DB5["🗄️ Payment DB<br/>MySQL"]
        DB6["🗄️ Admin DB<br/>MySQL"]
    end

    %% Client to Gateway
    User -.->|HTTPS Request| APIGateway
    Vendor -.->|HTTPS Request| APIGateway
    Admin -.->|HTTPS Request| APIGateway

    %% Gateway Layer
    APIGateway <==>|Service Discovery| Eureka

    %% Gateway to Services
    APIGateway ==>|Route| Row1
    APIGateway ==>|Route| Row2
    APIGateway ==>|Route| AdminService

    %% Services to Eureka
    Row1 -.->|Register| Eureka
    Row2 -.->|Register| Eureka
    AdminService -.->|Register| Eureka

    %% Services to Messaging
    Row1 -->|Publish Events| Kafka
    Row2 -->|Publish Events| Kafka
    Row2 -->|Queue Messages| RabbitMQ

    %% Services to Database
    Row1 ---|Persist Data| DB1
    Row1 ---|Persist Data| DB2
    Row1 ---|Persist Data| DB3
    Row2 ---|Persist Data| DB4
    Row2 ---|Persist Data| DB5
    AdminService ---|Persist Data| DB6

    %% Styling
    classDef gatewayStyle fill:#2496ED,stroke:#1a73b8,stroke-width:3px,color:#fff
    classDef serviceStyle fill:#6DB33F,stroke:#5a9633,stroke-width:2px,color:#fff
    classDef messagingStyle fill:#FF6600,stroke:#cc5200,stroke-width:3px,color:#fff
    classDef databaseStyle fill:#4479A1,stroke:#355f7d,stroke-width:2px,color:#fff
    classDef clientStyle fill:#9C27B0,stroke:#7B1FA2,stroke-width:2px,color:#fff

    class APIGateway,Eureka gatewayStyle
    class Row1,Row2,AdminService serviceStyle
    class Kafka,RabbitMQ messagingStyle
    class DB1,DB2,DB3,DB4,DB5,DB6 databaseStyle
    class User,Vendor,Admin clientStyle
```

---

## 🛠️ Tech Stack

<table>
<tr>
<td width="50%">

### Backend Technologies
- **☕ Java 21** - Programming language
- **🍃 Spring Boot 3.x** - Application framework
- **🔒 Spring Security** - Authentication & authorization
- **📊 Spring Data JPA** - Data access layer
- **🌐 Spring Web** - REST API development
- **✔️ Spring Validation** - Input validation

### Messaging & Events
- **📨 Apache Kafka** - Event streaming
- **🐰 RabbitMQ** - Message broker

</td>
<td width="50%">

### Database
- **🗄️ MySQL** - Primary relational database

### API & Gateway
- **🌉 Spring Cloud Gateway** - API Gateway
- **📡 Netflix Eureka** - Service Discovery

### Documentation & Testing
- **📝 Swagger/OpenAPI 3** - API documentation
- **🧪 JUnit 5** - Unit testing
- **🎭 MockMvc** - Web layer testing

### DevOps & Deployment
- **🐳 Docker** - Containerization
- **☸️ Kubernetes** - Orchestration
- **📦 Maven** - Build automation

</td>
</tr>
</table>

---

## 🔧 Microservices Breakdown

<div align="center">

| Service | Icon | Responsibility | Port |
|---------|------|----------------|------|
| **User Service** | 👤 | User registration, authentication, profile management | 8081 |
| **Vendor Service** | 🏪 | Vendor onboarding, profile, ratings, and management | 8082 |
| **Inventory Service** | 📦 | Item listings, categories, search, and availability | 8083 |
| **Booking Service** | 📅 | Rental booking, scheduling, cancellations, and history | 8084 |
| **Payment Service** | 💳 | Payment processing, invoices, and refunds | 8085 |
| **Notification Service** | 📧 | Email, SMS, and push notifications | 8086 |
| **Admin Service** | 👨‍💼 | Platform management, monitoring, and reports | 8087 |
| **API Gateway** | 🌐 | Request routing, load balancing, and authentication | 8080 |
| **Service Registry** | 📡 | Service discovery and health monitoring | 8761 |

</div>

---

## 📋 Prerequisites

Before running this project, ensure you have the following installed:

<div align="center">

| Requirement | Version | Purpose |
|-------------|---------|---------|
| ☕ **Java** | 21+ | Runtime environment |
| 📦 **Maven** | 3.8+ | Build tool |
| 🐳 **Docker** | Latest | Containerization |
| ☸️ **Kubernetes** | 1.25+ | Orchestration |
| 🗄️ **MySQL** | 8.0+ | Database |
| 📨 **Kafka** | 3.0+ | Event streaming |
| 🐰 **RabbitMQ** | 3.11+ | Message broker |

</div>

---

## 🚀 Installation & Setup

### **Method 1: Local Development**

```bash
# 1. Clone the Repository
git clone https://github.com/surajktdev/RentFlex---Public.git
cd RentFlex---Public

# 2. Start Infrastructure Services
docker-compose up -d mysql kafka rabbitmq

# 3. Build All Microservices
mvn clean install

# 4. Run Services (in separate terminals)
cd user-service && mvn spring-boot:run
cd vendor-service && mvn spring-boot:run
cd inventory-service && mvn spring-boot:run
cd booking-service && mvn spring-boot:run
# ... and so on
```

### **Method 2: Docker Compose (Recommended)**

```bash
# 1. Clone the Repository
git clone https://github.com/surajktdev/RentFlex---Public.git
cd RentFlex---Public

# 2. Build and Start All Services
docker-compose up --build -d

# 3. Check Service Status
docker-compose ps

# 4. View Logs
docker-compose logs -f [service-name]

# 5. Stop All Services
docker-compose down
```

### **Method 3: Kubernetes Deployment**

```bash
# 1. Apply Kubernetes Configurations
kubectl apply -f k8s/namespace.yaml
kubectl apply -f k8s/configmaps/
kubectl apply -f k8s/secrets/
kubectl apply -f k8s/deployments/
kubectl apply -f k8s/services/

# 2. Check Deployment Status
kubectl get pods -n rentflex
kubectl get services -n rentflex

# 3. Scale Services
kubectl scale deployment user-service --replicas=3 -n rentflex

# 4. View Logs
kubectl logs -f <pod-name> -n rentflex
```

---

## 🌐 Access Points

Once the application is running, you can access:

<div align="center">

| Service | URL | Description |
|---------|-----|-------------|
| 🌐 **API Gateway** | http://localhost:8080 | Main application entry point |
| 📝 **Swagger UI** | http://localhost:8080/swagger-ui.html | API Documentation |
| 📡 **Eureka Dashboard** | http://localhost:8761 | Service Registry |
| 📊 **Kafka UI** | http://localhost:9000 | Kafka monitoring |
| 🐰 **RabbitMQ Console** | http://localhost:15672 | RabbitMQ management |

</div>

**Default Credentials:**
- RabbitMQ: `guest` / `guest`
- MySQL: `root` / `password`

---

## 🐳 Docker & Kubernetes Commands

### **Docker Commands**

```bash
# Build specific service
docker build -t rentflex/user-service:latest ./user-service

# Run specific service
docker run -p 8081:8081 rentflex/user-service:latest

# View running containers
docker ps

# Stop all containers
docker stop $(docker ps -aq)

# Remove all containers
docker rm $(docker ps -aq)

# View logs
docker logs -f <container-id>
```

### **Kubernetes Commands**

```bash
# Get all resources
kubectl get all -n rentflex

# Describe a pod
kubectl describe pod <pod-name> -n rentflex

# Port forward to a service
kubectl port-forward svc/api-gateway 8080:8080 -n rentflex

# Execute command in pod
kubectl exec -it <pod-name> -n rentflex -- /bin/bash

# Delete all resources
kubectl delete namespace rentflex
```

---

## 🔮 Future Enhancements

<table>
<tr>
<td width="50%">

### 🎯 Phase 1 (Q3 2025)
- [x] Complete payment gateway integration
- [ ] Advanced search with filters
- [ ] Real-time notifications via WebSocket
- [ ] Review and rating system
- [ ] Mobile-responsive dashboard

### 🚀 Phase 2 (Q4 2025)
- [ ] Mobile app (React Native)
- [ ] AI-based recommendations
- [ ] Multi-language support
- [ ] Chat system (vendor-user)
- [ ] Analytics dashboard

</td>
<td width="50%">

### 💡 Phase 3 (2026)
- [ ] Insurance integration
- [ ] Delivery tracking system
- [ ] Dynamic pricing engine
- [ ] Vendor verification system
- [ ] Loyalty rewards program

### 🌟 Phase 4 (Future)
- [ ] Blockchain-based payments
- [ ] AR/VR item preview
- [ ] IoT device integration
- [ ] Predictive maintenance
- [ ] Global marketplace expansion

</td>
</tr>
</table>

---

## 📊 Project Status

<div align="center">

![GitHub issues](https://img.shields.io/github/issues/surajktdev/RentFlex---Public?style=for-the-badge)
![GitHub pull requests](https://img.shields.io/github/issues-pr/surajktdev/RentFlex---Public?style=for-the-badge)
![GitHub](https://img.shields.io/github/license/surajktdev/RentFlex---Public?style=for-the-badge)

### **Current Version: 1.0.0-ALPHA**

| Component | Status | Coverage |
|-----------|--------|----------|
| User Service | ✅ Complete | 85% |
| Vendor Service | ✅ Complete | 82% |
| Inventory Service | ✅ Complete | 88% |
| Booking Service | 🚧 In Progress | 75% |
| Payment Service | 🚧 In Progress | 60% |
| Notification Service | ⏳ Planned | - |
| Admin Service | ⏳ Planned | - |

</div>

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

<div align="center">

### **Suraj Kumar**

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/surajktdev)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/surajktdev)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:surajktdev@example.com)

**Project Link:** [RentFlex---Public](https://github.com/surajktdev/RentFlex---Public)

</div>

---

<div align="center">

### ⭐ Star this repository if you find it helpful!

### 🔄 Fork it to create your own version!

---

**Made with ❤️ and ☕ by Suraj Kumar**

*Empowering developers to build scalable rental marketplaces*

</div>
