package practice11;

import java.util.HashSet;

public class Klass {
    private int number;
    private Student leader;
    private HashSet<Student> students = new HashSet<>();
    private HashSet<Teacher> teachers = new HashSet<>();

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
        teachers.stream().filter(t -> t.isTeaching(student)).forEach(t -> t.welcomeStudentJoinClass(student, this));
    }

    public void assignLeader(Student student) {
        if (isIn(student)) {
            this.leader = student;
            teachers.stream().filter(t -> t.isTeaching(student)).forEach(t -> t.welcomeStudentBecomeLeader(student, this));
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public boolean isIn(Student student) {
        if (students.contains(student)) {
            return true;
        }
        return false;
    }
}
