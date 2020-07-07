# RestAPI-JSON-server-BDD
This project is implementation of running a JSON server on local machine which allows to create json file and modify the schema and value by choice. Further, BDD Cucumber and non-BDD framework based test cases are written for the local API created with different Endpoints. 

**Prerequisite**

- RestAssured 
- Cucumber 
- Maven
- npm JSON server

**BUILD**

1. open cmd and run - npm install json-server
2. creat [db.json](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/resources/db.json) file in project directory
3. cd to project directory and run cmd - json-server
3. run cmd - json-server ./db.json
4. All the endpoints available will be shown under Resources <br/>
   which can be accessed with base url - http://localhost:3000/
   
**RUN**

Right Click [TestRunner.java](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/java/Runner/TestRunner.java) - Run As - JUnit Test

Few Scenarios in [Feature File](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/java/features/GetPostFeature.feature) are executed using BDD style methods while other using non BDD style:

- [BDD style Methods](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/java/stepDef/BDDstyleMethod.java)

- [Non-BDD style Methods](https://github.com/robinch93/RestAPI-JSON-server-BDD/blob/master/RestAssured_Gherkin/src/test/java/nonBDD/RestAssuredExtension.java)










