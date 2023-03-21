# Spring Boot Architecture

![SpringBoot](https://img.shields.io/badge/SpringBoot-blue)
![JAVA](https://img.shields.io/badge/JAVA-1.8-blue)
![MySQL](https://img.shields.io/badge/MySQL-yellow)
![Facade](https://img.shields.io/badge/FACADE-yellow)
![JPA](https://img.shields.io/badge/JPA-yellow)
![Project Lombok](https://img.shields.io/badge/ProjectLombok-yellow)
![Swagger](https://img.shields.io/badge/Swagger-yellow)
![Retrofit](https://img.shields.io/badge/Retrofit-yellow)
![ModelMapper](https://img.shields.io/badge/ModelMapper-yellow)

<img src="/screenshots/spring_boot.png" alt="spring_boot"/>

> I recommend this structure for basic projects that are not extensive.

## Introduction

This repo is Spring Boot project in which different technologies such as Swagger, Model Mapper are integrated.
Additionally, there are 2 different APIs available for testing.

## Technologies

- **Spring Boot** makes it easy to create stand-alone, production-grade Spring based Applications that you can "
  just run".
- **MySQL** is an open-source relational database management system. Its name is a combination of "My", the name of
  co-founder Michael Widenius's daughter My, and "SQL", the abbreviation for Structured Query Language.
- **Facade** is a structural design pattern that provides a simplified interface to a library, a framework, or any other
  complex set of classes.
- **Java Persistence API (JPA)**, part of the larger Spring Data family, makes it easy to easily implement JPA based
  repositories. This module deals with enhanced support for JPA based data access layers. It makes it easier to build
  Spring-powered applications that use data access technologies.
- **Project Lombok** is a java library that automatically plugs into your editor and build tools, spicing up your java.
  Never write another getter or equals method again, with one annotation your class has a fully featured builder,
  Automate your logging variables, and much more.
- Simplify API development for users, teams, and enterprises with the **Swagger** open source and professional toolset.
  Find out how Swagger can help you design and document your APIs at scale.
- **Retrofit**: A type-safe HTTP client for Android and Java.
- The goal of **ModelMapper** is to make object mapping easy, by automatically determining how one object model maps to
  another, based on conventions, in the same way that a human would - while providing a simple, refactoring-safe API for
  handling specific use cases.

<img src="/screenshots/diagram.png"/>

## Preparation of project

### SQL Create Query

First, it needs to create a database named `architecture` in the phpMyAdmin console.

> You can use [XAMPP](https://www.apachefriends.org/) for work on local server.
> If you do not make any changes in the configuration, you can access phpMyAdmin from the link below.
>
> http://localhost/phpmyadmin/

The required table can be created using the following SQL query.

```
CREATE TABLE users (
userId VARCHAR(30) PRIMARY KEY,
name VARCHAR(40),
username VARCHAR(40));
```

### Swagger

<img src="/screenshots/swagger_ui.png" />

> After running Apache and phpMyAdmin correctly in your local, the Swagger UI link will be as follows.
>
> http://localhost:8082/swagger-ui.html

## Tests

API tests with **200 OK** and **404 Not Found** (**_Custom Exception_**) codes are listed below.

<img src="/screenshots/get_user_ok.png" />

<img src="/screenshots/get_user_fail.png" />

## Test For Local

- Clone or download the application to your computer.

- Go to the folder where the application is located via terminal.

- Before testing, please make sure Docker is installed on your local computer.

- Then run the application with the `make` command. Make sure you have the `make` installed on your computer. If `make` is not installed on your computer, you can find detailed information [here](https://www.gnu.org/software/make/).

- Now you can test the application on your own computer.

### If you want to run the make commands in order, you can run them in the following order.

```sh
make clean
```

```sh
make image
```

```sh
make run
```

## References

- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)
- [Facade](https://refactoring.guru/design-patterns/facade)
- [JPA](https://spring.io/projects/spring-data-jpa)
- [Project Lombok](https://projectlombok.org/)
- [Swagger](https://swagger.io/)
- [Retrofit](https://square.github.io/retrofit/)
- [Model Mapper](http://modelmapper.org/getting-started/)

### Contributing to Project

All contributions are welcome! Please fork this repository and contribute back using pull requests.

> Don't forget to star ⭐ the repo it motivates me to share more open source
