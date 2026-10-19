import java.util.HashMap;
public class hashTable{
    public static void main(String[] args) {

        // 1. Create a HashMap (Java's hash table)
        HashMap<String, Integer> hashTable = new HashMap<>();

        // 2. Insert key-value pairs
        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("grape", 30);

        // 3. Retrieve values using keys
        System.out.println("apple: " + hashTable.get("apple"));
        System.out.println("banana: " + hashTable.get("banana"));

        // 4. Check if a key exists
        if (hashTable.containsKey("cherry")) {
            System.out.println("cherry: " + hashTable.get("cherry"));
        } else {
            System.out.println("cherry not found!");
        }

        // 5. Remove a key-value pair
        hashTable.remove("grape");

        // 6. Display the entire hash table
        System.out.println("Hash table contents: " + hashTable);
    }
}