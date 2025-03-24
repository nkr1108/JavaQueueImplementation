public class FixedFrontQueue implements IQueue{
    private Employee[] queue;
    private int front;
    private int rear;
    private int capacity;

    public FixedFrontQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Employee[capacity];
        this.front = 0;
        this.rear = 0;
    }

    @Override
    public boolean enqueue(Employee e) {
        if (rear == capacity) {
            return false;
        }
        queue[rear++] = e;
        return true;
    }

    @Override
    public Employee dequeue() {
        if (front == rear) {
            return null;
        }
        return queue[front++];
    }

    @Override
    public void printQueue() {
        System.out.print("Fixed Front Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.println(queue[i] + " ");
        }
        // System.out.println();
    }
}
