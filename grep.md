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