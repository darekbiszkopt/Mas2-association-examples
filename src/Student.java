public class Student {
    String name;
    String studentNumber;

    Academy academy;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return "name: " + name + " | index: " + studentNumber;
    }

    public void addAcademy(Academy academy) {
        if (this.academy == null) {
            this.academy = academy;
        } else {
            System.out.println("this " + name + " student currently has an academy: " + academy.academyName);
        }
    }
}
