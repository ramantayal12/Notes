# ssh : Secure Shell

## ssh : connecting to remote server 
- protocol used to securely connect to remote server
  - Syntax:
    - ```ssh user_name@host```
    - ```ssh -i ~/.ssh/your_custom_name user@hostname```
    - When connecting to a remote server, you can specify the private key using the -i option of the ssh command:
    
    - For Connecting to a specific port 
        - ```ssh -p {port_number} user_name@host```
        - Example : ssh raman.tayal@prd-ins-deploy101.fsins.az8
    
    - Opens a SOCKS tunnel on the specified port number
        - ```ssh -D 9090 [USER]@[SERVER_IP]```


## ssh :generating and adding new ssh key

1. Generate the SSH Key
   - ```ssh-keygen``` 
   - this will create two keys in id_rsa(by default) one will be public and another one will be private, we need to add public key to github/remote_server and keep private key safe.

   - Creating with custom name 

   - ```ssh-keygen -t rsa -b 2048 -f ~/.ssh/your_custom_name``` 
   - -t rsa: Specifies the type of key to create (in this case, RSA).
   - -b 2048: Specifies the number of bits in the key (2048 is a common default).
   - -f ~/.ssh/your_custom_name: Specifies the file name for the key pair. Adjust the path and filename as needed.


2. Now Add the SSH key 
   - ```eval "$(ssh-agent -s)"```
   - ```$ ssh-add -K /Users/you/.ssh/id_rsa```

# scp : secure copy protocol

1. Transferring Files using SCP 
   - scp local_file_path username@remote:remote_location 
   - Example : scp VehicleIDV.py raman.tayal@prd-ins-deploy101.fsins.az8:~/oicl_pricing

2. Screen Command 
   1. For creating separate screen 
      - ```screen -S screen_name```

   2. For de-attaching the screen
      - ```(control + a + d)```

   3. For re-attaching the Screen 
      - ```screen -r screen_name```


# sha :  secure hash algorithm

The SHA-256 algorithm generates an almost unique, fixed-size 256-bit (32-byte) hash. This is a one-way function, so the result cannot be decrypted back to the original value.

- MessageDigest in Java
- Guava Library
- Apache Commons Codecs - Utility Class - ```DigestUtil```
- Bouncy Castle Library