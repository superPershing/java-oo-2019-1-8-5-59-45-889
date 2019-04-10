package practice11;

import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        this.classes.forEach(aClass -> aClass.appendTeacher(this));
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if (classes.isEmpty()) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), classes.stream().map(i -> Integer.toString(i.getNumber())).collect(Collectors.joining(", ")));
    }

    public boolean isTeaching(Student student) {
        Predicate<Klass> p = klass -> klass.isIn(student);
        if (this.classes.stream().anyMatch(p)) {
            return true;
        }
        return false;
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public void welcomeStudentJoinClass(Student student, Klass klass) {
        System.out.println("I am " + getName() + ". I know " + student.getName() + " has joined " + klass.getDisplayName() + ".");
    }

    public void welcomeStudentBecomeLeader(Student student, Klass klass) {
        System.out.println("I am " + getName() + ". I know " + student.getName() + " become Leader of " + klass.getDisplayName() + ".");
    }
}
