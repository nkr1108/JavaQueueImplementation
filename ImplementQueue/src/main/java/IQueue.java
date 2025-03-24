public interface IQueue {
    boolean enqueue(Employee e);
    Employee dequeue();
    void printQueue();
}
