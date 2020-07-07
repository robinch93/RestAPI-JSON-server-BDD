# RestAPI-JSON-server-BDD
This project is implementation of running a JSON server on local machine which allows to create json file and modify the schema and value by choice. Further, BDD Cucumber and non-BDD framework based test cases are written for the local API created. 

**Prerequisite**

- RestAssured 
- Cucumber
- Maven
- npm JSON server

**BUILD**

1. open cmd and run - npm install json-server
2. creat db.json file in project directory
3. cd to project directory and run cmd - json-server
3. run cmd - json-server ./db.json
4. Access - http://localhost:3000/ - in browser with different endpoints 
   available according to schema made in db.json file. 
   Example: http://localhost:3000/posts
            http://localhost:3000/comments
            http://localhost:3000/profile
            http://localhost:3000/address

**RUN**

Right Click [TestRunner.java](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/java/Runner/TestRunner.java) - Run As - JUnit Test

Few Scenarios in [Feature File](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/java/features/GetPostFeature.feature) are executed using BDD style methods while other using non BDD style:

- [BDD style Methods](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/java/stepDef/BDDstyleMethod.java)

- [Non-BDD style Methods](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/java/nonBDD/RestAssuredExtension.java)










