# JSP + Servlet Spring Boot Demo

This project demonstrates how to set up a simple JSP-based web application using Spring Boot with Servlet support. The application allows users to submit an email via a form, which is then displayed back on a success page.

## Requirements

- **Java 17** (or newer)
- **Maven**
- **IDE** (e.g., IntelliJ IDEA, Eclipse)
- **Tomcat** (embedded with Spring Boot)

## Steps to Run the Application

1. **Clone the Repository** (if applicable):
    ```bash
    git clone https://your-repository-url.git
    cd JSPServletSpringBootDemo
    ```

2. **Build and Run the Application**:

    - Using Maven from the command line:
      ```bash
      mvn spring-boot:run
      ```

    - Alternatively, if you're using an IDE (e.g., IntelliJ IDEA):
        - Open the project in your IDE.
        - Run the `JspServletSpringBootDemoApplication` class as a Spring Boot application.

3. **Access the Application**:
    - Open your browser and navigate to [http://localhost:8080](http://localhost:8080).
    - This will load the **Email Form** page.

## URLs and Functionality

### 1. **Email Form Page**

- **URL**: [http://localhost:8080/](http://localhost:8080/)
- **Description**: This page displays a simple form where users can enter their email and a message. When submitted, the form data is sent to the server.

### 2. **Form Submission Success Page**

- **URL**: After submitting the form at `/submitEmail`, you will be redirected to a page displaying the submitted email and message.
- **Description**: Upon submitting the form, the server will return the email and message entered by the user on a success page.

## Dependencies

- **Spring Boot Starter Web**: To create the web application and run it with an embedded Tomcat server.
- **Tomcat Jasper**: For JSP support in Spring Boot.
- **Jakarta Servlet API**: For servlet support.

## Configuration

- **JSP Location**: `src/main/webapp/WEB-INF/views/`
    - `emailForm.jsp` - Displays the form.
    - `success.jsp` - Displays the submitted data.

- **Spring MVC View Resolver Configuration**:
    - The application is configured to look for JSPs in `/WEB-INF/views/` with a `.jsp` suffix. This is automatically handled by Spring Boot.
