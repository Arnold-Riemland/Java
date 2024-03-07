public class Student {
    private String firstName;
    private int course;

    Student() {
        firstName = "No name";
        course = 1;
    }

    Student(String firstName, int course) {
        this.firstName = firstName;
        this.course = course;
    }

    int getCourse() {
        return course;
    }

    String getFirstName() {
        return firstName;
    }

    void setCourse(int course) {
        this.course = course;
    }
}