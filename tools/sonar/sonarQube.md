1. To Run Sonar on Local
      ```agsl
        <>clone Repo
        a. git clone https://github.com/SonarSource/docker-sonarqube
        b. cd docker-sonarqube/9/community
    
        <>build
        c. docker build -t sonarqube-arm .
    
        <>run
        d. docker run -d -p 9000:9000 sonarqube-arm
      ```

      ```agsl
      a. brew services restart sonarqube
      ```

2. Sensitive Code 

   ```agsl
   a. Random random = new Random(); // Sensitive use of Random 
   b. SecureRandom random = new SecureRandom(); // Compliant for security-sensitive use cases
   ```
