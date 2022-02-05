# Stocks_Management


Stock Management service provides an abstraction layer on top of common stocks management database. 

**Prerequisites:**
1. Java 1.8 
2. Maven 3.8.4 and above
3. use git bash or command prompt to run the below commands to build the application
4. Install Mysql Server from https://dev.mysql.com/downloads/installer/
5. Install Mysql before building the application 

**How to build**

Local environment: **_maven build - non-docker_**
1. git clone https://github.com/Bhargavi1410/stocks-management.git
2. cd stocks-management
3. mvn clean install
4. To start local instance, run the following command:
mvn spring-boot:run
The service will listen on port 8080

**_Swagger URL to test the APIS:_**  http://localhost:8080/swagger-ui/index.html


