# Receipt Book - https://recipe-book-be-production.up.railway.app/

This repository contains the source code for a web application called Receipt Book, which allows users to search for different food recipes by typing in keywords, and also provides a meal planner function. The front-end of the application is built using Angular, and the back-end is built using Spring Boot. Spring Security is used to handle user login and sign out using JWT tokens, and the data is stored in a MySQL database.

## Features

The main features of the Receipt Book application are:

- Search: Users can search for different food recipes by typing in keywords in the search bar. The search function returns a list of recipes that match the keyword, along with their details and instructions.
- Meal Planner: Users can plan their meals for the week by selecting the number of meals per day, dietary preferences, and calorie intake. The application generates a list of meals for the entire week based on these inputs.
- Login and Sign up: The login and sign up pages are straightforward, and users are required to log in to access the application's features.
- Profile: Users can save their favorite recipes in their profile, and these details will be added to the database. When the user logs in, they will have access to their saved recipes.

## Technology Stack

The Receipt Book application is built using the following technologies:

- Angular
- Spring Boot
- Spring Security
- JWT Tokens
- MySQL

## How to Run

To run the Receipt Book application, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the `receiptBook/client` directory.
3. Run `ng build` to build the Angular front-end application.
4. Copy all the files in the `dist` directory to the `src/main/resources/static` directory of the Spring Boot back-end application.
5. Open a new terminal window and navigate to the `receiptBook/server` directory.
6. Run `gradlew bootRun` to start the back-end server.
7. Open your web browser and go to `http://localhost:8080/` to access the Receipt Book application.

Note: Make sure you have MySQL installed and running, and update the database configuration in the `application.yml` file located in the `src/main/resources` directory of the Spring Boot back-end application.

## Summary

The Receipt Book application provides users with a convenient way to search for food recipes and plan their meals for the week. It is built using a modern technology stack, making it highly scalable and customizable. Please feel free to contribute to the project by submitting pull requests or opening issues.
