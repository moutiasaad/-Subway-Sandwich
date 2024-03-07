# Subway Sandwich Truck Order Management System

## Technical Description
The Subway Sandwich Truck Order Management System is a web-based application designed to streamline the process of managing sandwich orders for a food truck. It allows users to view available ingredients, place orders, and enables admins to access sales statistics. The application is built using Java with Spring Boot, Spring Security for authentication and authorization, and PostgreSQL for data storage.

## Build Instructions
To build the Spring Boot application, use Maven:
mvn clean package
To create a Docker image for the application, use the provided Dockerfile:
docker build -t subway-sandwich .

## Run Instructions
To run the Spring Boot application locally, use the following command:
java -jar target/subway_sandwich-0.0.1-SNAPSHOT.jar
To run the application as a Docker container, use the following command:
docker run -p 8080:8080 subway-sandwich

## Usage Instructions
### Endpoints Available:
- **View Ingredients**: `/ingredients` - GET endpoint to view the list of available ingredients, their prices, and quantities.
- **Place Orders**: `/orders` - POST endpoint to place orders for sandwiches by specifying the ingredients and quantity for each sandwich.
- **Access Statistics**: `/statistics` - GET endpoint to access statistics on best-selling ingredients, number of sandwiches sold, and profit for a specific day.

### How to Interact with the Application:
1. Access the `/ingredients` endpoint to view available ingredients.
2. Use the `/orders` endpoint to place orders by sending a POST request with the required parameters.
3. Admins can access sales statistics using the `/statistics` endpoint.

## Optional Features
### Kafka Integration:
If Kafka integration is enabled, a producer continuously sends sandwich orders to a Kafka topic, and a consumer consumes the orders, validates them against available ingredients, calculates the total cost, and stores the validated orders.

### Elasticsearch Integration:
With Elasticsearch integration, advanced search queries can be performed, such as ranking the ingredients based on popularity or sales performance during a specific time frame.

## Deployment Instructions
To deploy the application to a cloud platform like AWS, Azure, or Google Cloud Platform, follow the platform-specific deployment instructions and ensure that the necessary configurations for Spring Boot, Spring Security, and PostgreSQL are set up correctly.


Feel free to copy and use this README content for your project. Adjust the content as needed based on your specific project requirements.