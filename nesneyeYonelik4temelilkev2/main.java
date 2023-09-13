public class main {
    public static void main(String[] args) {
        Student s1  = new Student("ahmet","asım","123","ankara",95);
        Student s2 = new Student("mehmet","bıyıklı","125","istanbul",95);
        Student s3 = new Student( "yusuf","tayyip ","124","trabzon",95);
        Intructor teacher = new Intruc tor("mehmet", "baykara","Computer teacher");
        Course mat = new Course("mat101", "2313",teacher);
        System.out.println(s1.getNote());

        System.out.println(s2.getNote()); // kosul verdik getter ve steer metotlarıyla kontrol ettik .
        Student []stu = {s1,s2,s3};
        System.out.println( mat.getCourseName() +"ortalama ;"  + mat.calcAvarange(stu));
    }
}
