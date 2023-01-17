## grep command 

### 1. Common Usage of 'grep'
- basic string search 
    > grep 'linux' input.txt

- case in-sensitive string search ( -i )
    > grep -i 'linux' input.txt

- whole word search ( -w ) : will search for whole 'is' and not words like 'this'
    > grep -w 'is' input.txt

- Displaying the count of number of matches ( -c )
    > grep -c 'linux' input.txt

### 2. Advanced 'grep' usage
- Inverting the Search : can use grep to search lines that don’t contain a certain pattern.
    > grep -v '[0-9]' input.txt

     [0-9] in the above example is a regex that matches on a single numerical digit.

## tail
The tail command is frequently used to monitor log files.

1. basic structure
    > <some_command> | tail

    > tail -version 
   
2. -n num : prints the last 'num' lines from the file specified
    > tail -3 input.txt

3. -c num : prints the last ‘num’ bytes from the file specified
    > tail -c -6 state.txt

