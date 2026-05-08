class student {
    static String schoolName;

    public static void changeSchool() {
        schoolName = "Nalanda";
    }
}

public class OOPS {
    public static void main(String args[]) {
        student.schoolName = "LAS";
        System.out.println(student.schoolName);
    }
}