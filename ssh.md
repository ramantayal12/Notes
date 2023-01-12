## Generating and Adding New SSH Key

1. Generate the SSH Key
    ```
    a. ssh-keygen -t ed25519 -C "your_email@example.com" \
    or this \
    b. ssh-keygen -t rsa -b 4096 -C "your_email@example.com" \
   ```

2. Now Add the SSH key
    > eval "$(ssh-agent -s)" \
3. $ ssh-add -K /Users/you/.ssh/id_rsa   