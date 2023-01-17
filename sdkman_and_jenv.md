# sdman
## 1. what Is sdkman!?

SDKMAN! is a tool to manage parallel versions of multiple SDKs, which SDKMAN! call “candidates”.

### 1.1 install sdkman!
    > $ curl -s "https://get.sdkman.io" | bash
    
    > $ source "$HOME/.sdkman/bin/sdkman-init.sh"
    
    > $ sdk version

### 1.2 list all sdk candidates

    > $ sdk list

## 2. install and manage java versions

### 2.1 listing available java versions
    > $ sdk list java

### 2.2 install a java version
    > $ sdk install java 14.0.2-zulu

### 2.3 switching between Versions

    > $ sdk use java 17.0.5-amzn
    
    > $ sdk default java 17.0.5-amzn

### 2.4 Removing a version

    > $ sdk uninstall java 14.0.1.j9-adpt

### 2.5 Display the version in current use
    > sdk current java


# JENV 

## 1. Install jenv 

a. install jenv
> $ brew install jenv

b. verify install and paths change
> $ jenv doctor

> $ echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.zshrc

> $ echo 'eval "$(jenv init -)"' >> ~/.zshrc

c. add Java environments 
> $ jenv add /Users/raman.tayal/Library/Java/JavaVirtualMachines/corretto-1.8.0_342/Contents/Home \

> $ jenv rehash (if JAVA_HOME isn't set in jenv doctor) \

> $ exec $SHELL -l (if JAVA_HOME isn't set in jenv doctor)

d. Link managed JDKs 
1. Configure global version
> $ jenv global 1.8

2. Configure local version (per directory)
> $ jenv local 1.8

3. Configure shell instance version
> $ jenv shell 18


Note : Every new mac uses zsh \
Documentation Link : https://www.jenv.be


## 2. Java Home Paths

a. Use command on a terminal shell to figure out where is your Java 1.8 home directory
> $ /usr/libexec/java_home -v 1.8

b. If you just want to find out the home directory of your most recent version of Java, omit the version.
> $ /usr/libexec/java_home