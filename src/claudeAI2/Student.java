package claudeAI2;

public class Student {

private String name;
private String id;
private double gpa;


public Student() {
this.name = "Unknown";
this.id = "Unknown";
this.gpa = 0.00;
}


public Student(String name, String id, double gpa) {
this.name = name;
this.id = id;
this.gpa = gpa;
}


public Student(Student original) {
this.name = original.name;
this.id = original.id;
this.gpa = original.gpa;
}


@Override
public String toString()
{
	return "Student {name=" + name + ", id=" + id + ", gpa=" + gpa + "}";
}
}

