import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of String type
        ArrayList<String> obj = new ArrayList<String>();

        // Adding elements to the ArrayList
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

        // Displaying the current elements in the ArrayList
        System.out.println("Currently the array list has following elements:" + obj);

        // Adding elements at specific indexes
        obj.add(0, "Rahul");
        obj.add(1, "Justin");

        // Removing elements by object
        obj.remove("Chaitanya");
        obj.remove("Harry");

        // Displaying the ArrayList after deletions
        System.out.println("Current array list is:" + obj);

        // Removing element by index
        obj.remove(1);

        // Final state of the ArrayList
        System.out.println("Current array list is:" + obj);

        // Other ArrayList methods
       // Adding an element at the end of the ArrayList
obj.add("hello");
System.out.println("Added 'hello' at the end: " + obj);

// Adding an element at a specific index
obj.add(2, "bye");
System.out.println("Added 'bye' at index 2: " + obj);

// Setting a new value at a specific index
obj.set(2, "Tom");
System.out.println("Set 'Tom' at index 2: " + obj);

// Getting the element by index
String str = obj.get(2);
System.out.println("Element at index 2: " + str);

// Getting the size of the ArrayList
int numberOfItems = obj.size();
System.out.println("Number of items in the ArrayList: " + numberOfItems);

// Checking if the ArrayList contains a specific object
boolean containsSteve = obj.contains("Steve");
System.out.println("Does the ArrayList contain 'Steve'? " + containsSteve);

// Checking the index of a specific object
int pos = obj.indexOf("Tom");
System.out.println("Index of 'Tom': " + pos);

// Removing an element by object
obj.remove("Chaitanya");
System.out.println("Removed 'Chaitanya': " + obj);

// Removing an element by index
obj.remove(3);
System.out.println("Removed element at index 3: " + obj);

// Clearing all the elements from the ArrayList
obj.clear();
System.out.println("Cleared all elements: " + obj);

    }
}
