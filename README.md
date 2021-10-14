# About the project
This is a simple REST API with one GET endpoint which takes text data as a request parameter and returns it in reverse order.

## Tech stack
- Spring Boot 2.5.5
- Java 11

## Building the project
Clone the project and use Maven to build the app.
```
$ mvn clean install
```

## Examples of use
After you deploy the application, open your browser and type
```
http://localhost:8080/reverse?inputData=EXAMPLE
```
where EXAMPLE is any textual data
