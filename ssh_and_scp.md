# ssh : Secure Shell
- protocol used to securely connect to remote server
- Syntax:
   > ssh user_name@host

   - For Connecting to a specific port 
      > ssh -p {port_number} user_name@host 

   > Example : ssh raman.tayal@prd-ins-deploy101.fsins.az8

- For generating public-private keys ( as keys are more secure than passwords )
   > ssh-keygen

## Generating and Adding New SSH Key

1. Generate the SSH Key
    ```
    a. ssh-keygen -t ed25519 -C "your_email@example.com" \
    or this \
    b. ssh-keygen -t rsa -b 4096 -C "your_email@example.com" \
   ```

2. Now Add the SSH key
    > eval "$(ssh-agent -s)" \
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