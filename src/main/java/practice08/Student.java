package practice08;

import javax.naming.directory.NoSuchAttributeException;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        try {
            if (klass.getLeader().equals(this)) {
                return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
            }
        } catch (NoSuchAttributeException e) {
            return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
        }
        return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
    }
}
