package practice08;

import javax.naming.directory.NoSuchAttributeException;

public class Klass {
    private int number;
    private Student student;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", getNumber());
    }

    public Student getLeader() throws NoSuchAttributeException {
        if (student != null) {
            return this.student;
        }
        throw new NoSuchAttributeException();
    }

    public void assignLeader(Student student) {
        this.student = student;
    }
}
