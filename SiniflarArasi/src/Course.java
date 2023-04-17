public class Course {
    private String courseName;
    private String courseCode;
    private Instructor instructor;

    public Course(String courseCode, String courseName, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName(String courseName) {
        return this.courseName = courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode(String courseCode) {
        return this.courseCode = courseCode;

    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public double calcAvarage(Student[] students) {
        double avarage = 0.0;
        for (int i = 0; i < students.length; i++) {
            avarage += students[i].getNote();
        }
        return avarage / students.length;

    }
}
