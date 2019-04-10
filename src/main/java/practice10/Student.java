package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.equals(klass.getLeader())) {
            return String.format("%s I am a Student. I am Leader of %s.", super.introduce(), klass.getDisplayName());
        }
        return String.format("%s I am a Student. I am at %s.", super.introduce(), klass.getDisplayName());
    }
}
