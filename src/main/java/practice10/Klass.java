package practice10;

import java.util.HashSet;

public class Klass {
    private int number;
    private Student leader;
    private HashSet<Student> students = new HashSet<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return String.format("Class %d", getNumber());
    }

    public void appendMember(Student student) {
        students.add(student);
    }

    public void assignLeader(Student student) {
        if (isIn(student)) {
            this.leader = student;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public boolean isIn(Student student) {
        if (student.getKlass().equals(this)) {
            return true;
        }
        return false;
    }
}
