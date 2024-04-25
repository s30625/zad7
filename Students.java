import java.util.ArrayList;

public class Students {

    public static ArrayList<Student> students = new ArrayList<>();

    public Students() {
        students = new ArrayList<Student>();
    }

    public static void promoteAllStudents() {
        for(Student s: students){
            if(s.getStatus() == StudentStatus.STUDENT) {
                int failedSubjects =0;
                for(Grade g: s.getGrades()) {
                    if(g.getValue() <3) {
                        failedSubjects++;
                    }
                }
                if(failedSubjects < s.getStudyProgramme().getPossibleITNs()) {
                    s.addSemester();
                }
                if(s.getStudyProgramme().getSemesters() < s.getSemester()) {
                    s.setStatus(StudentStatus.GRADUATE);
                }
            }
        }
    }

    public static String generateIndexNumber() {
        StringBuilder sb = new StringBuilder();
        sb.append("S");
        sb.append(nextIndexNumber);
        nextIndexNumber++;
        return sb.toString();
    }

    public static void displayInfoAboutAllStudents() {
        System.out.println("Students: ");
        for(Student s: students) {
            System.out.println(s.toString());

        }
    }
    private static int nextIndexNumber = 1;

}
