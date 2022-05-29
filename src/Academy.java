import java.util.Map;
import java.util.TreeMap;

public class Academy {
    String academyName;
    private Map<String, Student> students = new TreeMap<>();
    public static String toString;

    public Academy(String academyName) {
        this.academyName = academyName;
    }

    public void addStudent(Student st) {
        // Check if we already have a student
        if (!this.students.containsKey(st.studentNumber)) {
            if (st.academy == null) {
                this.students.put(st.studentNumber, st);
            }
            st.addAcademy(this);
        }
    }

    @Override
    public String toString() {
        toString = "Academy: " + academyName + " has students: [ ";
        students.values().forEach(s -> {
            toString += " | " + s.getName() + " | ";
        });
        return toString + " ]";
    }
}
