package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), klass.getDisplayName());
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == klass.getNumber()) {
            return String.format("%s I am a Teacher. I teach %s.", super.introduce(), student.getName());
        } else {
            return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), student.getName());
        }
    }
}
