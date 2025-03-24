import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final int QUEUE_CAPACITY = 10;

        // Create queue implementations
        FixedFrontQueue fixedQueue = new FixedFrontQueue(QUEUE_CAPACITY);
        FloatingFrontQueue floatingQueue = new FloatingFrontQueue(QUEUE_CAPACITY);

        System.out.println("Fixed Front Queue:");
        processQueue(fixedQueue);

        System.out.println("\nFloating Front Queue:");
        processQueue(floatingQueue);
    }

    private static void processQueue(IQueue queue) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/data/emp.txt"))) {
            String line;
            int count = 0;

            // Enqueue first 5 employees
            while (count < 5 && (line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                Employee emp = new Employee(parts[0] + " " + parts[1], parts[2]);
                queue.enqueue(emp);
                count++;
            }
            System.out.println("After enqueueing 5 employees:");
            queue.printQueue();

            // Dequeue twice
            queue.dequeue();
            queue.dequeue();
            System.out.println("After dequeueing twice:");
            queue.printQueue();

            // Enqueue next 2 employees
            count = 0;
            while (count < 2 && (line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                Employee emp = new Employee(parts[0] + " " + parts[1], parts[2]);
                queue.enqueue(emp);
                count++;
            }
            System.out.println("After enqueueing 2 more employees:");
            queue.printQueue();

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
