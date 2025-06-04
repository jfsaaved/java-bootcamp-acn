# Project Idea & Learning Guide - Connect to DB in 4 Steps
We will connect our CRUD application to PostgreSQL locally.
We will be using PostgreSQL for our DB but the same idea/steps applies to any DB service.
#### Things to Install:
- [Install Docker cli through chocolatey](https://community.chocolatey.org/packages/docker-cli)
- [Install PostgreSQL](https://www.postgresql.org/download/)
- Or [Install PostgreSQL through chocolatey](https://community.chocolatey.org/packages/postgresql)
- [Get pgAdmin (already included in PostgreSQL installer)](https://www.postgresql.org/ftp/pgadmin/pgadmin4/v9.4/windows/)
#### Topics Included
- PostgreSQL / psql - A relational database service (concepts will apply with other DBs)
- pgAdmin - GUI for PostgreSQL Databases
- H2 In Memory DB
- cli - command line interface of services (psql for PostgreSQL)
- .yml and .properties file - for application **configuration**
- Spring Boot Data JPA - @Entity, JpaRepository Interface, etc.
- Docker - We can use Docker to spin up a PostgreSQL
	- If Docker is not allowed in machine, it has to be setup manually

---
# 1a. Start Database Locally with Docker - ***Probably won't work in Accenture machines***
**Docker** is like a **container** or **box** that holds everything your app needs to run — like the app itself, its settings, and tools (Java, Postgres, etc.) — so it works the same on any computer.

Open git bash / powershell / cmd with Administrator mode.

```bash
docker run --name my-postgres -e POSTGRES_DB=mydb -e POSTGRES_USER=user -e POSTGRES_PASSWORD=pass -p 5432:5432 -d postgres
```

or

```bash
docker run --name my-postgres \
  -e POSTGRES_DB=mydb \
  -e POSTGRES_USER=user \
  -e POSTGRES_PASSWORD=pass \
  -p 5432:5432 \
  -d postgres
```

- user, `pass`, and `mydb` = your custom credentials.
- PostgreSQL is now available at `localhost:5432`.
## 1b. OR Download and Install PostgreSQL manually
##### Download and Install PostgreSQL
- Go to: [https://www.postgresql.org/download/](https://www.postgresql.org/download/)
##### or Download and Install through chocolatey
- Go to: https://community.chocolatey.org/packages/postgresql
## 1c. OR Use H2 In Memory DB if psql slow on machine

##### Add H2 Dependency
```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>2.2.224</version> <!-- Compatible with Java 11 -->
    <scope>runtime</scope>
</dependency>

<!-- Need these for Java 11 for above H2 version to work
Some libraries (like **H2**, **Spring**, or **SOAP APIs**) internally use JAXB for XML parsing. Java 11+ doesn’t ship it by default anymore. -->
<dependency>  
	<groupId>jakarta.xml.bind</groupId> 
	<artifactId>jakarta.xml.bind-api</artifactId>  
	<version>2.3.3</version>
</dependency>  

<dependency>  
	<groupId>org.glassfish.jaxb</groupId>
	<artifactId>jaxb-runtime</artifactId>  
	<version>2.3.3</version>
</dependency>
```
##### application.yml configuration
```
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password:
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
  h2:
    console:
      enabled: true
      path: /h2-console
```
##### Console
Open browser: [http://localhost:8080/h2-console](http://localhost:8080/h2-console) with `jdbc:h2:mem:testdb` and `sa` as username and leave password blank.

---
# 2. Add Dependencies
```xml
<!-- Spring Data JPA: Provides JpaRepository, entity management, Hibernate integration, etc. -->
<dependency>  
	<groupId>org.springframework.boot</groupId>  
	<artifactId>spring-boot-starter-data-jpa</artifactId>  
	<version>2.7.18</version> <!-- Compatible with Spring Boot 2.7.x projects -->  
</dependency>  

<!-- PostgreSQL JDBC Driver: Enables Java applications to connect to a PostgreSQL database -->
<dependency>  
	<groupId>org.postgresql</groupId>  
	<artifactId>postgresql</artifactId>  
	<version>42.7.3</version> <!-- Official driver version, works with PostgreSQL 15+ -->  
</dependency>
```

---
# 3. Connect Application to PostgreSQL
Spring Boot manages these internally, so we don't have to worry about it too much.

Example for **Spring Boot** (`application.yml`)
```yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/mydb
    username: myuser
    password: mypass
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    database-platform: org.hibernate.dialect.PostgreSQLDialect
```

Or in `application.properties`
```
spring.datasource.url=jdbc:postgresql://localhost:5432/mydb
spring.datasource.username=myuser
spring.datasource.password=mypass
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

---
# 4. Update Application with Spring Boot Data JPA 
Steps to refactor our application to use real local DB with Spring Boot Data JPA Annotations.
##### 4.1 Create or Modify Your Entity Class
	Update your model class with JPA annotations:
	- Add `@Entity` to mark it as a database entity.
	- Use `@Id` to identify the primary key.
	- Optionally use `@GeneratedValue` to auto-generate the ID
##### 4.2 Replace In-Memory Repository with JPA Repository
	Instead of using a `Map<Integer, Greeting>`:
	- Create/update repository interface to extends `JpaRepository`.
##### 4.3 Update Service to Use JPA Repository
	Inject your `Repository` and use its methods like `save()`, `findById()`, and `deleteById()` instead

---
# Connecting to DB

### Connect from Host Machine
If Postgres is exposed, you can also connect from your host:
```
psql -h localhost -p 5432 -U myuser -d mydb
```

You may need to install `psql` (postgresql-client / psql cli) locally:
- Example: `sudo apt install postgresql-client`
### Connect to PostgreSQL Using pgAdmin
To connect your PostgreSQL (running in Docker) to pgAdmin, open pgAdmin and right-click **Servers → Create → Server**. Under the **General** tab, name it (e.g., `LocalPostgres`). Under the **Connection** tab, set:
- **Host**: `localhost`
- **Port**: `5432`
- **Username**: `user`
- **Password**: `pass`

---


