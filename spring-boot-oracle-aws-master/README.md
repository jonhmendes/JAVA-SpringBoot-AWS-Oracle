## Springboot with Amazon RDS

An example of using SpringBoot to quickly write a RESTful API to access Oracle database. Here we use AWS RDS, Amazon's relational database service in cloud.

### Steps to make the project run

#### Prereqsuite
1. Java 8
2. Maven
3. AWS account (it is free if you have credit card)
4. Oracle JDBC driver

#### Setup up of Oracle instance on AWS
1. Login to AWS Management [console](https://aws.amazon.com/) and go to CloudFormation service 
2. Create a new stack by uploading given script: create-oracle-micro-instance-aws.json
3. It will create new security group and new RDS instance with 2.micro tier won't incur any charge. 
4. Oracle database version is 12.1 and will be created with t2.micro instance which is free. 


#### Get Oracle JDBC Driver
1. Download the JDBC driver from Oracle [website](http://www.oracle.com/technetwork/database/features/jdbc/index-091264.html) and place it in directory `oracle-driver`
2. Create a local maven repository and load this driver jar into it.
3. `mvn install:install-file -Dfile=oracle-driver/ojdbc7.jar  -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0.2 -Dpackaging=jar`
4. If a different version from the one above was used adjust `build.gradle`

#### Run and test
1. `java -jar target/spring-boot-oracle-aws-1.0-SNAPSHOT.jar`
2. Browse the URL http://localhost:8080/posts to list all resources
3. Browse the URL, for example, http://localhost:8080/posts/1 (to get single resource)
