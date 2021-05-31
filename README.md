## ap-csa-project
Simple Java JDBC project
* Environment: This was tested on a Mac

### Dependencies and pre-requisites
* Java11 JDK
  * https://download.java.net/java/GA/jdk12.0.2/e482c34c86bd4bf8b56c0b35558996b9/10/GPL/openjdk-12.0.2_osx-x64_bin.tar.gz
* Postgres10
  * https://formulae.brew.sh/formula/postgresql
* JDBC driver
  * https://jdbc.postgresql.org/download/postgresql-42.2.20.jar

### ADD DDL and DMLs in Postgres DB
* Make sure that PG DB DB_NAME is created and that PG instance is running.
* Add Table definition first using psql
  * psql -d DB_NAME -f student.ddl
* Add some data rows
  * psql -d DB_NAME -f student.dml
* Verify that records are present usings simple SQL
  * `select * from student;`
  
### How to compile?
````bash
##Set proper PATH and CLASSPATH
export PATH=/proper_path/jdk-11.0.2.jdk/Contents/Home/bin:$PATH:/usr/local/Cellar/postgresql@10/10.17/bin
export CLASSPATH=.:$CLASSPATH:/proper_path/jdbc-driver/postgresql-42.2.20.jar
##Compile as - It can be enhanced with Maven or Gradle build later
javac com/myrhs/Student.java
javac com/myrhs/SchoolMain.java

````

### How to run?
* Make sure that proper PATH and CLASSPATH is set.
* `java com.myrhs.SchoolMain`
