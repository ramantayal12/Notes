# ssh : Secure Shell

## ssh : connecting to remote server 
- protocol used to securely connect to remote server
  - Syntax:
    ```ssh user_name@host```

    - For Connecting to a specific port 
         ```ssh -p {port_number} user_name@host```
        Example : ssh raman.tayal@prd-ins-deploy101.fsins.az8
    
    - Opens a SOCKS tunnel on the specified port number
        ```ssh -D 9090 [USER]@[SERVER_IP]```


## ssh :generating and adding new ssh key

1. Generate the SSH Key
    ```
   ssh-keygen
    ``` 
   this will create two keys in id_rsa(by default) one will be public and another one will be private, we need to add public key to github/remote_server and keep private key safe.

2. Now Add the SSH key
    > eval "$(ssh-agent -s)" 

3. ```$ ssh-add -K /Users/you/.ssh/id_rsa```

# scp : secure copy protocol

1. Transferring Files using SCP

   > scp local_file_path username@remote:remote_location

   Example : scp VehicleIDV.py raman.tayal@prd-ins-deploy101.fsins.az8:~/oicl_pricing

2. Screen Command

   a. For creating separate screen
   > screen -S screen_name

   b. For de-attaching the screen
   > (control + a + d)

   c. For re-attaching the Screen
   > screen -r screen_name