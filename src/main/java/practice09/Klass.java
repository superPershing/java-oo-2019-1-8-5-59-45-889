package practice09;

import java.util.ArrayList;

public class Klass {
    private int number;
    private ArrayList<Student> students = new ArrayList<>();
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() == number) {
            this.leader = student;
        }
        System.out.println("It is not one of us.");
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        students.add(student);
    }
}
