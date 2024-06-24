import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String name;

    private Course[] enrolledCourses;

    private int noOfCourses = 0;

    public Student(String name, Course[] enrolledCourses) {
        if (enrolledCourses.length > 5) throw new RuntimeException("Student can take only 5 courses");
        this.name = name;
        this.enrolledCourses = enrolledCourses;
        for (Course c : enrolledCourses) {
            if (c != null) this.noOfCourses++;
        }
    }

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new Course[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(Course[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public void addCourse(Course course) {
        if (noOfCourses == 5) throw new RuntimeException("Student can take only 5 courses");
        enrolledCourses[noOfCourses++] = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrolledCourses=" + Arrays.toString(Arrays.stream(enrolledCourses).filter(Objects::nonNull).toArray()) +
                ", noOfCourses=" + noOfCourses +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("John");
        Course engCourse = new Course("English Lit", 5);
        student.addCourse(engCourse);
        System.out.println(student);
    }
}
