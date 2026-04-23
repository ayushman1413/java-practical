import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        System.out.println("Vector after adding elements: " + fruits);
        fruits.remove("Banana");
        fruits.remove(0);
        System.out.println("Vector after removing elements: " + fruits);
        System.out.println("Displaying elements using a loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Size of vector: " + fruits.size());
        System.out.println("Element at index 0: " + fruits.get(0));
    }
}