# FlyAwayPortal

Pre requisites:
1. Maven should be installed.
2. Git should be installed.
3. Java 1.8 is required.
4. Tomcat 9 to be installed

Steps to run:
1. Change to filesystem/ folder where you want to download the github repo
   example: cd your-folder
2. Initialize git using below command,
   git init
3. Clone the repo from githu to your local using below command,
   git clone https://github.com/AshwinRanganath/FlyAwayPortal.git

4. Change directory to FlyAwayPortal from the current working directory. <br>
  cd FlyAwayPortal

5. Run maven package for generating the jar.
   mvn clean
   mvn install

6. The build should be a success. If the build is failing( reach out to me with the error and steps taken)

7. Change directory to target folder from the current working directory.
   cd target
   
8. Run ls command to check if the output war exists. If it does not exist then reach out to me with the error and steps taken.
   The jar Flywaway-0.0.1-SNAPSHOT.war will show up in target folder.

9. Deploy this war file in your webserver.

10.Follow the features of the application to navigate the application.

Note: The above steps will not work cause you need to create your own instance of mysql and create the required data.
