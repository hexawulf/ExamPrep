package claudeAI2;

public class Person implements Comparable {

    private String name;

    // Constructor to create a Person with a name
    public Person(String name) {
        this.name = name;
    }

    // Getter method for name (optional but nice)
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Person) {
            Person otherPerson = (Person) obj;  // Cast Object to Person
            return this.name.compareTo(otherPerson.name);  // Compare names alphabetically
        } else {
            return 0; 
        }
    }
}
