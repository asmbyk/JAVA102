public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("mustafa ", "cetinda ", "232", "varlıkmah", 55);
        Student st2 = new Student("mehmet", "yavuz ", "234242", "yenimahalle ", 45);
        Student st3 = new Student("ahmet ", "asım ", "234", "balgat", 90);
        System.out.println(st3.getNote());
        Instructor teach = new Instructor("mewehmet","hoca", "matematik ");
        Course mat = new Course("Mat101 ", "mat ", teach );

        Student[] stu = {st1, st2, st3};

        mat.calcAvarage(stu);
        System.out.println(mat.getInstructor().getName());
    }
}