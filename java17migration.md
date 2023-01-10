1. "var" keyword

    ```
    // java 8 way
    Map<String, List<MyDtoType>> myMap = new HashMap<String, List<MyDtoType>>();
    List<MyDomainObjectWithLongName> myList = aDelegate.fetchDomainObjects();
    // java 10 way
    var myMap = new HashMap<String, List<MyDtoType>>();
    var myList = aDelegate.fetchDomainObjects()
    ```

    Note : Unfortunately, it is not possible to assign a lambda to a variable using var keyword

2. JSON using a text block

    ```
    class TextBlock { 
      public static void main(String args[]) {
        String json = """
            {
            "animal" : "Quokka",
            "link" : "https://en.wikipedia.org/wiki/Quokka"
            }
            """;
        
            System.out.println(json);
        }
    }
    ```