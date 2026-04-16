# Skill 9 - Global Exception Handling

## Objective
Implement centralized exception handling in Spring Boot using @ControllerAdvice and custom exceptions.

## Clean folder structure
- src/main/java/com/klu/globalexception
  - controller/StudentController.java
  - service/StudentService.java
  - model/Student.java
  - model/ErrorResponse.java
  - exception/StudentNotFoundException.java
  - exception/InvalidInputException.java
  - exception/GlobalExceptionHandler.java
  - Skill9Application.java
- src/main/resources/application.properties
- pom.xml

## Required dependencies (pom.xml)
- spring-boot-starter-web

## Step-by-step implementation
1. Create Student and ErrorResponse models.
2. Create custom exceptions.
3. Create StudentService with input checks.
4. Create StudentController endpoint.
5. Handle exceptions globally via @ControllerAdvice.

## Complete code (necessary files)
- controller/StudentController.java
- service/StudentService.java
- exception/GlobalExceptionHandler.java
- model/ErrorResponse.java

## How to run
1. cd 2400031520_FSAD_SKILL_09
2. ./mvnw spring-boot:run

## Sample API endpoints
- GET /students/101
- GET /students/0
- GET /students/999

## Expected output
Valid id returns student JSON; invalid and not-found ids return structured error JSON.
