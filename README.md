# Spring MVC Demo Application

This is a simple Spring MVC application that demonstrates how to create a basic web application using annotations.

## Overview
The application includes a HomeController that handles requests to the root URL ("/") and a ApplicationInitializer class for initializing the DispatcherServlet. The ApplicationConfiguration class configures the application and sets up the view resolver.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven
### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-mvc-annotation.git
```
2. Navigate to the project directory:
```bash
  cd spring-mvc-annotation
```
3. Build the project:
```bash
  mvn clean install
```
4. Deploy the WAR file to a Servlet container (e.g., Apache Tomcat).

5. Access the application at http://localhost:8080

### Usage
- he HomeController handles requests to the root URL ("/") and adds a message to the model.
- The JSP view (index.jsp) in the WEB-INF/views directory is used to render the response.


### Configuration
- The ApplicationConfiguration class configures the application and sets up the view resolver.
- The ApplicationInitializer class initializes the DispatcherServlet.

### Customization
- Modify the HomeController to handle different URLs or add more functionality.
- Update the view (index.jsp) to display different content or add additional pages.