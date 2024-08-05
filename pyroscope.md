# pyrroscope

- Pyroscope is an open-source continuous profiling platform that can help you monitor the performance of your applications.

- To integrate Pyroscope with a Spring Boot application, follow these steps:
  - Step 1: Install Pyroscope Server Using Homebrew
    - Add the Pyroscope tap:
      - `brew tap pyroscope-io/brew`
    - Install Pyroscope:
      - `brew install pyroscope`
    - Start the Pyroscope server:
      - `pyroscope server`
    - Verify the server is running:
      - Open your browser and navigate to http://localhost:4040 to access the Pyroscope web interface.

  - Step 2: Integrate Pyroscope with Spring Boot 
    - Add Pyroscope dependencies:
        ```xml
        <dependency>
            <groupId>io.pyroscope</groupId>
            <artifactId>pyroscope-java-agent</artifactId>
            <version>0.5.0</version>
        </dependency>
      ```

    - Modify JVM Options:
      - Add the following JVM options to your Spring Boot application's startup script or application.properties file to enable the Pyroscope agent.
        - If using an environment variable for JVM options:
          - `JAVA_OPTS="-javaagent:/path/to/pyroscope-javaagent.jar"`

        - If using application.properties:
          - `spring-boot.run.jvmArguments=-javaagent:/path/to/pyroscope-javaagent.jar`
            - Ensure to replace /path/to/pyroscope-javaagent.jar with the actual path to the Pyroscope Java agent JAR file.