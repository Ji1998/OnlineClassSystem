# Online Class System
This project is a Coursera like online class project. It is seperated in back-end and front-end. There are two front-end web page for it, one is for admins and
the other is for normal users. The back-end is developed into microservice archetecture. 

## A overview of it
#### This is how the admin look like. It basically support:
* course, chapter,section and category create/delate/update/
* teacher information create/delate/update/
* iamge, video upload & play
* resource,role,user control
* sms admin & member admin
<h5></h5>
<img src="Screen Shot 2021-03-03 at 00.39.31.png" width="600"/>
<img src="Screen Shot 2021-03-03 at 00.41.00.png" width="600"/>

#### This is how the normal user front-end look like. It basically support:
* member register, forget password, login, enroll into class
* show latest course
* show course in different category
<h5></h5>
<img src="Screen Shot 2021-03-03 at 00.43.00.png" height="300" width="600"/>
<img src="Screen Shot 2021-03-03 at 00.43.21.png" width="600"/>
<img src="Screen Shot 2021-03-03 at 00.43.11.png" width="600"/>
<img src="Screen Shot 2021-03-03 at 00.44.05.png" width="600"/>

## Getting started
This is an example of how you may give instructions on setting up your project locally. To get a local copy up and running follow these simple example steps.
#### Prerequisites
1. Go to [Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html) to download the latest version of JDK
2. If you prefer, I highly recommend [IntelliJ](https://www.jetbrains.com/idea/) as it can help you build necessary environment
3. A [MySQL](https://www.mysql.com/) server runnning on your laptop
4. An [Alibaba](https://us.alibabacloud.com) OOS and VOD account
5. [Node.js and nmp modules](https://www.npmjs.com/) as for front end.

#### Install and Run
1. Once you have download all files and open them with intelliJ,simple open the back-end applications as Eureka->Gateway->System->Business->File
1. <img src="Screen Shot 2021-03-05 at 00.18.25.png" height="300" width="400"/>
2. Then right click package.json->show scripts under web and admin
2. <img src="Screen Shot 2021-03-05 at 00.19.01.png" height="300" width="400"/>
3. Bingo, then go to localhost:8080 for admin and localhost:8081 for normal front end
4. BTW, there is a admin user with name:test, password:test who has all resources. Use this one to login and create as more user as you want...

## Architecture of it
#### Basic Archetecture
This project is microservice like architecture. All service run on different server and registerd on Eureka. The service has different functions
* File Service: responsible for file upload to Alibaba Cloud and get VOD authentication from Alibaba
* System Service: responsible for admin user login and control of the whole online class system
* Business Service: responsible for deal with business logics 
* Gateway Service: responsible for check if the visit is leagle
* Controller: responsbible for direct REST service URL
* Front-end: responsible for show user-friendly pages
<img src="Screen Shot 2021-03-03 at 20.58.22.png" height="450" width="500"/>


#### Database Design
<img src="Screen Shot 2021-03-03 at 00.45.32.png" height="450" width="500"/>

#### User Login Logic
<img src="Screen Shot 2021-03-03 at 20.41.33.png" height="700" width="400"/>

#### File upload logic
<img src="Screen Shot 2021-03-03 at 20.38.50.png" height="600" width="400"/>

### Build With
* [MAVEN](https://maven.apache.org/install.html): Manage dependency
* [Spring Cloud](https://spring.io/projects/spring-cloud): For configuration of each micro service as Spring Boot application and for usage of Gateway
* [My Batis](https://mybatis.org/mybatis-3/): To build mapper for interact with database, and code generation and pagehelper
* [FreeMarker](https://freemarker.apache.org/): A template to use with My Batis generator to produce front-end, controller and service code
* [MySQL](https://www.mysql.com/): For the contruct of database system
* [Redis](https://redis.io/):For the purpose of save user login session 
* [Vue.js](https://vuejs.org/): Front end is built upon Vue.js

## Any Quesions?
* Email guangsen@usc.edu!











