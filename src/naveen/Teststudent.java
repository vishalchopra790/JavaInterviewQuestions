package naveen;

import java.util.ArrayList;
import java.util.Objects;

public class Teststudent {
    public static void main(String[] args) {
        Student s1=new Student("Vishal",100,15);
        Student s2=new Student("Ashish",92,15);
        Student s3=new Student("Naveen",87,15);
        Student s4=new Student("Aman",43,15);
        Student s5=new Student("Awhan",79,15);

        ArrayList<Student> students=new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println(students);
        for(Student s:students)
            System.out.println(s);

        students.forEach(System.out::println);
        students.stream().filter(e->e.getMarks()>80).filter(f-> Objects.equals(f.getName(), "Vishal")).forEach(System.out::println);

       Double hm= students.stream().map(Student::getMarks).max(Double::compare).get();
        System.out.println(hm);
        students.stream().filter(e->e.getMarks()==hm).forEach(e-> System.out.println(e.getName()));

    }
}
