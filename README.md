# Cricbuzz Clone – Microservices-Based Live Cricket Score Application

This is a personal project built as a **Cricbuzz clone** using **Java, Spring Boot, Microservices, Docker, Kubernetes, gRPC, Kafka**, and more. It simulates live match scores using historical data and streams updates to users using **gRPC server-side streaming**.

---

## 🧠 Motivation

- Learn and apply **Microservice Architecture**
- Understand **gRPC streaming** for real-time systems
- Explore **Kafka** for event-driven architecture
- Containerize apps using **Docker & Kubernetes**
- Implement **CI/CD pipelines** and Kubernetes deployments
- Use **real data from Kaggle** for realistic scenarios

---

## 🛠️ Tech Stack

- **Backend:** Java 17, Spring Boot, Spring Cloud
- **Microservices:** Spring Boot REST APIs
- **Real-Time:** gRPC (server streaming)
- **Messaging:** Apache Kafka
- **Auth:** Spring Security + JWT
- **Database:** MySQL
- **API Gateway:** Spring Cloud Gateway
- **Orchestration:** Docker, Kubernetes, Minikube
- **CI/CD:** GitHub Actions *(WIP)*
- **Data Source:** Kaggle cricket datasets

---

## ⚙️ Microservices

| Service              | Description                                                                 |
|----------------------|-----------------------------------------------------------------------------|
| `auth-service`       | Handles login, registration, and JWT authentication                         |
| `gateway-service`    | Routes API requests to appropriate microservices                            |
| `team-service`       | Manages cricket team data                                                   |
| `player-service`     | Manages player details and stats                                            |
| `match-service`      | Stores match metadata (teams, date, venue, status, etc.)                    |
| `score-service`      | Streams live scores using gRPC server-side streaming                        |
| `notification-service` | Publishes match-related notifications using Kafka                         |
| `admin-service` *(optional)* | Admin panel for match status updates and data management          |

---

## 🔄 Data Source

Data used is extracted from Kaggle datasets:

- [IPL Dataset (matches, deliveries)](https://www.kaggle.com/datasets/ramjidoolla/ipl-data-set)
- Data is filtered and seeded into MySQL using custom scripts

---

## 🔴 Live Match Simulation

The `score-service` uses `deliveries.csv` to simulate live scores by:
- Looping over deliveries
- Sending updates every few seconds using `Thread.sleep()`
- Streaming data to frontend via gRPC

---

## 📦 Folder Structure

cricbuzz-clone/ │ ├── auth-service/ ├── gateway-service/ ├── team-service/ ├── player-service/ ├── match-service/ ├── score-service/      # gRPC server here ├── notification-service/ ├── admin-service/ └── docker-compose.yml

---

## ▶️ Getting Started (Locally)

### Prerequisites
- Java 17+
- Docker & Docker Compose
- MySQL
- gRPC plugin
- Kafka + Zookeeper (via Docker)

### Clone & Build
```bash
git clone https://github.com/your-username/cricbuzz-clone.git
cd cricbuzz-clone

Start Services

docker-compose up --build

Load Sample Data

Seed initial match, team, and player data from Kaggle using SQL dump or Java service loaders.


---

🚢 Kubernetes Deployment (WIP)

Helm charts or YAML manifests for each service

Ingress setup for routing

Secrets and ConfigMaps for secure credentials



---

🛡️ Security

JWT-based authentication for user endpoints

Role-based access control

Spring Security integrated in auth-service



---

✅ Features Implemented

[x] Microservices architecture

[x] gRPC server-side streaming

[x] Kafka event publishing

[x] Dockerized each service

[x] Spring Security + JWT

[ ] CI/CD pipeline (in progress)

[ ] Kubernetes deployment (in progress)



---

📚 Future Enhancements

WebSocket-based client support

Frontend using React/Next.js

Admin dashboard UI

Commentary service

Leaderboard & analytics



---

🧑‍💻 Author

Manas Ranjan Satapathy
Junior Software Developer
LinkedIn | GitHub


---

⭐ Star the Repo!

If you like this project, consider giving it a star and sharing it with others!

---

