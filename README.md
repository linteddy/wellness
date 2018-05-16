# WELLNESS
* A website for capturing patient results and displaying high risk patients.
  * The system has two users
    * A capturer and an admin user can capture patient result.
    * Only the admin can see high risk patients
  * A High risk patient
    * BMI greater than 30 or
    * Systolic blood pressure > 140 and Diastolic blood pressure > 90.
***

## PREREQUISITES TO BUILD AND RUN :
* Install java jdk 1.8+
* Install Angular 6
* Install maven

***

## RUN INSTRUCTIONS
* ### RUN SPRING-BOOT PROJECT
  * `cd server`
  * `mvn spring-boot:run`
* ### RUN ANGULAR PROJECT
  * `cd ui`
  * `ng serve --o`
  
## DEFAULT USERS LOGIN DETAILS
* ### ADMIN
  * username : admin
  * password : password
* ### CAPTURER
  * username : capturer
  * password : password
