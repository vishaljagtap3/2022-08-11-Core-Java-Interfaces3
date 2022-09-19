public class Student {
    private int roll;
    private String name;
    private float marks;

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class StudentComparatorByMarksAsc implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Student s1 = (Student) obj1;
        Student s2 = (Student) obj2;

        if(s1.getMarks() == s2.getMarks()) {
            return 0;
        }

        if(s1.getMarks() > s2.getMarks()) {
            return 1;
        }

        return -1;
    }
}

class StudentComparatorByMarksDesc implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Student s1 = (Student) obj1;
        Student s2 = (Student) obj2;

        if(s1.getMarks() == s2.getMarks()) {
            return 0;
        }

        if(s1.getMarks() < s2.getMarks()) {
            return 1;
        }

        return -1;
    }
}

class StudentComparatorByRollAsc implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Student s1 = (Student) obj1;
        Student s2 = (Student) obj2;

        if(s1.getRoll() == s2.getRoll()) {
            return 0;
        }

        if(s1.getRoll() > s2.getRoll()) {
            return 1;
        }

        return -1;
    }
}
