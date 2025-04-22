package claudeAI;

public class Student {
    private String name;
    private int id;
    private double gpa;

    // Standard constructor (optional)
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.id = student.id;
        this.gpa = student.gpa;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
