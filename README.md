# S4.01-Spring-Framework-Básicos


Este repositorio contiene dos versiones equivalentes de un microservicio desarrollado con **Java 21** y **Spring Boot 3.5.0**, que exponen una API REST sencilla. Uno de los proyectos usa **Maven** y el otro **Gradle** como sistema de construcción.

## 🎯 Descripción del ejercicio

Implementar dos endpoints:

- **GET** `/HelloWorld?nombre=tuNombre` → devuelve: `Hola tuNombre. Estás ejecutando un proyecto Maven"`
- **GET** `/HelloWorld2/tuNombre` → devuelve: `Hola tuNombre. Estás ejecutando un proyecto Maven"`

El servicio de Maven debe ejecutarse en el puerto `9000`.
El servicio de Gradle debe ejecutarse en el puerto `9001`.

## 🛠️ Tecnologías y herramientas

- Java 21
- Spring Boot 3.5.0
- Maven 3.9.9
- Gradle (con wrapper)
- IntelliJ IDEA como IDE
- Postman para pruebas de endpoints
- Sistema operativo: Windows 11

## 📂 Estructura

├── S04T01N01/ # Proyecto Maven │ └── S04T01N01/ # Contiene pom.xml y fuentes │ 

├── S04T01N02/ # Proyecto Gradle │ └── S04T01N02/ # Contiene build.gradle y fuentes


## 🚀 Cómo ejecutar los proyectos en linea de comandos


### Maven

cd S04T01N01/S04T01N01
mvn spring-boot:run


### Gradle
cd S04T01N02/S04T01N02
.\gradlew bootRun


## Ver en navegador o Postman

http://localhost:9000/HelloWorld?nombre=tuNombre

http://localhost:9000/HelloWorld2/tuNombre

📋 Notas
Ambos proyectos tienen el puerto configurado en application.properties.

La lógica principal se encuentra en la clase HelloWorldController.

Este ejercicio forma parte de la formación en Spring Boot de la IT Academy.
