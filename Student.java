import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String name;
    private String surname;

    private String address;

    private String email;

    private String phoneNumber;

    private Date birthDate;
    private StudentStatus status;

    private StudyProgramme studyProgramme;

    private int semester;
    private ArrayList<Grade> grades;

    private String indexNumber;



    public Student(String name, String surname, String address, String email, String phoneNumber, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = StudentStatus.CANDIDATE;
        Students.students.add(this);
        this.indexNumber = Students.generateIndexNumber();
        this.grades = new ArrayList<Grade>();
    }

    public Student(String name, String surname, String address, String email, String phoneNumber, Date birthDate, StudentStatus status) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
        Students.students.add(this);
        this.grades = new ArrayList<Grade>();
    }


    public void enrollStudent(StudyProgramme it) {
        this.studyProgramme = it;
        this.semester = 1;
        this.status = StudentStatus.STUDENT;
    }

    public void enrollStudent(StudyProgramme it, int semester) {
        this.studyProgramme = it;
        this.semester = semester;
        this.status = StudentStatus.STUDENT;
    }

    public void addGrade(int value, String name) {
        this.grades.add(new Grade(value, name));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void addSemester() {
        this.semester++;
    }

    public void addSemester(int amount) {
        this.semester+=amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ");
        sb.append(this.indexNumber);
        sb.append(":");
        sb.append("\n");
        sb.append("Name: ");
        sb.append(this.name);
        sb.append("\n");
        sb.append("Surname: ");
        sb.append(this.surname);
        sb.append("\n");
        sb.append("Birth date: ");
        sb.append(this.birthDate);
        sb.append("\n");
        sb.append("Email: ");
        sb.append(this.email);
        sb.append("\n");
        sb.append("Address: ");
        sb.append(this.address);
        sb.append("\n");
        sb.append("Phone number: ");
        sb.append(this.phoneNumber);
        sb.append("\n");
        sb.append("Status: ");
        sb.append(this.status);
        sb.append("\n");
        sb.append("\n");
        if(this.studyProgramme != null) {
            sb.append(this.studyProgramme.toString());
        }
        if(this.semester != 0) {
            sb.append("Actual semester: ");
            sb.append(this.semester);
            sb.append("\n");
            sb.append("\n");
        }
        if(!this.grades.isEmpty()) {
            sb.append("Grades: ");
            sb.append("\n");
            sb.append("\n");
            for(Grade g: this.grades) {
                sb.append(g.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
