1. To Run Sonar on Local
      ```
        a. git clone https://github.com/SonarSource/docker-sonarqube
        b. cd docker-sonarqube/9/community
    
        #build
        c. docker build -t sonarqube-arm .
    
        #run
        d. docker run -d -p 9000:9000 sonarqube-arm
      ```

2. Sensitive Code 

   ```
   a. Random random = new Random(); // Sensitive use of Random 
   b. SecureRandom random = new SecureRandom(); // Compliant for security-sensitive use cases
   ```
   
3. 