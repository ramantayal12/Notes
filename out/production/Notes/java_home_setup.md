

a. finding path of java_home 
> $ /usr/libexec/java_home -v 1.8

b. Export Java Home
> $ export JAVA_HOME="path_to_java_home" \
> $ export JAVA_HOME="/Users/raman.tayal/Library/Java/JavaVirtualMachines/corretto-1.8.0_352/Contents/Home"

c. checking certificates 
> keytool -list -keystore $JAVA_HOME/jre/lib/security/cacerts
password is "changeit"

c. adding certificates 
> keytool -import -alias stage_aerospike -keystore $JAVA_HOME/jre/lib/security/cacerts -file ~/PhonePe/visana/visana-server/certs/stage_aerospike_cert.pem
