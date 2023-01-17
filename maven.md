## Basic Commands

1. $ `mvn clean install`
2. `mvn dependency:tree`
    2.1 `mvn dependency:tree > sm.txt` 

3. `mvn dependency:tree -Dverbose`

4. Maven will only use one version of each artifact in the end -- it doesn't do any fancy classloader isolation tricks. You can see which version it'll use with
    > $ mvn dependency:resolve

5. Quality Check with Maven ( test case runs )
    > $ mvn clean install -U -Pquality_check

6. Deploying a docker Image using maven 
    > $ mvn deploy -U -DskipTests=true -Pdocker -T 5

7. Compiling Specific Module
    ![maven_compiling_specific_module.png](files%2Fmaven_compiling_specific_module.png)
  