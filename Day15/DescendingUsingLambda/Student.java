package syns.Day15;

public class Student {
    double GPA;
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "GPA="+GPA;
    }
}
