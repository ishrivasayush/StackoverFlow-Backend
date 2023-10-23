# StackoverFlow-Backend

In this project, we have worked on developing REST API endpoints of various functionalities required for a stackoverflow website from scratch. In this project we can perform the Follwing Operations

### Question
- Add Question
  (http://localhost:8080/question/create)
- Delete Question
  (http://localhost:8080/question/delete/id)
- Update Question
  (http://localhost:8080/question/update/id)
- Add-tag
 (http://localhost:8080/question/add-tag/id)

  ![image](https://github.com/ishrivasayush/StackoverFlow-Backend/assets/103355440/2ee68fb6-511c-4cf6-bcd8-d9d6d9a8c687)


### Tag
- Add tag
  http://localhost:8080/tag/add

  ![image](https://github.com/ishrivasayush/StackoverFlow-Backend/assets/103355440/3cb3bd7f-781f-4ca9-b755-940c75b075e8)

- Remove tag
  http://localhost:8080/tag/remove

  ![image](https://github.com/ishrivasayush/StackoverFlow-Backend/assets/103355440/4aaf1dc7-8324-4641-b20e-c08c505e9298)


In order to observe the functionality of the endpoints, we have used the PostMan user interface and store the data in the Mysql database. Also, the project is implemented using Java Persistence API (JPA).


## ⚙️Technologies, Requirements and Software Tools
- Requirements listed below are for the **front-end and back-end**.
### Programming and Scripting Languages
- Java
- JSON

### Frameworks & Libraries
- Spring Boot - **Back-end**
### Other Software Tools
- **MySQLWorkbench** played a role where the **back-end** relied on this technology to **store user information**.
- **Postman** was used to **test PUT, GET, POST and DELETE requests to the database**.
  
## ✏️Design - Back-end
### Back-end Technology Stack
- **Java** served as the **back-end programming language** for the web application, while the **Spring Boot framework** was employed to **facilitate its development and operation**.
- **Spring Boot** was utilised to **create user models**, which were subsequently employed to **store employee information in the database**. The user models were established using the **Jakarta Persistence import** and **annotations**, including **@Entity, @Id, and @GeneratedValue**. This approach **facilitated the maintenance of the REST API**, making it more manageable and easier to maintain in the long run.
- **MySQL Workbench and DataGrip** were employed to **store employee information**. The **back-end**, developed with **Spring Boot**, was **configured to connect with the database**, while the **front-end**, built with **React**, was responsible for **retrieving and displaying** this information.
- **Spring Boot** was additionally utilised to **create custom exceptions**, specifically designed for **handling scenarios where the user ID was not found or encountered other exceptional conditions**.


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
