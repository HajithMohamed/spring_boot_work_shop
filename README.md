# Spring Boot Workshop

A hands-on Spring Boot workshop repository. This README is structured like a guided lab so you can follow it step-by-step.

> **Status (as of 2026-03-06):** The repository currently exposes only this README via the GitHub Contents API. If you add the application source code (typical: `pom.xml` + `src/`), this document will automatically become a complete workshop guide for the project.

---

## Table of Contents
1. [What you will build](#what-you-will-build)
2. [Prerequisites](#prerequisites)
3. [Repository layout](#repository-layout)
4. [Getting started (Run)](#getting-started-run)
5. [Workshop modules](#workshop-modules)
6. [API testing](#api-testing)
7. [Troubleshooting](#troubleshooting)
8. [Snapshots (Screenshots)](#snapshots-screenshots)
9. [Next improvements](#next-improvements)

---

## What you will build
By the end of this workshop you should be able to:
- Create a Spring Boot application
- Configure environment-specific properties
- Implement REST APIs (controller → service → repository)
- Validate requests and handle errors cleanly
- Persist data using a database (H2 / MySQL / PostgreSQL)
- Document APIs using Swagger / OpenAPI
- Add tests and run them in CI

---

## Prerequisites
Install these locally:
- **Java 17+** (recommended)
- **Maven** (if you use `pom.xml`) or **Gradle** (if you use `build.gradle`)
- **Git**
- Optional: IntelliJ IDEA / VS Code

Verify:
```bash
java -version

mvn -version
# or
gradle -version
```

---

## Repository layout
### Current state
At the moment, only `README.md` is visible via the GitHub Contents API.

### Expected Spring Boot layout (recommended)
When you add code, keep the standard structure:
```text
.
├── pom.xml                         # Maven build (recommended for workshop)
├── src
│   ├── main
│   │   ├── java
│   │   │   └── ...                 # application code
│   │   └── resources
│   │       ├── application.yml     # config
│   │       └── ...
│   └── test
│       └── java
│           └── ...                 # tests
└── docs
    └── images
        └── ...                     # screenshots used by README
```

---

## Getting started (Run)
Once you have code in the repo:

### Maven
```bash
./mvnw spring-boot:run
# or
mvn spring-boot:run
```

### Gradle
```bash
./gradlew bootRun
# or
gradle bootRun
```

Then open:
- App: `http://localhost:8080`
- Swagger (if enabled): `http://localhost:8080/swagger-ui/index.html`

---

## Workshop modules
Use these modules as a checklist. Each module should end with **one commit**.

### Module 0 — Create the project
- Generate via Spring Initializr
- Dependencies (typical): Spring Web, Validation, Lombok, Spring Data JPA, H2 (or MySQL/Postgres), Springdoc OpenAPI

**Deliverables**
- `pom.xml` / `build.gradle`
- `@SpringBootApplication` main class
- App starts successfully

### Module 1 — Hello API
- Add a simple controller:
  - `GET /api/health` → returns `OK`

### Module 2 — CRUD feature
Pick an entity (example: `Student`, `Product`, `Task`) and implement:
- DTOs
- Controller endpoints
- Service layer
- Repository (JPA)

Endpoints example:
- `POST /api/students`
- `GET /api/students/{id}`
- `GET /api/students`
- `PUT /api/students/{id}`
- `DELETE /api/students/{id}`

### Module 3 — Validation + Error handling
- Add request validation annotations (`@NotBlank`, `@Email`, etc.)
- Add global exception handler (`@ControllerAdvice`)

### Module 4 — Database configuration
- Configure H2 locally for workshop simplicity
- Optional: docker-compose for MySQL/Postgres

### Module 5 — API documentation
- Enable Swagger UI via Springdoc
- Confirm all endpoints appear in OpenAPI

### Module 6 — Testing
- Unit tests for service layer
- Integration test for controller layer (`@SpringBootTest` or `@WebMvcTest`)

---

## API testing
Recommended tools:
- Swagger UI
- Postman
- curl

Example curl (once endpoints exist):
```bash
curl -s http://localhost:8080/api/health
```

---

## Troubleshooting
- **Port in use**: change `server.port` in `application.yml`
- **Java version mismatch**: set `maven.compiler.release` or Gradle toolchain
- **DB issues**: start with H2, verify datasource URL

---

## Snapshots (Screenshots)
Store all screenshots in: `docs/images/`

Recommended naming convention:
- `01-project-structure.png`
- `02-app-startup-console.png`
- `03-swagger-ui.png`
- `04-health-endpoint.png`
- `05-postman-create-entity.png`
- `06-postman-list-entities.png`
- `07-db-h2-console.png`
- `08-test-results.png`

### What screenshots to capture
Capture these images after you implement the modules above:
1. **Project Structure** (IDE file tree showing `pom.xml` and `src/`)
2. **Application Startup Logs** (terminal showing “Started … in … seconds”)
3. **Swagger UI Home** (Swagger page listing endpoints)
4. **Health Endpoint** (`GET /api/health` result in browser or Postman)
5. **Create Entity** (`POST` request + response body)
6. **List Entities** (`GET` list endpoint response)
7. **Database View** (H2 console table view OR DB client showing rows)
8. **Tests Passing** (test run summary in IDE/terminal)

### How to reference them in the README
Once you add screenshots under `docs/images/`, embed them like this:
```md
![Swagger UI](docs/images/03-swagger-ui.png)
```

---

## Next improvements
When your code is present, we can enhance this workshop README with:
- Exact endpoints and example payloads (based on your actual controllers)
- Environment profiles (dev/test/prod)
- Docker support for DB
- GitHub Actions CI (build + test)
- Code style checks (Spotless/Checkstyle)

---

## Contributing
- Create a branch per module
- Open a PR per workshop step (optional)

## License
Add a license if you plan to share widely (MIT/Apache-2.0 are common).
