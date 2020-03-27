package ca.ciccc;

public class Driver {
    public static void main(String[] args) {
        ALPriorityQueue<Integer, String> alpq = new ALPriorityQueue<>();
        alpq.enqueue(2, "Hello");
        alpq.enqueue(1, "Hi");
        alpq.enqueue(5, "Apple");
        alpq.enqueue(3, "Orange");
        alpq.enqueue(4, "Banana");
        alpq.enqueue(7, "Mango");

        while (!alpq.isEmpty()) {
            System.out.println(alpq.dequeueMin());
        }
    }
}
