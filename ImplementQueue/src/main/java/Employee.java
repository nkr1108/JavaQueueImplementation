public class Employee {
    private String name;
    private String id; // Using String for ID to handle both int and String formats

    // Constructor
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [Name=" + name + ", ID=" + id + "]";
    }
}
