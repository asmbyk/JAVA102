public class Course {
    private String courseName;
    private String code;
    private Intructor intructor;

    public Course(String  courseName, String code, Intructor intructor) {
        this.courseName = courseName;
        this.code = code;
        this.intructor = intructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double calcAvarange(Student[] students) {
        double Avarenge = 0;
        for (int i = 0; i < students.length; i++) {
            Avarenge = Avarenge + students[i].getNote();

        }
        return Avarenge / students.length;

    }

    public Intructor getIntructor() {
        return intructor;
    }

    public void setIntructor(Intructor intructor) {
        this.intructor = intructor;
    }
}
