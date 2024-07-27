<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Spring Boot DTO Project</h1>
    <p>This project is a Spring Boot application that demonstrates the use of Data Transfer Objects (DTOs) to transfer data between the client and server. It includes the basic CRUD operations for <code>Student</code> and <code>Course</code> entities and uses <code>ModelMapper</code> for entity-to-DTO conversion.</p>
    <h2>Role of ModelMapper</h2>
    <p>ModelMapper is a Java library that simplifies the process of mapping objects from one type to another, typically used to convert entities to DTOs and vice versa. Here’s a detailed explanation of its role:</p>
    <h3>Object Mapping</h3>
    <p>ModelMapper helps in converting complex objects to simpler ones. In a typical web application, you might have entities representing the data model and DTOs (Data Transfer Objects) that represent the data you want to expose via your API. ModelMapper automates the conversion process, reducing boilerplate code.</p>
    <h3>Reducing Boilerplate Code</h3>
    <p>Without ModelMapper, you would need to write a lot of repetitive code to manually copy properties from one object to another. ModelMapper abstracts this process and significantly reduces the amount of code needed for such transformations.</p>
    <h3>Handling Complex Mappings</h3>
    <p>ModelMapper can handle complex mappings, such as nested objects, collections, and different naming conventions between source and destination objects. It provides fine-grained control over how properties are mapped.</p>
    <h3>Configuration and Customization</h3>
    <p>ModelMapper allows you to configure and customize mappings. You can define specific property mappings, skip certain properties, and apply custom converters
