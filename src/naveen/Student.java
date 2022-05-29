package naveen;

public class Student {

    private String name;
    private double marks;
    private int age;

    public Student(String name, double marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
