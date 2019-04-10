package practice09;

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
        if (this.equals(klass.getLeader())) {
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        }
        return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
    }
}
