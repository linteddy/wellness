# wellness
* A wellness app for storing patient results and display high risk patients.
  * The system has two users
    * A capture and a admin user can capture a patient result.
    * Only the admin can see high risk patient
  * A High risk patient
    * BMI greater than 30
    * Systolic blood pressure > 140 and Diastolic blood pressure > 90.
***

## PREREQUISITES TO BUILD AND RUN :
* Install java jdk 1.8+
* Install Angular
* Install maven

***

## RUN INSTRUCTIONS
* ### RUN SPRING-BOOT PROJECT
  * `cd server`
  * `mvn spring-boot:run`
* ### RUN ANGULAR PROJECT(To be implemeted)
  * `cd ui`
  * `ng serve --o`
