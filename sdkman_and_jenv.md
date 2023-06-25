# sdkman
1. what is sdkman!?
   - SDKMAN! is a tool to manage parallel versions of multiple SDKs, which SDKMAN! call “candidates”.
   - install sdkman!
     1. ```$ curl -s "https://get.sdkman.io" | bash``` 
     2. ```$ source "$HOME/.sdkman/bin/sdkman-init.sh"```
     3. ```$ sdk version```
   - list all sdk candidates 
     1. ```$ sdk list```

2. install and manage java versions
   - listing available java versions 
     - ```$ sdk list java```

   - install a java version 
     - ```$ sdk install java 14.0.2-zulu```

   - switching between Versions 
     - ```$ sdk use java 17.0.5-amzn ```
     - ```$ sdk default java 17.0.5-amzn```

   - Removing a version 
     - ```$ sdk uninstall java 14.0.1.j9-adpt```

   - Display the version in current use 
     - ```$ sdk current java```


# JENV 

1. Install jenv 
   1. install jenv 
      1. ```$ brew install jenv```
    
   2. verify install and paths change 
      1. $ jenv doctor 
      2. $ echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.zshrc 
      3. $ echo 'eval "$(jenv init -)"' >> ~/.zshrc
    
   3. add Java environments 
      1. ```$ jenv add /Users/raman.tayal/Library/Java/JavaVirtualMachˀines/corretto-1.8.0_342/Contents/Home \```
      2. ```$ jenv rehash (if JAVA_HOME isn't set in jenv doctor) \```
      3. ```$ exec $SHELL -l (if JAVA_HOME isn't set in jenv doctor)```
    
   4. Link managed JDKs 
      1. Configure global version 
         1. ```$ jenv global 1.8```

2. Configure local version (per directory)
   1. ```$ jenv local 1.8```

3. Configure shell instance version 
   1. ```$ jenv shell 18```
   
4. Java Home Paths 
   1.  Use command on a terminal shell to figure out where is your Java 1.8 home directory
      ``` $ /usr/libexec/java_home -v 1.8 ```
   2. If you just want to find out the home directory of your most recent version of Java, omit the version.
      ``` $ /usr/libexec/java_home ```


Note : Every new mac uses zsh \
Documentation Link : https://www.jenv.be