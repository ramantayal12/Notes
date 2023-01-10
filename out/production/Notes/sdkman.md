## 1. What Is SDKMAN!?

SDKMAN! is a tool to manage parallel versions of multiple SDKs, which SDKMAN! call “candidates”.

### 1.1 Install SDKMAN!
> $ curl -s "https://get.sdkman.io" | bash

> $ source "$HOME/.sdkman/bin/sdkman-init.sh"

> $ sdk version

### 1.2 List All SDK Candidates

> $ sdk list

## 2. Install and Manage Java Versions

### 2.1 Listing Available Java Versions
> $ sdk list java

### 2.2 Install a Java Version
> $ sdk install java 14.0.2-zulu

### 2.3 Switching Between Versions

> $ sdk use java 17.0.5-amzn

> $ sdk default java 17.0.5-amzn

### 2.4 Removing a version

> $ sdk uninstall java 14.0.1.j9-adpt

### 2.5 Display the version in current use 
> sdk current java


