## Basic Commands

> 1. mvn clean install
> 2. mvn dependency:tree 
> 3. mvn dependency:tree -Dverbose

4. Maven will only use one version of each artifact in the end -- it doesn't do any fancy classloader isolation tricks. You can see which version it'll use with
> $ mvn dependency:resolve
