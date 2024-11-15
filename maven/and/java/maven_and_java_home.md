# maven 
## Basic Commands

1. Compiling Project 
   - ```mvn clean install```
   
   - Compiling Project With library force Update 
     - ```mvn clean install -U``` 
   
   - Compiling Project Continue if one module files 
     - ```mvn clean install --fail-at-end```
   
2. For getting library dependencies
   - ``` mvn dependency:tree```
   - for printing it in a text file 
      - ```mvn dependency:tree > sm.txt```
   - for finding unused dependencies and dependecy conflicts
     - ``` mvn dependency: analyze```
   
   
3. The "-Dverbose" flag is used to enable verbose output, which provides additional details about the dependencies. With this flag, the command will display more information, such as the versions of each dependency, conflicts between dependencies, and where the dependencies are being used in your project. 
   - ```mvn dependency:tree -Dverbose```

4. Maven will only use one version of each artifact in the end -- it doesn't do any fancy classloader isolation tricks. You can see which version it'll use with 
   - ```mvn dependency:resolve```

5. Quality Check with Maven ( test case runs )
   - ```mvn clean install -U -Pquality_check```

6. Deploying a docker Image using maven 
   - ```mvn deploy -U -DskipTests=true -Pdocker -T 5```

7. Compiling Specific Module 
   - ```mvn clean install -U -DskipTests -rf :module_name```
   - ![maven_compiling_specific_module.png](files%2Fmaven_compiling_specific_module.png)


# java_home_setup
1. finding path of java_home 
   - ```$ /usr/libexec/java_home -v 1.8```

2. Export Java Home 
   - ```$ export JAVA_HOME="path_to_java_home" \```
   - ```$ export JAVA_HOME="/Users/raman.tayal/Library/Java/JavaVirtualMachines/corretto-1.8.0_352/Contents/Home"```

3. checking certificates
   - ```keytool -list -keystore $JAVA_HOME/jre/lib/security/cacerts```
     -  password is "changeit"

4. adding certificates
   -  ```keytool -import -alias stage_aerospike -keystore $JAVA_HOME/jre/lib/security/cacerts -file ~/PhonePe/visana/visana-server/certs/stage_aerospike_cert.pem```
