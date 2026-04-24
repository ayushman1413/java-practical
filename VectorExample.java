import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.addElement("Date"); 

        System.out.println("Initial Vector: " + fruits);
        fruits.set(1, "Blueberry"); 
        System.out.println("After update: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First element: " + firstFruit);
        fruits.remove(2); 
        fruits.remove("Date");
        System.out.println("After removal: " + fruits);
        System.out.println("Final size: " + fruits.size());
        System.out.println("Is Vector empty? " + fruits.isEmpty());
    }
}
