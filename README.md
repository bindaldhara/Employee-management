Here I have used React as frontend and Java Spring Boot as backend. For styling I had used Tailwind.
For more information about Tailwind refer to its documentation.

# Getting Started with Create React App
This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts
In the project directory, you can run:
### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run eject`

**Note: this is a one-way operation. Once you `eject`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you're on your own.

You don't have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature. However we understand that this tool wouldn't be useful if you couldn't customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### The Hooks which I used here are as follows:
a) useState()<br>
b) useEffect()

## SpringMVC-RESTful-Web-Services

<img src="images/spring-logo.png"  height="200" >

## Documentation

To connect the API with your database you need change the application.properties file.<br>
Here I have used H2 database . For more information read the documentation here. [Documnetation](https://www.baeldung.com/spring-boot-h2-database)

### application.properties file

1. Change the file according to your neeed

```
spring.datasource.username= <Your database username here>

spring.datasource.password= <Your database password here>

spring.datasource.url= <your databse url here> 

```
### The folder structure should as follows:
com
 +- packagename
     +- projectname
         +- Application.java
         |
         +- models
         |   +- Employer.java
         |   += Example.java
         |
         +- controllers
         |   +- EmployeeController.java
         |   +- ExampleController.java
         |
         +- services
         |    +- EmployeeService.java
         |    +- ExampleService.java
         |
         +- repositories
         |    +- EmployeeRepository.java
         |    +- ExampleRepository.java   
         |
         +- configs
         |
         +- utils

### Spring Boot Flow Architecture:
<img src="images/spring-boot-architecture.png"  height="200" >

### The basic functionalities of the API :

In the EmployeeController.java [POST, GET, UPDATE, DELETE] functions are available.<br>

#### To Run the application you need to install maven and run the given command below:

Run the command where you have downloaded the repository.

```
install mvn
```
Then
```
spring-boot:run
```
#### To test the API use postman.




###### Developed with ❤️ by Dhara
