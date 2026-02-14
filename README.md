## 📘 Assignment Day 33 – Spring Boot Deployment
Mini project backend menggunakan Spring Boot yang sudah berhasil di-deploy ke VPS menggunakan Docker + GitHub Actions.

Project ini dibuat sebagai bagian dari Back End Web Development Bootcamp.

---
## 🚀 Base URL (VPS)
```
http://203.194.115.210:9008
```
---
## 📌 Available Endpoints
✅ Get All Users

GET /api/users
```
http://203.194.115.210:9008/api/users
```
✅ Create User

POST /api/users
```
{
  "username": "arsyad",
  "email": "arsyad@test.com"
}
```
---
## 🛠 Tech Stack

Java 21
Spring Boot
Spring Data JPA
MySQL
Docker
Docker Compose
GitHub Actions (CI/CD)
VPS Deployment
Postman (Testing API)

---

## ▶ Run Project Locally

1. Clone repository
   ```
   git clone <repo-url>
   cd assignmentday33
   ```
2. Setup database
   ```
   CREATE DATABASE db_spring_student8;
   ```
3. Update aplication.properties
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/db_spring_student8
   spring.datasource.username=root
   spring.datasource.password=your_password

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```
4. Run app
   ```
   ./mvnw spring-boot:run
   ```
   atau
   
   ```
   mvn spring-boot:run
   ```
--- 

## 🐳 Deployment Flow
CI/CD Flow:
```
Push to GitHub
↓
GitHub Actions build Docker image
↓
Push image to DockerHub
↓
SSH to VPS
↓
docker compose pull
docker compose up -d
```
VPS Run Command

```
docker compose pull
docker compose down
docker compose up -d
```

---

## 📂 Environment Variable (.env on VPS)

```
APP_PORT=9008
DOCKERHUB_USERNAME=arsyadgiri

SPRING_DATASOURCE_URL=jdbc:mysql://classroom_mysql:3306/db_spring_student8
SPRING_DATASOURCE_USERNAME=root
SPRING_DATASOURCE_PASSWORD=rahasia_banget
```
---

## ✅ Deployment Result
Spring Boot running on VPS

Connected to MySQL container

API accessible via public IP

CRUD tested using Postman

Data successfully stored in database

---

## 📸 Proof of Deployment
1️⃣ Postman – GET Users
<img width="1493" height="793" alt="Assignment Day 33 (3)" src="https://github.com/user-attachments/assets/7d1e4add-97eb-4732-ac4f-be61d2bdfbba" />


2️⃣ Postman – POST Users
<img width="1492" height="757" alt="Assignment Day 33 (2)" src="https://github.com/user-attachments/assets/8bf1bd3d-a5d5-4e13-b2d8-70da9f783843" />

3️⃣ phpMyAdmin – users table

<img width="1331" height="931" alt="Assignment Day 33 (4)" src="https://github.com/user-attachments/assets/b2143422-68a8-4e20-b29a-f74a8100410b" />

---

## ✨ Author
Muhammad Arsyad Giri

Back End Web Development Bootcamp Student

---
